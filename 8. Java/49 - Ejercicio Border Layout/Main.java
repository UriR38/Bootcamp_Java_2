import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        JButton northButton = new JButton("North");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");
        JButton eastButton = new JButton("East");
        JButton southButton = new JButton("South");

        northButton.setBackground(Color.RED);
        westButton.setBackground(Color.BLUE);
        centerButton.setBackground(Color.YELLOW);
        eastButton.setBackground(Color.BLUE);
        southButton.setBackground(Color.RED);

        northButton.setForeground(Color.WHITE);
        westButton.setForeground(Color.WHITE);
        centerButton.setForeground(Color.BLACK);
        eastButton.setForeground(Color.WHITE);
        southButton.setForeground(Color.WHITE);

        northButton.addActionListener(new ButtonClickListener("North"));
        westButton.addActionListener(new ButtonClickListener("West"));
        centerButton.addActionListener(new ButtonClickListener("Center"));
        eastButton.addActionListener(new ButtonClickListener("East"));
        southButton.addActionListener(new ButtonClickListener("South"));

        frame.add(northButton, BorderLayout.NORTH);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(southButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    static class ButtonClickListener implements ActionListener {
        private final String position;

        public ButtonClickListener(String position) {
            this.position = position;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Has pulsado: " + position);
        }
    }
}