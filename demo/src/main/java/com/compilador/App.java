package com.compilador;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import org.antlr.v4.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App {
    public static void main(String[] args) throws IOException {
        ColorLogger.titulo("COMPILADOR MI LENGUAJE v1.0");
        
        try {
            // 1. Lectura del archivo de entrada
            ColorLogger.subtitulo("ANÁLISIS LÉXICO");
            CharStream input = CharStreams.fromFileName("demo/src/main/input/input.txt");
            
            // 2. Análisis léxico
            MiLenguajeLexer lexer = new MiLenguajeLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // *** AGREGAR: Generar tabla de tokens ***
            mostrarTablaTokens(tokens, lexer);
            ColorLogger.exito("Análisis lexico completado");
            
            // 3. Análisis sintáctico
            ColorLogger.subtitulo("ANALISIS SINTACTICO");
            MiLenguajeParser parser = new MiLenguajeParser(tokens);
            
            // Agregar listener de errores personalizado
            parser.removeErrorListeners();
            parser.addErrorListener(new ErrorListener());
            
            ParseTree tree = parser.program();
            
            // Mostrar el árbol sintáctico
            ColorLogger.info("Arbol sintactico generado:");
            System.out.println(tree.toStringTree(parser));
            ColorLogger.exito("Analisis sintáctico completado");

            // 4. Análisis semántico
            ColorLogger.subtitulo("ANALISIS SEMANTICO");
            SimbolosListener listener = new SimbolosListener();
            ParseTreeWalker.DEFAULT.walk(listener, tree);

            // 5. Revisión de errores semánticos
            List<String> errores = listener.getErrores();
            int contadorErrores = 0;
            int contadorWarnings = 0;
            
            if (!errores.isEmpty()) {
                ColorLogger.subtitulo("ERRORES ENCONTRADOS");
                for (String err : errores) {
                    if (err.toLowerCase().contains("warning")) {
                        ColorLogger.warning(err);
                        contadorWarnings++;
                    } else {
                        ColorLogger.error(err);
                        contadorErrores++;
                    }
                }
            } else {
                // 6. Imprimir la Tabla de Símbolos
                ColorLogger.subtitulo("TABLA DE SÍMBOLOS");
                listener.getTablaSimbolos().imprimir();
                ColorLogger.exito("Análisis semántico completado sin errores");
            }

            // 7. Generación de código intermedio (solo si no hay errores críticos)
            if (contadorErrores == 0) {
                ColorLogger.subtitulo("GENERACIÓN DE CÓDIGO INTERMEDIO");
                CodigoVisitor codeVisitor = new CodigoVisitor();
                codeVisitor.visit(tree);
                ColorLogger.exito("Codigo intermedio generado");

                // Generar archivo de salida
                generarArchivoSalida(codeVisitor);
            } else {
                ColorLogger.error("Generacion de codigo cancelada debido a errores");
            }
            
            // Mostrar estadísticas finales
            ColorLogger.mostrarEstadisticas(contadorErrores, contadorWarnings, contadorErrores == 0 ? 1 : 0);
            
        } catch (Exception e) {
            ColorLogger.error("Error fatal en la compilacion: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // *** MÉTODO MEJORADO: Generar archivo de salida ***
    private static void generarArchivoSalida(CodigoVisitor codeVisitor) {
        try {
            try (FileWriter writer = new FileWriter("output_codigo_intermedio.txt")) {
                writer.write("=== CÓDIGO INTERMEDIO (3 DIRECCIONES) ===\n");
                writer.write("Generado el: " + java.time.LocalDateTime.now() + "\n\n");
                
                List<String> instrucciones = codeVisitor.getGen().getInstrucciones();
                for (int i = 0; i < instrucciones.size(); i++) {
                    writer.write(String.format("%2d: %s%n", i, instrucciones.get(i)));
                }
                
                writer.write("\nTotal de instrucciones: " + instrucciones.size());
            }
            
            ColorLogger.exito("Archivo 'output_codigo_intermedio.txt' generado exitosamente");
            
        } catch (IOException e) {
            ColorLogger.error("Error al generar archivo de salida: " + e.getMessage());
        }
    }

    // *** MÉTODO MEJORADO: Mostrar tabla de tokens ***
    private static void mostrarTablaTokens(CommonTokenStream tokens, MiLenguajeLexer lexer) {
        tokens.fill();
        
        ColorLogger.info("Tabla de tokens generada:");
        System.out.printf("%-5s %-15s %-20s %-8s %-5s %-10s%n", 
                         "NUM", "TOKEN", "TEXTO", "LÍNEA", "COL", "CANAL");
        System.out.println("─".repeat(70));
        
        int contador = 0;
        for (Token token : tokens.getTokens()) {
            if (token.getType() == Token.EOF) break;
            
            String nombreToken = lexer.getVocabulary().getSymbolicName(token.getType());
            if (nombreToken == null) {
                nombreToken = lexer.getVocabulary().getLiteralName(token.getType());
            }
            
            String texto = token.getText();
            if (texto.equals("\n")) texto = "\\n";
            if (texto.equals("\t")) texto = "\\t";
            if (texto.equals(" ")) texto = "SPACE";
            
            String canal = token.getChannel() == Token.DEFAULT_CHANNEL ? "DEFAULT" : "HIDDEN";
            
            System.out.printf("%-5d %-15s %-20s %-8d %-5d %-10s%n",
                             contador++,
                             nombreToken != null ? nombreToken : "LITERAL",
                             texto.length() > 18 ? texto.substring(0, 15) + "..." : texto,
                             token.getLine(),
                             token.getCharPositionInLine(),
                             canal);
        }
        
        ColorLogger.info("Total de tokens: " + contador);
    }
}