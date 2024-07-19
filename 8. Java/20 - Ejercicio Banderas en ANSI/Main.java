public class Main {
	// Colores ANSI
	public final static String colorRojo = "\033[48;5;196m\033[38;5;196m"; // Fondo y texto rojo
    public final static String colorAmarillo = "\033[48;5;226m\033[38;5;226m"; // Fondo y texto amarillo
    public final static String colorAzul = "\033[48;5;21m\033[38;5;21m"; // Fondo y texto azul
    public final static String colorBlanco = "\033[48;5;15m\033[38;5;15m"; // Fondo y texto blanco
	public final static String colorNegro = "\033[48;5;0m\033[38;5;0m"; // Fondo y texto negro
	public final static String reset = "\033[0m"; // Reset de colores

	public static void main(String[] args) {
		System.out.println("Bandera de Ucrania:");
		banderaUcrania();
		System.out.println("\nBandera de Grecia:");
		banderaGrecia();
		System.out.println("\nBandera de Francia:");
		banderaFrancia();
		System.out.println("\nBandera de España:");
		banderaEspaña();
		System.out.println("\nBandera de Cataluña:");
		banderaCataluña();
		System.out.println("\nBandera de Alemania:");
		banderaAlemania();
	}

	public static void banderaUcrania() {
		int height = 8;
		int width = 27;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i < height / 2) {
					System.out.print(colorAzul + "*" + reset);
				} else {
					System.out.print(colorAmarillo + "*" + reset);
				}
			}
			System.out.println();
		}
	}

	public static void banderaGrecia() {
		int height = 9;
		int width = 27;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i < 5 && j < 9) {
					if ((i == 2 && j < 9) || (j == 4 && i < 5)) {
						System.out.print(colorBlanco + "*" + reset);
					} else {
						System.out.print(colorAzul + "*" + reset);
					}
				} else {
					if (i % 2 == 0) {
						System.out.print(colorAzul + "*" + reset);
					} else {
						System.out.print(colorBlanco + "*" + reset);
					}
				}
			}
			System.out.println();
		}
	}

	public static void banderaFrancia() {
		int height = 8;
		int width = 27;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (j < width / 3) {
					System.out.print(colorAzul + "*" + reset);
				} else if (j < 2 * width / 3) {
					System.out.print(colorBlanco + "*" + reset);
				} else {
					System.out.print(colorRojo + "*" + reset);
				}
			}
			System.out.println();
		}
	}

	public static void banderaEspaña() {
		int height = 8;
		int width = 27;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == 1 || i == 4 || i == 5) {
					System.out.print(colorRojo + "*" + reset);
				} else {
					System.out.print(colorAmarillo + "*" + reset);
				}
			}
			System.out.println();
		}
	}

	public static void banderaCataluña() {
		int height = 9;
		int width = 27;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i % 2 == 0) {
					System.out.print(colorAmarillo + "*" + reset);
				} else {
					System.out.print(colorRojo + "*" + reset);
				}
			}
			System.out.println();
		}
	}

	public static void banderaAlemania() {
		int height = 9;
		int width = 27;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i < height / 3) {
					System.out.print(colorNegro + "*" + reset);
				} else if (i < 2 * height / 3) {
					System.out.print(colorRojo + "*" + reset);
				} else {
					System.out.print(colorAmarillo + "*" + reset);
				}
			}
			System.out.println();
		}
	}
}
