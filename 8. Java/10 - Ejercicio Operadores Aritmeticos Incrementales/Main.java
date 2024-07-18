
public class Main {

	static int numero = 0;

	public static void main(String[] args) {
		
		System.out.println("Valor inicial: \t\t\t" + numero);

		incrementar();
		System.out.println("Después de incrementar: \t" + numero);

		decrementar();
		System.out.println("Después de decrementar: \t" + numero);
	}

	public static void incrementar() {
		numero++;
	}

	public static void decrementar() {
		numero--;
	}
}