import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame leftAlignedFrame = createFrame("Flow Layout - Left", FlowLayout.LEFT, 100);
        JFrame centerAlignedFrame = createFrame("Flow Layout - Center", FlowLayout.CENTER, 260);
        JFrame rightAlignedFrame = createFrame("Flow Layout - Right", FlowLayout.RIGHT, 420);

        addButtons(leftAlignedFrame);
        addButtons(centerAlignedFrame);
        addButtons(rightAlignedFrame);

        leftAlignedFrame.setVisible(true);
        centerAlignedFrame.setVisible(true);
        rightAlignedFrame.setVisible(true);
    }

    private static JFrame createFrame(String title, int alignment, int yOffset) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout(alignment));
        frame.setLocation(100, yOffset);
        return frame;
    }

    private static void addButtons(JFrame frame) {
        for (int i = 1; i <= 8; i++) {
            frame.add(new JButton("Button:" + i));
        }
    }
}
