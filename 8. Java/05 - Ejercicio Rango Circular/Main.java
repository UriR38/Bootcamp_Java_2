
public class Main {
	public static void main(String[] args) {
		// Byte
		byte byteMax = Byte.MAX_VALUE;
		byte byteOverflow = (byte) (byteMax + 5);
		System.out.println("Byte original: " + byteMax + "\t\t\t Desbordado: " + byteOverflow);

		// Short
		short shortMax = Short.MAX_VALUE;
		short shortOverflow = (short) (shortMax + 25);
		System.out.println("Short original: " + shortMax + "\t\t\t Desbordado: " + shortOverflow);

		// Int
		int intMax = Integer.MAX_VALUE;
		int intOverflow = intMax + 10000;
		System.out.println("Int original: " + intMax + "\t\t Desbordado: " + intOverflow);

		// Long
		long longMax = Long.MAX_VALUE;
		long longOverflow = longMax + 20000L;
		System.out.println("Long original: " + longMax + "\t Desbordado: " + longOverflow);
	}
}
