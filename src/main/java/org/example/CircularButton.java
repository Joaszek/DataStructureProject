package org.example;

import org.example.shapes.circle.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class CircularButton extends JButton {
    public CircularButton(String label) {
        super(label);

        // Content area is not filled by default, for custom painting
        setContentAreaFilled(false);

        // Set Border to null
        setBorder(BorderFactory.createEmptyBorder());

        // Add mouse listener for hover and click effects
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(Color.BLACK);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
    }

    // Make the button circular
    Shape shape;

    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        }
        return shape.contains(x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Circle circle = new Circle();
        circle.setPreferredSize(new Dimension(100, 100));
        circle.setBackground(Color.GREEN);

        frame.add(circle);
        frame.setVisible(true);
    }
}

