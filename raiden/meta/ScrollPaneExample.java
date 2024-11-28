import javax.swing.*;
import java.awt.*;

public class ScrollPaneExample {
    private static final long serialVersionUID = 1L; // constant declaration

    private static void createAndShowGUI() {
        // Create JFrame
        final JFrame frame = new JFrame("Scroll Pane Example");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        // Create JTextArea
        JTextArea textArea = new JTextArea(20, 20);

        // Create JScrollPane with JTextArea inside
        JScrollPane scrollableTextArea = new JScrollPane(textArea);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Add JScrollPane to JFrame
        frame.getContentPane().add(scrollableTextArea);

        // Make the frame visible after adding components
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
