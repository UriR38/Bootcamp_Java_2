package 23 - Ejercicio Tablas;

public public class Main {

    public final static String colorVerde = "\033[48;5;2m\033[38;5;15m"; // Fondo verde y texto blanco
    public final static String colorMarron = "\033[48;5;94m\033[38;5;15m"; // Fondo marrón y texto blanco
    public final static String reset = "\033[0m"; // Reset de colores

    public static void main(String[] args) {
        printTipoDato("byte", 1, 8, "-128 a 127");
        printTipoDato("short", 2, 16, "-32768 a 32767");
        printTipoDato("int", 4, 32, "-2147483648 a 2147483647");
        printTipoDato("long", 8, 64, "-9223372036854775808 a 9223372036854775807");
        printTipoDato("float", 4, 32, "1.4E-45 a 3.4028235E38");
        printTipoDato("double", 8, 64, "4.9E-324 a 1.79769313486237E08");
        printTablaResumen();
    }
    
    public static void printTipoDato(String tipo, int bytes, int bits, String rango) {
        System.out.println(colorVerde + " El tipo de datos: " + tipo + " " + reset);
        System.out.println(" Está formado por: " + bytes + " Bytes");
        System.out.println(" Un byte está formado por: " + bits + " Bits");
        System.out.println(" Su Rango va del: " + rango);
        System.out.println();
    }

    public static void printTablaResumen() {
        String formato = colorMarron + "| %-15s | %-20s | %-20s |" + reset;
        String separador = colorMarron + "+-----------------+----------------------+----------------------+" + reset;

        System.out.println(separador);
        System.out.printf(formato, "Tipo de Dato", "Rango Desde", "Rango Hasta");
        System.out.println();
        System.out.println(separador);
        System.out.printf(formato, "byte", "-128", "127");
        System.out.println();
        System.out.println(separador);
        System.out.printf(formato, "short", "-32768", "32767");
        System.out.println();
        System.out.println(separador);
        System.out.printf(formato, "int", "-2147483648", "2147483647");
        System.out.println();
        System.out.println(separador);
        System.out.printf(formato, "long", "-9223372036854775808", "9223372036854775807");
        System.out.println();
        System.out.println(separador);
        System.out.printf(formato, "float", "1.4E-45", "3.4028235E38");
        System.out.println();
        System.out.println(separador);
        System.out.printf(formato, "double", "4.9E-324", "1.7976931348657E308");
        System.out.println();
        System.out.println(separador);
    }
}
 {
    
}
