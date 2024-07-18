
public class Main {
	public static void main(String[] args) {
		// Byte
		final byte byteMax = Byte.MAX_VALUE;
		final byte byteOverflow = (byte) (byteMax + 5);
		System.out.println("Byte original: " + byteMax + "\t\t\t Desbordado: " + byteOverflow);

		// Short
		final short shortMax = Short.MAX_VALUE;
		final short shortOverflow = (short) (shortMax + 25);
		System.out.println("Short original: " + shortMax + "\t\t\t Desbordado: " + shortOverflow);

		// Int
		final int intMax = Integer.MAX_VALUE;
		final int intOverflow = intMax + 10000;
		System.out.println("Int original: " + intMax + "\t\t Desbordado: " + intOverflow);

		// Long
		final long longMax = Long.MAX_VALUE;
		final long longOverflow = longMax + 20000L;
		System.out.println("Long original: " + longMax + "\t Desbordado: " + longOverflow);
	}
}
