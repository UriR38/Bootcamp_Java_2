import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = scanner.nextLine();
        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = scanner.nextLine();

        System.out.println("Bienvenido " + nombre + " " + apellido1 + " " + apellido2 + " al juego de 3 en raya!");

        System.out.println("1. Humano contra humano");
        System.out.println("2. Humano contra CPU (El CPU juega como O)");
        System.out.println("3. CPU contra CPU");
        System.out.print("Elige: ");
        int eleccion = scanner.nextInt();

        char[][] tablero = new char[3][3];
        Tablero.inicializarTablero(tablero);
        Tablero.mostrarTablero(tablero);

        char jugadorActual = 'X';
        boolean juegoGanado = false;
        while (!juegoGanado && !Tablero.tableroLleno(tablero)) {
            int fila, columna;
            if (eleccion == 1 || (eleccion == 2 && jugadorActual == 'X')) {
                System.out.println("Jugador " + jugadorActual + ". Ingresa coordenadas (fila,columna) para colocar la pieza:");
                System.out.print("Ingresa fila: ");
                fila = scanner.nextInt() - 1;
                System.out.print("Ingresa columna: ");
                columna = scanner.nextInt() - 1;
            } else {
                int[] movimiento = CPU.obtenerMovimientoCPU(tablero);
                fila = movimiento[0];
                columna = movimiento[1];
                System.out.println("CPU " + jugadorActual + " mueve a (" + (fila + 1) + "," + (columna + 1) + ")");
            }

            if (tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugadorActual;
                Tablero.mostrarTablero(tablero);
                juegoGanado = Tablero.comprobarVictoria(tablero, jugadorActual);
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Espacio ocupado, intenta nuevamente.");
            }
        }

        if (juegoGanado) {
            System.out.println("Jugador " + ((jugadorActual == 'X') ? 'O' : 'X') + " gana!");
        } else {
            System.out.println("Empate!");
        }
        scanner.close();
    }
}
