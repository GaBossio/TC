package com.compilador;

import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import org.antlr.v4.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Uso: java -jar demo-1.0-jar-with-dependencies.jar <archivo>");
            System.exit(1);
        }

        // 1. Leer entrada
        CharStream input = CharStreams.fromFileName(args[0]);

        // 2. Léxico
        MiLenguajeLexer lexer = new MiLenguajeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        // 3. Sintaxis
        MiLenguajeParser parser = new MiLenguajeParser(tokens);
        ParseTree tree = parser.program();

        // 4. Mostrar AST
        System.out.println("\n=== ÁRBOL Sintáctico (texto) ===");
        System.out.println(tree.toStringTree(parser));

        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.2);
        JFrame frame = new JFrame("Árbol de " + args[0]);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(viewer));
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // 5. Generación de código intermedio
        CodigoVisitor visitor = new CodigoVisitor();
        visitor.visit(tree);
        List<String> codigo3Dir = visitor.getGen().getInstrucciones();

        System.out.println("\n=== Código Intermedio (3 direcciones) ===");
        for (int i = 0; i < codigo3Dir.size(); i++) {
            System.out.printf("%3d: %s%n", i, codigo3Dir.get(i));
        }
    }
}
