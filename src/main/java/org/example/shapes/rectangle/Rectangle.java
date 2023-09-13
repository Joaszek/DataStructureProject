package org.example.shapes.rectangle;

import org.example.shapes.base.ShapesMethods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class Rectangle extends JButton implements ShapesMethods {

    public Rectangle() {
        this.setFocusPainted(false);
        this.setPreferredSize(new Dimension(100, 100));
        this.setVisible(true);
        this.setForeground(Color.BLACK);

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
        if (getModel().isArmed()) {
            g.setColor(Color.LIGHT_GRAY);
        } else {
            g.setColor(getBackground());
        }
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
    }

    Shape shape;

    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        }
        return shape.contains(x, y);
    }


    @Override
    public void delete() {

    }

    @Override
    public void copy() {

    }

    @Override
    public void paste() {

    }

    @Override
    public void move_backward() {

    }

    @Override
    public void move_forward() {

    }
}
