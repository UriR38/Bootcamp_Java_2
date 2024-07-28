import javax.swing.*;

public class Ejercicio3 {
    public static void ejecutar() {
        Object[] options = {"Error", "Información", "Advertencia", "Pregunta"};
        String selectedOption = (String) JOptionPane.showInputDialog(null,
                "Selecciona el tipo de mensaje:",
                "Seleccionar",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                "Información");

        if (selectedOption != null) {
            int messageType;
            switch (selectedOption) {
                case "Error":
                    messageType = JOptionPane.ERROR_MESSAGE;
                    break;
                case "Información":
                    messageType = JOptionPane.INFORMATION_MESSAGE;
                    break;
                case "Advertencia":
                    messageType = JOptionPane.WARNING_MESSAGE;
                    break;
                case "Pregunta":
                    messageType = JOptionPane.QUESTION_MESSAGE;
                    break;
                default:
                    messageType = JOptionPane.PLAIN_MESSAGE;
            }
            JOptionPane.showMessageDialog(null, "Este es un mensaje de tipo: " + selectedOption, "Mensaje", messageType);
        } else {
            System.out.println("El usuario canceló la operación.");
        }
    }
}
