package EXP12;

import javax.swing.*;

public class JListExample {
    public JListExample() {
        JFrame frame = new JFrame("JList Demo");

        // Create the list model and populate it
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("Item 1");
        model.addElement("Item 2");
        model.addElement("Item 3");

        // Create the JList and set its bounds
        JList<String> list = new JList<>(model);
        list.setBounds(100, 100, 150, 100); // Corrected setBounds

        // Add the JList to the frame
        frame.add(list);

        // Configure the frame
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JListExample();
    }
}
