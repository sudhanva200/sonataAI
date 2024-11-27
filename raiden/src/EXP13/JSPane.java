package EXP13;

import javax.swing.*;
import java.awt.*;

public class JSPane {
    public JSPane() {
        // Create a JFrame
        JFrame frame = new JFrame("JSPane Example");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a JTextArea and wrap it in a JScrollPane
        JTextArea textArea = new JTextArea(20, 20);
        JScrollPane scrollableTextArea = new JScrollPane(textArea);
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Add the JScrollPane to the JFrame
        frame.add(scrollableTextArea);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JSPane();
            }
        });
    }
}
