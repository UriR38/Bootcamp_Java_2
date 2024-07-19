public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 1:");
        double valorDouble = 123.45;
        float valorFloat = (float) valorDouble;
        long valorLong = (long) valorFloat;
        int valorInt = (int) valorLong;
        short valorShort = (short) valorInt;
        byte valorByte = (byte) valorShort;

        System.out.println("\tValor Double: " + valorDouble);
        System.out.println("\tValor Float: " + valorFloat);
        System.out.println("\tValor Long: " + valorLong);
        System.out.println("\tValor Int: " + valorInt);
        System.out.println("\tValor Short: " + valorShort);
        System.out.println("\tValor Byte: " + valorByte);
        System.out.println();

        System.out.println("Ejercicio 2:");
        byte valorByteInicial = 10;
        short valorShortAsc = valorByteInicial;
        int valorIntAsc = valorShortAsc;
        long valorLongAsc = valorIntAsc;
        float valorFloatAsc = valorLongAsc;
        double valorDoubleAsc = valorFloatAsc;

        System.out.println("\tValor Byte inicial: " + valorByteInicial);
        System.out.println("\tValor Short: " + valorShortAsc);
        System.out.println("\tValor Int: " + valorIntAsc);
        System.out.println("\tValor Long: " + valorLongAsc);
        System.out.println("\tValor Float: " + valorFloatAsc);
        System.out.println("\tValor Double: " + valorDoubleAsc);
        System.out.println();

        System.out.println("Ejercicio 3:");
        byte valorByteMultiplicacion = 100;
        int resultado = valorByteMultiplicacion * 2;
        valorByteMultiplicacion = (byte) resultado;
        System.out.println("\tValor Byte después de arreglar el overflow: " + valorByteMultiplicacion);
    }
}
