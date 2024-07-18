import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Numeros solamente divisibles entre 2:\n");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				if (i == 52) {
					System.out.println();
				} else if (i != 100) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + "\n\n");
				}
			}
		}
		System.out.println("Numeros solamente divisibles entre 3:\n");

		int[] numArray = new int[100];
		for (int i = 0; i < 100; i++) {
			numArray[i] = i + 1;
		}
		// con for
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] % 3 == 0) {
				System.out.print(numArray[i] + " ");
			}
		}
		System.out.println();
		// con while
		int i = 0;
		while (i < numArray.length) {
			if (numArray[i] % 3 == 0) {
				System.out.print(numArray[i] + " ");
			}
			i++;
		}

		System.out.println("\n\nSaludos condiciones: ");
		int x = 0;
		while (x < 20) {
			if (x == 18) {
				System.out.println("Hola 👋, se ha cumplido la condicion!\n");
				x++;
			} else {
				x++;
			}

		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cuantas veces quieres que salude? ");
		int numSaludos = scanner.nextInt();

		for (int j = 0; j < numSaludos; j++) {
			System.out.println("\tHola 👋!");
		}

		System.out.println("\nVamos a ir quitando letras del abecedario :)");

		ArrayList<String> abecedario = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
				"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));

		while (abecedario.size() > 2) {
			for (int g = abecedario.size() - 1; g >= 0; g--) {
				if (!abecedario.get(g).equals("A") && !abecedario.get(g).equals("Y")) {
					abecedario.remove(g);
					for (String letra : abecedario) {
						System.out.print(letra);
					}
					System.out.println();
				}
			}
		}

	}
}
