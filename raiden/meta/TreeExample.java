import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class TreeExample {
JFrame f;
TreeExample() {
JFrame f = new JFrame();
DefaultMutableTreeNode style = new DefaultMutableTreeNode("style");
DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
style.add(color);
style.add(font);
DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
DefaultMutableTreeNode yellow = new DefaultMutableTreeNode("yellow");
color.add(red);
color.add(blue);
color.add(yellow);
JTree jt = new JTree(style);
f.add(jt);
f.setSize(400,400);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new TreeExample();
}}