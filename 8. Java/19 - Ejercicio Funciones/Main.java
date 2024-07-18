import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Apartado 1:");
		System.out.print("\tText aquí --> ");
		String inputTeclado = scanner.nextLine();

		Main mainInstance = new Main();
		mainInstance.esJava(inputTeclado);

		System.out.println("\nApartado 2:");
		System.out.print("\tUsuario: ");
		String tecladoUsuario = scanner.nextLine();
		System.out.print("\tContraseña: ");
		String tecladoContraseña = scanner.nextLine();
		Main.login(tecladoUsuario, tecladoContraseña);

		System.out.println("\nApartado 3:");
		Main.randomParOImpar();
	}

	private static void randomParOImpar() {
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		if (randomNumber % 2 == 0) {
			System.out.println("\t" + randomNumber + " es par.");
		} else {
			System.out.println("\t" + randomNumber + " es impar.");
		}
	}

	public void esJava(String inputTeclado) {
		if ("java".equalsIgnoreCase(inputTeclado)) {
			System.out.println("\tJava 👍");
		} else {
			System.out.println("\tNull");
		}
	}

	public static void login(String usuario, String contraseña) {
		usuario = usuario.trim();
		contraseña = contraseña.trim();

		if ("admin".equals(usuario) && "1234".equals(contraseña)) {
			System.out.println("\tLogin correcto!");
		} else {
			System.out.println("\tLogin incorrecto.");
		}
	}

}
