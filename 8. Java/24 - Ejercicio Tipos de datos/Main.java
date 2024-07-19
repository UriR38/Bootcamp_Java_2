public class Main {
    public final static String negrita = "\033[1m"; // Texto en negrita
    public final static String reset = "\033[0m"; // Reset de colores

    public static void main(String[] args) {
        // 1)
        Long varLong = 10L;
        byte varByte = 10;
        short varShort = 10;
        Integer varInteger = 10;

        System.out.println(negrita + "Clase de varLong: " + reset + varLong.getClass().getName());
        System.out.println(negrita + "Clase de varByte: " + reset + ((Object) varByte).getClass().getName());
        System.out.println(negrita + "Clase de varShort: " + reset + ((Object) varShort).getClass().getName());
        System.out.println(negrita + "Clase de varInteger: " + reset + varInteger.getClass().getName());
        System.out.println();

        // 2)
        identificarWrapper("Hola");
        identificarWrapper(42);
        identificarWrapper(42L);
        identificarWrapper(3.14f);
        identificarWrapper(3.14);
        identificarWrapper(true);
        identificarWrapper((byte) 8);
        identificarWrapper((short) 16);
    }

    public static void identificarWrapper(Object valor) {
        if (valor instanceof String) {
            System.out.println(negrita + "Parametro: " + valor + " --> " + reset + "el valor es de tipo String y su Wrapper es java.lang.String");
        } else if (valor instanceof Integer) {
            System.out.println(negrita + "Parametro: " + valor + " --> " + reset + "el valor es de tipo int y su Wrapper es java.lang.Integer");
        } else if (valor instanceof Long) {
            System.out.println(negrita + "Parametro: " + valor + " --> " + reset + "el valor es de tipo long y su Wrapper es java.lang.Long");
        } else if (valor instanceof Float) {
            System.out.println(negrita + "Parametro: " + valor + " --> " + reset + "el valor es de tipo float y su Wrapper es java.lang.Float");
        } else if (valor instanceof Double) {
            System.out.println(negrita + "Parametro: " + valor + " --> " + reset + "el valor es de tipo double y su Wrapper es java.lang.Double");
        } else if (valor instanceof Boolean) {
            System.out.println(negrita + "Parametro: " + valor + " --> " + reset + "el valor es de tipo boolean y su Wrapper es java.lang.Boolean");
        } else if (valor instanceof Byte) {
            System.out.println(negrita + "Parametro: " + valor + " --> " + reset + "el valor es de tipo byte y su Wrapper es java.lang.Byte");
        } else if (valor instanceof Short) {
            System.out.println(negrita + "Parametro: " + valor + " --> " + reset + "el valor es de tipo short y su Wrapper es java.lang.Short");
        } else {
            System.out.println(negrita + "Parametro: " + valor + " --> " + reset + "el valor es de un tipo desconocido");
        }
    }
}
