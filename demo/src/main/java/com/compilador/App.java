package com.compilador;

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
        // 1. Lectura del archivo de entrada
        CharStream input = CharStreams.fromFileName("demo/src/main/input/input.txt");
        
        // 2. Análisis léxico y sintáctico
        MiLenguajeLexer lexer = new MiLenguajeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiLenguajeParser parser = new MiLenguajeParser(tokens);
        ParseTree tree = parser.program();

        // 3. Mostrar el árbol sintáctico
        System.out.println("=== ARBOL SINTACTICO ===");
        System.out.println(tree.toStringTree(parser));
        System.out.println();

        // 4. Análisis semántico: construcción de la Tabla de Símbolos
        SimbolosListener listener = new SimbolosListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        // 5. Revisión de errores semánticos
        List<String> errores = listener.getErrores();
        if (!errores.isEmpty()) {
            System.err.println("=== ERRORES SEMANTICOS ===");
            errores.forEach(err -> System.err.println("- " + err));
        } else {
            // 6. Imprimir la Tabla de Símbolos
            listener.getTablaSimbolos().imprimir();
            System.out.println("=== Analisis semántico completado sin errores. ===");
        }

        // 7. Generación de código intermedio
        System.out.println("\n=== GENERACION DE CODIGO INTERMEDIO ===");
        CodigoVisitor codeVisitor = new CodigoVisitor();
        codeVisitor.visit(tree);
    }
}