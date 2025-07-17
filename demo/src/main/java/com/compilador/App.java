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
            ColorLogger.subtitulo("ANALISIS LEXICO");
            CharStream input = CharStreams.fromFileName("demo/src/main/input/input.txt");

            // 2. Análisis léxico
            MiLenguajeLexer lexer = new MiLenguajeLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Generar tabla de tokens y mostrar cantidad
            int totalTokens = mostrarTablaTokens(tokens, lexer);
            ColorLogger.exito("Analisis lexico completado - " + totalTokens + " tokens procesados");

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

            // Verificar variables no usadas
            listener.verificarVariablesNoUsadas();
            // Verificar funciones no usadas
            listener.verificarFuncionesNoUsadas();

            // 5. Revisión de errores semánticos
            List<String> errores = listener.getErrores();
            int contadorErrores = 0;
            int contadorWarnings = 0;

            // 6. Imprimir la Tabla de Símbolos SIEMPRE (sin importar errores)
            ColorLogger.subtitulo("TABLA DE SIMBOLOS");
            listener.getTablaSimbolos().imprimir();

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
            }

                        if (contadorErrores == 0 && contadorWarnings == 0) {
                ColorLogger.exito("Analisis semántico completado sin errores");
            } else if (contadorErrores == 0) {
                ColorLogger.warning("Analisis semántico completado con " + contadorWarnings + " advertencias");
            } else {
                ColorLogger.error("Analisis semántico completado con " + contadorErrores + " errores y "
                        + contadorWarnings + " advertencias");
            }

            // 7. Generación de código intermedio (solo si no hay errores críticos)
            if (contadorErrores == 0) {
                ColorLogger.subtitulo("GENERACION DE CODIGO INTERMEDIO");
                CodigoVisitor codeVisitor = new CodigoVisitor();
                codeVisitor.visit(tree);
                ColorLogger.exito("Codigo intermedio generado y optimizado");

                // Generar archivo de salida
                generarArchivoSalida(codeVisitor);
            } else {
                ColorLogger.error("Generacion de codigo cancelada debido a " + contadorErrores + " errores críticos");
            }

            // Mostrar estadísticas finales
            mostrarEstadisticasFinales(contadorErrores, contadorWarnings, totalTokens);

        } catch (Exception e) {
            ColorLogger.error("Error fatal en la compilacion: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void generarArchivoSalida(CodigoVisitor codeVisitor) {
        try {
            try (FileWriter writer = new FileWriter("output_codigo_intermedio.txt")) {
                writer.write("=== CÓDIGO INTERMEDIO (3 DIRECCIONES) ===\n");
                writer.write("Generado el: " + java.time.LocalDateTime.now() + "\n\n");
                
                // *** CÓDIGO ORIGINAL ***
                writer.write("=== CÓDIGO ORIGINAL ===\n");
                List<String> instruccionesOriginales = codeVisitor.getGen().getInstrucciones();
                for (int i = 0; i < instruccionesOriginales.size(); i++) {
                    writer.write(String.format("%3d: %s%n", i, instruccionesOriginales.get(i)));
                }
                
                writer.write("\nTotal de instrucciones originales: " + instruccionesOriginales.size() + "\n");
                
                // *** CÓDIGO OPTIMIZADO ***
                OptimizadorCodigoMuerto optimizador = new OptimizadorCodigoMuerto();
                List<String> instruccionesOptimizadas = optimizador.eliminarCodigoMuerto(instruccionesOriginales);
                
                if (instruccionesOptimizadas.size() != instruccionesOriginales.size()) {
                    writer.write("\n=== CÓDIGO OPTIMIZADO ===\n");
                    for (int i = 0; i < instruccionesOptimizadas.size(); i++) {
                        writer.write(String.format("%3d: %s%n", i, instruccionesOptimizadas.get(i)));
                    }
                    
                    int eliminadas = instruccionesOriginales.size() - instruccionesOptimizadas.size();
                    writer.write("\nTotal de instrucciones optimizadas: " + instruccionesOptimizadas.size() + "\n");
                    writer.write("Instrucciones eliminadas: " + eliminadas + "\n");
                    writer.write("Porcentaje de optimización: " + 
                               String.format("%.2f%%", (eliminadas * 100.0) / instruccionesOriginales.size()) + "\n");
                } else {
                    writer.write("\n=== OPTIMIZACIÓN ===\n");
                    writer.write("No se encontró código muerto para eliminar.\n");
                    writer.write("El código ya está optimizado.\n");
                }
                
                // *** ESTADÍSTICAS FINALES ***
                writer.write("\n=== ESTADÍSTICAS DE COMPILACIÓN ===\n");
                writer.write("• Variables temporales generadas: " + contarTemporales(instruccionesOriginales) + "\n");
                writer.write("• Etiquetas generadas: " + contarEtiquetas(instruccionesOriginales) + "\n");
                writer.write("• Llamadas a funciones: " + contarLlamadas(instruccionesOriginales) + "\n");
                writer.write("• Declaraciones: " + contarDeclaraciones(instruccionesOriginales) + "\n");
            }
            
            ColorLogger.exito("Archivo 'output_codigo_intermedio.txt' generado exitosamente con código optimizado");
            
        } catch (IOException e) {
            ColorLogger.error("Error al generar archivo de salida: " + e.getMessage());
        }
    }

    // *** MÉTODOS AUXILIARES PARA ESTADÍSTICAS ***
    private static int contarTemporales(List<String> instrucciones) {
        return (int) instrucciones.stream()
            .filter(instr -> instr.matches(".*\\bt\\d+\\s*=.*"))
            .count();
    }

    private static int contarEtiquetas(List<String> instrucciones) {
        return (int) instrucciones.stream()
            .filter(instr -> instr.endsWith(":") && !instr.contains(" = "))
            .count();
    }

    private static int contarLlamadas(List<String> instrucciones) {
        return (int) instrucciones.stream()
            .filter(instr -> instr.contains("CALL func_"))
            .count();
    }

    private static int contarDeclaraciones(List<String> instrucciones) {
        return (int) instrucciones.stream()
            .filter(instr -> instr.startsWith("DECLARE "))
            .count();
    }

    private static int mostrarTablaTokens(CommonTokenStream tokens, MiLenguajeLexer lexer) {
        tokens.fill();

        ColorLogger.info("Tabla de tokens generada:");
        System.out.printf("%-5s %-15s %-20s %-8s %-5s %-10s%n",
                "NUM", "TOKEN", "TEXTO", "LINEA", "COL", "CANAL");
        System.out.println("─".repeat(70));

        int contador = 0;
        for (Token token : tokens.getTokens()) {
            if (token.getType() == Token.EOF)
                break;

            String nombreToken = lexer.getVocabulary().getSymbolicName(token.getType());
            if (nombreToken == null) {
                nombreToken = lexer.getVocabulary().getLiteralName(token.getType());
            }

            String texto = token.getText();
            if (texto.equals("\n"))
                texto = "\\n";
            if (texto.equals("\t"))
                texto = "\\t";
            if (texto.equals(" "))
                texto = "SPACE";

            String canal = token.getChannel() == Token.DEFAULT_CHANNEL ? "DEFAULT" : "HIDDEN";

            System.out.printf("%-5d %-15s %-20s %-8d %-5d %-10s%n",
                    contador++,
                    nombreToken != null ? nombreToken : "LITERAL",
                    texto.length() > 18 ? texto.substring(0, 15) + "..." : texto,
                    token.getLine(),
                    token.getCharPositionInLine(),
                    canal);
        }

        return contador; // Retorna la cantidad de tokens procesados
    }

    private static void mostrarEstadisticasFinales(int errores, int warnings, int tokens) {
        ColorLogger.subtitulo("ESTADISTICAS DE COMPILACION");
        System.out.println("📊 Tokens procesados: " + tokens);
        System.out.println("📊 Errores: " + errores);
        System.out.println("📊 Warnings: " + warnings);
        System.out.println("📊 Éxitos: " + (errores == 0 ? 1 : 0));

        if (errores == 0 && warnings == 0) {
            ColorLogger.exito("✅ Compilacion exitosa");
        } else if (errores == 0) {
            ColorLogger.warning("⚠️ Compilacion completada con warnings");
        } else {
            ColorLogger.error("❌ Compilacion falló con errores");
        }
    }
}