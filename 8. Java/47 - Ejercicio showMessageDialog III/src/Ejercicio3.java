import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio3 {
    public static void ejecutar() {
        ArrayList<String> preguntas = new ArrayList<>();
        preguntas.add("¿Te gusta la pizza con piña?");
        preguntas.add("¿Prefieres café o té?");
        preguntas.add("¿Te gusta el invierno?");
        preguntas.add("¿Eres fan de los videojuegos?");

        Object[] options = {"Sí, me encanta!", "No, puags!", "Mejor una 4 quesos", "Siguiente", "Salir"};
        Random rand = new Random();

        while (true) {
            String pregunta = preguntas.get(rand.nextInt(preguntas.size()));
            int result = JOptionPane.showOptionDialog(null,
                    pregunta,
                    "Preguntas aleatorias",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (result == 4) { // Salir
                System.out.println("Has seleccionado: Salir");
                break;
            } else {
                String respuesta;
                switch (result) {
                    case 0:
                        respuesta = "Sí, me encanta!";
                        break;
                    case 1:
                        respuesta = "No, puags!";
                        break;
                    case 2:
                        respuesta = "Mejor una 4 quesos";
                        break;
                    case 3:
                        continue; // Siguiente
                    default:
                        respuesta = "Operación cerrada sin selección";
                }
                System.out.println("Pregunta: " + pregunta);
                System.out.println("Respuesta: " + respuesta);
                JOptionPane.showMessageDialog(null, "Pregunta: " + pregunta + "\nRespuesta: " + respuesta);
            }
        }
    }
}
