package com.compilador;

import org.antlr.v4.runtime.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java -jar demo-1.0-jar-with-dependencies.jar <archivo.txt>");
            System.exit(1);
        }

        try {
            // Cargar el archivo de entrada
            CharStream input = CharStreams.fromFileName(args[0]);
            System.out.println("Analizando archivo: " + args[0]);
            
            // Crear el lexer
            MiLenguajeLexer lexer = new MiLenguajeLexer(input);
            
            // Obtener todos los tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();
            
            // Mostrar los tokens
            System.out.println("\n=== ANÁLISIS LÉXICO ===");
            System.out.printf("%-20s %-30s %-10s %-10s\n", "TIPO", "LEXEMA", "LÍNEA", "COLUMNA");
            System.out.println("-------------------------------------------------------------------");
            
            for (Token token : tokens.getTokens()) {
                if (token.getType() != Token.EOF) {
                    String tokenName = MiLenguajeLexer.VOCABULARY.getSymbolicName(token.getType());
                    System.out.printf("%-20s %-30s %-10d %-10d\n", 
                                     tokenName, token.getText(), token.getLine(), 
                                     token.getCharPositionInLine());
                }
            }
            
            System.out.println("\nAnálisis léxico completado.");
            
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error durante el análisis: " + e.getMessage());
            e.printStackTrace();
        }
    }
}