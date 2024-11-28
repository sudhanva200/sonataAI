import javax.swing.*;
public class TableExample {
JFrame f;
TableExample() {
JFrame f = new JFrame();
String data[][] = {{"501", "Ravi", "50000"},
{"502", "Raju", "45000"},
{"503", "Ramu", "90000"}};
String column[] = {"ID", "Name", "Salary"};
JTable jt = new JTable (data, column);
JScrollPane sp = new JScrollPane(jt);
f.add(sp);
f.setSize(300,400);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new TableExample();
}} 