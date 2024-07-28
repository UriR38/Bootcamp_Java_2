import javax.swing.*;

public class Ejercicio1 {
    public static void ejecutar() {
        int result = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);

        switch (result) {
            case JOptionPane.YES_OPTION:
                System.out.println("Has seleccionado: Yes");
                JOptionPane.showMessageDialog(null, "Has seleccionado: Yes");
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("Has seleccionado: No");
                JOptionPane.showMessageDialog(null, "Has seleccionado: No");
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("Has seleccionado: Cancel");
                JOptionPane.showMessageDialog(null, "Has seleccionado: Cancel");
                break;
            default:
                System.out.println("Operación cerrada sin selección");
                JOptionPane.showMessageDialog(null, "Operación cerrada sin selección");
                break;
        }
    }
}
