public class Main {
    public static void main(String[] args) {
        inputUser input = new inputUser();

        System.out.println("Datos Primitivos");

        byte byteValue = input.leerByte("Introduce un byte: ");
        System.out.println("\tHas introducido: " + byteValue);

        short shortValue = input.leerShort("Introduce un short: ");
        System.out.println("\tHas introducido: " + shortValue);

        int intValue = input.leerInt("Introduce un int: ");
        System.out.println("\tHas introducido: " + intValue);

        long longValue = input.leerLong("Introduce un long: ");
        System.out.println("\tHas introducido: " + longValue);

        float floatValue = input.leerFloat("Introduce un float: ");
        System.out.println("\tHas introducido: " + floatValue);

        double doubleValue = input.leerDouble("Introduce un double: ");
        System.out.println("\tHas introducido: " + doubleValue);

        boolean booleanValue = input.leerBoolean("Introduce un boolean: ");
        System.out.println("\tHas introducido: " + booleanValue);

        char charValue = input.leerChar("Introduce un char: ");
        System.out.println("\tHas introducido: " + charValue);

        input.close();
    }
}
