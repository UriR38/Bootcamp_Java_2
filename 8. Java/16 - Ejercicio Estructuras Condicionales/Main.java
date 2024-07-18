public class Main {
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
				System.out.print("*");
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
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
