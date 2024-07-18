public class Main {
	public static void main(String[] args) {
		System.out.println("Apartado 1:");
		for (int i = 1; i <= 50; i++) {
			System.out.println("\tNumero de vuelta: " + i);
			if (i == 3) {
				break;
			}
		}

		System.out.println("\nApartado 2:");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("\tIteración: " + i);
		}
	}
}
