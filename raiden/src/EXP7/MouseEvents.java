package EXP7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEvents extends JPanel implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX = 0, mouseY = 0; // coordinates of mouse

    public MouseEvents() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        msg = "Mouse clicked.";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "Mouse entered.";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "Mouse exited.";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse pressed.";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse released.";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse dragged.";
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse moved.";
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(msg, mouseX, mouseY);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Events Example");
        MouseEvents panel = new MouseEvents();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
