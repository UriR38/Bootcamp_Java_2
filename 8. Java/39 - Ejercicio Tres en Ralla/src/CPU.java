public class CPU {
    public static int[] obtenerMovimientoCPU(char[][] tablero) {
        int fila, columna;
        do {
            fila = (int) (Math.random() * 3);
            columna = (int) (Math.random() * 3);
        } while (tablero[fila][columna] != ' ');
        return new int[]{fila, columna};
    }
}
