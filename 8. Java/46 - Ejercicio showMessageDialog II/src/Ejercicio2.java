import javax.swing.*;

public class Ejercicio2 {
    public static void ejecutar() {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Introduce un texto:");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada. Por favor, ingresa un texto.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El texto no puede estar vacío. Por favor, ingresa un texto.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, input, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Texto ingresado: " + input);
                break;
            }
        }
    }
}
