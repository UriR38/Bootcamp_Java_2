package main;

public class Main {
    public static void main(String[] args) {
        // 1)
        String[] tecnologias = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
        System.out.println("Ejercicio 1:");
        recorrerArray(tecnologias, 0);
        System.out.println();

        // 2)
        System.out.println("\nEjercicio 2:");
        recorrerArrayHastaHTML(tecnologias, 0);
        System.out.println();

        // 3)
        System.out.println("\nEjercicio 3:");
        int max = 100;
        fibonacci(0, 1, max);
        System.out.println();

        // 4)
        System.out.println("\nEjercicio 4:");
        String palabra = "supercalifragilisticoespialidoso";
        System.out.println(invertirPalabra(palabra));

        // 5)
        System.out.println("\nEjercicio 5:");
        int numero = 1324712390;
        System.out.println(sumarDigitos(numero));
    }

    public static void recorrerArray(String[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            recorrerArray(array, index + 1);
        }
    }

    public static void recorrerArrayHastaHTML(String[] array, int index) {
        if (index < array.length && !array[index].equals("HTML")) {
            System.out.print(array[index] + " ");
            recorrerArrayHastaHTML(array, index + 1);
        } else if (index < array.length) {
            System.out.print(array[index] + " ");
        }
    }

    public static void fibonacci(int a, int b, int max) {
        if (a <= max) {
            System.out.print(a + " ");
            fibonacci(b, a + b, max);
        }
    }

    public static String invertirPalabra(String palabra) {
        if (palabra.isEmpty()) {
            return palabra;
        }
        return invertirPalabra(palabra.substring(1)) + palabra.charAt(0);
    }

    public static int sumarDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }
        return numero % 10 + sumarDigitos(numero / 10);
    }
}
