import java.util.Scanner;

public class inputUser {

    private final Scanner sc;

    public inputUser() {
        sc = new Scanner(System.in);
    }

    public byte leerByte(String result) {
        System.out.print(result);
        while (!sc.hasNextByte()) {
            String inputUser = sc.next();
            System.out.print("\t" + inputUser + " no es un byte. Por favor, introduce un byte: ");
        }
        return sc.nextByte();
    }

    public short leerShort(String result) {
        System.out.print(result);
        while (!sc.hasNextShort()) {
            String inputUser = sc.next();
            System.out.print("\t" + inputUser + " no es un short. Por favor, introduce un short: ");
        }
        return sc.nextShort();
    }

    public int leerInt(String result) {
        System.out.print(result);
        while (!sc.hasNextInt()) {
            String inputUser = sc.next();
            System.out.print("\t" + inputUser + " no es un int. Por favor, introduce un int: ");
        }
        return sc.nextInt();
    }

    public long leerLong(String result) {
        System.out.print(result);
        while (!sc.hasNextLong()) {
            String inputUser = sc.next();
            System.out.print("\t" + inputUser + " no es un long. Por favor, introduce un long: ");
        }
        return sc.nextLong();
    }

    public float leerFloat(String result) {
        System.out.print(result);
        while (!sc.hasNextFloat()) {
            String inputUser = sc.next();
            System.out.print("\t" + inputUser + " no es un float. Por favor, introduce un float: ");
        }
        return sc.nextFloat();
    }

    public double leerDouble(String result) {
        System.out.print(result);
        while (!sc.hasNextDouble()) {
            String inputUser = sc.next();
            System.out.print("\t" + inputUser + " no es un double. Por favor, introduce un double: ");
        }
        return sc.nextDouble();
    }

    public boolean leerBoolean(String result) {
        System.out.print(result);
        while (!sc.hasNextBoolean()) {
            String inputUser = sc.next();
            System.out.print("\t" + inputUser + " no es un boolean. Por favor, introduce un boolean: ");
        }
        return sc.nextBoolean();
    }

    public char leerChar(String result) {
        System.out.print(result);
        String inputUser;
        while ((inputUser = sc.next()).length() != 1) {
            System.out.print("\t" + inputUser + " no es un char. Por favor, introduce un char: ");
        }
        return inputUser.charAt(0);
    }

    public void close() {
        sc.close();
    }
}
