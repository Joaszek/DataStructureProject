package org.example.shapes.circle;

import org.example.shapes.base.ShapesMethods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class Circle extends JButton implements ShapesMethods, ActionListener {

    public Circle() {
        this.setFocusPainted(false);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(Color.BLACK);
            }
        });

        this.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.getModel().isPressed()) {

        } else if(e.getSource() == this){

        }
    }
}
