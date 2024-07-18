
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Apartado 1
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num1 = scanner.nextInt();
		String result = (num1 % 2 == 0) ? "par" : "impar";
		System.out.println("El numero " + num1 + " es " + result + ".");

		// Apartado 2
		boolean aleatorio = Math.random() < 5;
		String color = aleatorio ? "⬜️" : "⬛️";
		System.out.println("El color es: " + color);
	}
}
