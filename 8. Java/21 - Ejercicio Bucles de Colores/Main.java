import java.util.Random;

public class Main {
    public final static String[] colors = {
            "\033[48;5;0m\033[38;5;0m",  // Negro
            "\033[48;5;1m\033[38;5;1m",  // Rojo
            "\033[48;5;2m\033[38;5;2m",  // Verde
            "\033[48;5;3m\033[38;5;3m",  // Amarillo
            "\033[48;5;4m\033[38;5;4m",  // Azul
            "\033[48;5;5m\033[38;5;5m",  // Magenta
            "\033[48;5;6m\033[38;5;6m",  // Cian
            "\033[48;5;7m\033[38;5;7m",  // Blanco
            "\033[48;5;8m\033[38;5;8m",  // Negro Claro
            "\033[48;5;9m\033[38;5;9m",  // Rojo Claro
            "\033[48;5;10m\033[38;5;10m", // Verde Claro
            "\033[48;5;11m\033[38;5;11m", // Amarillo Claro
            "\033[48;5;12m\033[38;5;12m", // Azul Claro
            "\033[48;5;13m\033[38;5;13m", // Magenta Claro
            "\033[48;5;14m\033[38;5;14m", // Cian Claro
            "\033[48;5;15m\033[38;5;15m"  // Blanco Claro
    };

    public static void main(String[] args) {
        Random random = new Random();

        StringBuilder line = new StringBuilder();
        String lastColor = "";
        for (int j = 0; j < 100; j++) {
            String randomColor;
            do {
                randomColor = colors[random.nextInt(colors.length)];
            } while (randomColor.equals(lastColor));

            line.append(randomColor).append("*********").append("\033[0m");
            lastColor = randomColor;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(line.toString());
        }
    }
}
