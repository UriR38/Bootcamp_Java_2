import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fundación Esplai");

        frame.setSize(800, 600);
        frame.setResizable(false);

        frame.getContentPane().setBackground(Color.BLUE);

        try {
            URL url = new URL("https://fundacionesplai.org/favicon.ico");
            ImageIcon icon = new ImageIcon(url);
            frame.setIconImage(icon.getImage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
