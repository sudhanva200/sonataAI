package EXP12;

import javax.swing.*;

public class JTableExample {
    public JTableExample() {
        JFrame frame = new JFrame("JTable Example");
        String[][] data = {{"A", "B"}, {"C", "D"}, {"E", "F"}};
        String[] columnNames = {"A", "B"};

        JTable table = new JTable(data, columnNames);
        JScrollPane pane = new JScrollPane(table);

        frame.add(pane);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTableExample();
    }
}
