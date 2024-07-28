import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame1 = createFrame1(100, 100);
        JFrame frame2 = createFrame2(450, 100);

        frame1.setVisible(true);
        frame2.setVisible(true);
    }

    private static JFrame createFrame1(int x, int y) {
        JFrame frame = new JFrame("Puntos cardinales");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(2, 2));
        frame.setLocation(x, y);

        JButton northButton = createButton("North");
        JButton southButton = createButton("South");
        JButton eastButton = createButton("East");
        JButton westButton = createButton("West");

        frame.add(northButton);
        frame.add(southButton);
        frame.add(eastButton);
        frame.add(westButton);

        return frame;
    }

    private static JFrame createFrame2(int x, int y) {
        JFrame frame = new JFrame("Mobil de los 80");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 3));
        frame.setLocation(x, y);

        String[] labels = {"Contacts", "Message", "Call Log", "Games", "Settings", "Applications", "Music", "Gallery", "Organiser"};
        for (String label : labels) {
            frame.add(createButton(label));
        }

        return frame;
    }

    private static JButton createButton(String label) {
        JButton button = new JButton(label);
        button.addActionListener(new ButtonClickListener(label));
        return button;
    }

    static class ButtonClickListener implements ActionListener {
        private final String label;

        public ButtonClickListener(String label) {
            this.label = label;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Has pulsado: " + label);
        }
    }
}
