import javax.swing.*;

public class Ejercicio1 {
    public static void ejecutar() {
        String input = JOptionPane.showInputDialog(null, "Introduce un texto:");

        if (input != null) {
            JOptionPane.showMessageDialog(null, input, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Texto ingresado: " + input);
        } else {
            System.out.println("El usuario canceló la operación.");
        }
    }
}
