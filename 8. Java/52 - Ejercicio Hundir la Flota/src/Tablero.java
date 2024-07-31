import java.util.Random;

public class Tablero {
    public static final int TAMANO = 5;
    private char[][] grid;

    public Tablero() {
        grid = new char[TAMANO][TAMANO];
        inicializarTablero();
    }

    /**
     * Inicializa el tablero llenándolo con agua.
     */

    public void inicializarTablero() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                grid[i][j] = '~'; // ~ representa agua
            }
        }
    }

    /**
     * Coloca un número específico de barcos aleatoriamente en el tablero.
     *
     * @param numBarcos Número de barcos a colocar
     */

    public void colocarBarcosAleatoriamente(int numBarcos) {
        Random random = new Random();

        for (int i = 0; i < numBarcos; i++) {
            int x, y;
            do {
                x = random.nextInt(TAMANO);
                y = random.nextInt(TAMANO);
            } while (grid[x][y] == 'B'); // 'B' representa un barco

            grid[x][y] = 'B';
        }
    }

    /**
     * Recibe un disparo en las coordenadas especificadas y retorna si se acertó un barco.
     *
     * @param x Coordenada X del disparo
     * @param y Coordenada Y del disparo
     * @return true si se acertó un barco, false de lo contrario
     */

    public boolean recibirDisparo(int x, int y) {
        if (grid[x][y] == 'B') {
            grid[x][y] = 'X'; // 'X' representa un barco hundido
            return true;
        }
        grid[x][y] = 'O'; // 'O' representa agua disparada
        return false;
    }

    /**
     * Verifica si quedan barcos en el tablero.
     *
     * @return true si quedan barcos, false de lo contrario
     */

    public boolean quedanBarcos() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (grid[i][j] == 'B') {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Cuenta el número de barcos restantes en el tablero.
     *
     * @return Número de barcos restantes
     */

    public int contarBarcosRestantes() {
        int contador = 0;
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (grid[i][j] == 'B') {
                    contador++;
                }
            }
        }
        return contador;
    }
}
