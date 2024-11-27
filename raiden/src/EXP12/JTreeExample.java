package EXP12;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample {
    public JTreeExample() {
        // Create the JFrame
        JFrame frame = new JFrame("JTree Example");
        frame.setSize(400, 400);

        // Create the tree structure
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        color.add(red);
        color.add(blue);
        color.add(green);

        // Create the JTree
        JTree tree = new JTree(style);

        // Add the JTree directly to the frame
        frame.add(tree);

        // Make the frame visible
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTreeExample(); // Create an instance of the JTreeExample
    }
}
