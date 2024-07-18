
public class Main {
	public static void main(String[] args) {

		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		boolean bool4 = false;

		boolean comparacion1 = bool1 == !bool2;
		System.out.println("¿bool1 es igual al valor invertido de bool2? " + comparacion1);

		boolean comparacion2 = bool2 == !bool3;
		System.out.println("¿bool2 es igual al valor invertido de bool3? " + comparacion2);
	}
}
