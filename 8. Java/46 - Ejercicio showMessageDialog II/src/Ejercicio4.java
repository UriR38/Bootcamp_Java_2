import javax.swing.*;

public class Ejercicio4 {
    public static void ejecutar() {
        String[] animals = {"Perro", "Gato", "Lobo", "León"};
        String selectedAnimal = (String) JOptionPane.showInputDialog(null,
                "¿Cuál es tu animal favorito?",
                "Animal Quiz",
                JOptionPane.QUESTION_MESSAGE,
                null,
                animals,
                "Lobo");

        if (selectedAnimal != null) {
            JOptionPane.showMessageDialog(null, "Tu animal favorito es: " + selectedAnimal, "Animal Seleccionado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("El usuario canceló la operación.");
        }
    }
}
