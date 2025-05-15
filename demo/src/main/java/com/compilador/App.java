package com.compilador;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        try {
            CharStream input = CharStreams.fromFileName("demo/src/main/input/input.txt");
            MiLenguajeLexer lexer = new MiLenguajeLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiLenguajeParser parser = new MiLenguajeParser(tokens);
            ParseTree tree = parser.program();
    
            System.out.println(tree.toStringTree(parser));

            
        } catch (final IOException e) {
            System.err.println(e);
        }
    }
}


