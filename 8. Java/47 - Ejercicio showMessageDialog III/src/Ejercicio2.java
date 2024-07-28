import javax.swing.*;

public class Ejercicio2 {
    public static void ejecutar() {
        Object[] options = {"Sí, me encanta!", "No, puags!", "Mejor una 4 quesos"};
        int result = JOptionPane.showOptionDialog(null,
                "¿Te gusta la pizza con piña?",
                "Pregunta de Pizza",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        switch (result) {
            case JOptionPane.YES_OPTION:
                System.out.println("Has seleccionado: Sí, me encanta!");
                JOptionPane.showMessageDialog(null, "Has seleccionado: Sí, me encanta!");
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("Has seleccionado: No, puags!");
                JOptionPane.showMessageDialog(null, "Has seleccionado: No, puags!");
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("Has seleccionado: Mejor una 4 quesos");
                JOptionPane.showMessageDialog(null, "Has seleccionado: Mejor una 4 quesos");
                break;
            default:
                System.out.println("Operación cerrada sin selección");
                JOptionPane.showMessageDialog(null, "Operación cerrada sin selección");
                break;
        }
    }
}
