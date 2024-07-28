import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class inputUser {

    private final Scanner sc;

    public inputUser() {
        sc = new Scanner(System.in);
        sc.useLocale(Locale.US);  // Establece el Locale a US para manejar puntos decimales
    }

    public byte leerByte(String result) {
        byte value = 0;
        boolean valid = false;
        System.out.print(result);
        while (!valid) {
            try {
                value = sc.nextByte();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print("\tEl valor ingresado no es un byte. Por favor, introduce un byte: ");
                sc.next(); // Clear the invalid input
            }
        }
        return value;
    }

    public short leerShort(String result) {
        short value = 0;
        boolean valid = false;
        System.out.print(result);
        while (!valid) {
            try {
                value = sc.nextShort();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print("\tEl valor ingresado no es un short. Por favor, introduce un short: ");
                sc.next(); // Clear the invalid input
            }
        }
        return value;
    }

    public int leerInt(String result) {
        int value = 0;
        boolean valid = false;
        System.out.print(result);
        while (!valid) {
            try {
                value = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print("\tEl valor ingresado no es un int. Por favor, introduce un int: ");
                sc.next(); // Clear the invalid input
            }
        }
        return value;
    }

    public long leerLong(String result) {
        long value = 0;
        boolean valid = false;
        System.out.print(result);
        while (!valid) {
            try {
                value = sc.nextLong();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print("\tEl valor ingresado no es un long. Por favor, introduce un long: ");
                sc.next(); // Clear the invalid input
            }
        }
        return value;
    }

    public float leerFloat(String result) {
        float value = 0;
        boolean valid = false;
        System.out.print(result);
        while (!valid) {
            try {
                value = sc.nextFloat();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print("\tEl valor ingresado no es un float. Por favor, introduce un float: ");
                sc.next(); // Clear the invalid input
            }
        }
        return value;
    }

    public double leerDouble(String result) {
        double value = 0;
        boolean valid = false;
        System.out.print(result);
        while (!valid) {
            try {
                value = sc.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print("\tEl valor ingresado no es un double. Por favor, introduce un double: ");
                sc.next(); // Clear the invalid input
            }
        }
        return value;
    }

    public boolean leerBoolean(String result) {
        boolean value = false;
        boolean valid = false;
        System.out.print(result);
        while (!valid) {
            try {
                value = sc.nextBoolean();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print("\tEl valor ingresado no es un boolean. Por favor, introduce un boolean: ");
                sc.next(); // Clear the invalid input
            }
        }
        return value;
    }

    public char leerChar(String result) {
        char value = ' ';
        boolean valid = false;
        System.out.print(result);
        while (!valid) {
            String input = sc.next();
            if (input.length() == 1) {
                value = input.charAt(0);
                valid = true;
            } else {
                System.out.print("\tEl valor ingresado no es un char. Por favor, introduce un char: ");
            }
        }
        return value;
    }

    public void close() {
        sc.close();
    }
}
