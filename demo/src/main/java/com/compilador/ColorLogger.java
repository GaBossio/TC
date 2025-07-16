package com.compilador;

public class ColorLogger {
    // Códigos ANSI para colores
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    // Estilos adicionales
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_UNDERLINE = "\u001B[4m";
    
    // Variable para controlar si los colores están habilitados
    private static boolean coloresHabilitados = true;
    private static boolean emojisHabilitados = false; // Por defecto deshabilitados
    
    public static void habilitarColores(boolean habilitar) {
        coloresHabilitados = habilitar;
    }
    
    public static void habilitarEmojis(boolean habilitar) {
        emojisHabilitados = habilitar;
    }
    
    // Detectar automáticamente el soporte
    public static void detectarSoporte() {
        // Forzar habilitación de colores y emojis
        coloresHabilitados = true;
        emojisHabilitados = true;
    }
    
    private static String aplicarColor(String texto, String color) {
        if (!coloresHabilitados) {
            return texto;
        }
        return color + texto + ANSI_RESET;
    }
    
    private static String obtenerIcono(String tipo) {
        if (!emojisHabilitados) {
            switch (tipo) {
                case "exito": return "[OK]";
                case "warning": return "[WARN]";
                case "error": return "[ERROR]";
                case "info": return "[INFO]";
                case "stats": return "[STATS]";
                default: return "[" + tipo.toUpperCase() + "]";
            }
        } else {
            switch (tipo) {
                case "exito": return "✅";
                case "warning": return "⚠️";
                case "error": return "❌";
                case "info": return "ℹ️";
                case "stats": return "📊";
                default: return "🔸";
            }
        }
    }
    
    // Métodos para diferentes tipos de mensajes
    public static void exito(String mensaje) {
        System.out.println(aplicarColor(obtenerIcono("exito") + " " + mensaje, ANSI_GREEN + ANSI_BOLD));
    }
    
    public static void warning(String mensaje) {
        System.out.println(aplicarColor(obtenerIcono("warning") + " " + mensaje, ANSI_YELLOW + ANSI_BOLD));
    }
    
    public static void error(String mensaje) {
        System.err.println(aplicarColor(obtenerIcono("error") + " " + mensaje, ANSI_RED + ANSI_BOLD));
    }
    
    public static void info(String mensaje) {
        System.out.println(aplicarColor(obtenerIcono("info") + " " + mensaje, ANSI_CYAN));
    }
    
    public static void titulo(String titulo) {
        String linea = repetir("=", 50);
        System.out.println(aplicarColor(linea, ANSI_BLUE + ANSI_BOLD));
        System.out.println(aplicarColor("  " + titulo, ANSI_BLUE + ANSI_BOLD));
        System.out.println(aplicarColor(linea, ANSI_BLUE + ANSI_BOLD));
    }
    
    public static void subtitulo(String subtitulo) {
        System.out.println(aplicarColor("\n=== " + subtitulo + " ===", ANSI_PURPLE + ANSI_BOLD));
    }
    
    // Métodos para errores específicos del compilador
    public static void errorLexico(int linea, int columna, String mensaje) {
        error(String.format("Error Lexico [%d:%d] - %s", linea, columna, mensaje));
    }
    
    public static void errorSintactico(int linea, int columna, String mensaje) {
        error(String.format("Error Sintactico [%d:%d] - %s", linea, columna, mensaje));
    }
    
    public static void errorSemantico(int linea, String mensaje) {
        error(String.format("Error Semantico [linea %d] - %s", linea, mensaje));
    }
    
    public static void warningSemantico(int linea, String mensaje) {
        warning(String.format("Warning Semantico [linea %d] - %s", linea, mensaje));
    }
    
    // Método para mostrar estadísticas con colores
    public static void mostrarEstadisticas(int errores, int warnings, int exitos) {
        String icono = obtenerIcono("stats");
        System.out.println("\n" + aplicarColor(icono + " ESTADISTICAS DE COMPILACION:", ANSI_BOLD));
        System.out.println(aplicarColor("   Errores: " + errores, errores > 0 ? ANSI_RED : ANSI_GREEN));
        System.out.println(aplicarColor("   Warnings: " + warnings, warnings > 0 ? ANSI_YELLOW : ANSI_GREEN));
        System.out.println(aplicarColor("   Exitos: " + exitos, ANSI_GREEN));
        
        if (errores == 0 && warnings == 0) {
            exito("Compilacion completada sin errores ni warnings");
        } else if (errores == 0) {
            warning("Compilacion completada con warnings");
        } else {
            error("Compilacion fallo con errores");
        }
    }
    
    // Método auxiliar para repetir caracteres (compatible con Java 8)
    private static String repetir(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
    
    // Método para probar el soporte de colores
    public static void probarColores() {
        System.out.println("=== PRUEBA DE COLORES ===");
        exito("Mensaje de exito");
        warning("Mensaje de warning");
        error("Mensaje de error");
        info("Mensaje de informacion");
        titulo("TITULO DE PRUEBA");
        subtitulo("SUBTITULO DE PRUEBA");
        mostrarEstadisticas(1, 2, 1);
    }
}