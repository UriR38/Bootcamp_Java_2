public class Main {
    public final static String colorVerde = "\033[48;5;2m\033[38;5;15m"; // Fondo verde y texto blanco
    public final static String colorMarron = "\033[48;5;94m\033[38;5;94m"; // Fondo y texto marrón
    public final static String reset = "\033[0m"; // Reset de colores

    public static void main(String[] args) {

        int altura = 10;
        int espacios = 4;
        System.out.println();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i + 1; j++) {
                System.out.print(colorVerde + "*" + reset);
            }
            System.out.println();
        }
        int alturaTronco = 2;
        int anchoTronco = 4;
        for (int i = 0; i < alturaTronco; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < altura - anchoTronco / 2 - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < anchoTronco; j++) {
                System.out.print(colorMarron + "*" + reset);
            }
            System.out.println();
        }
    }
}
