package org.example.frame.main;


import org.example.shapes.circle.Circle;
import org.example.shapes.rectangle.Rectangle;
import org.example.shapes.square.Square;
import org.example.shapes.triangle.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    private JPanel menu;
    private Drawboard drawboard;

    private JButton square;
    private JButton rectangle;
    private JButton triangle;
    private JButton circle;

    public Frame() {

        Rectangle circularButton = new Rectangle();
        circularButton.setBackground(Color.BLACK);
        //this.add(circularButton);
        //this.setLayout(null);

        menu = createMenuPanel();
        drawboard = createDrawbackPanel();

        this.setLayout(null);
        this.setSize(600, 600);
        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(menu);
        this.add(drawboard);
    }

    private JPanel createMenuPanel() {
        JPanel menu = new JPanel();

        menu.setSize(600, 70);
        menu.setLocation(0,0);
        menu.setLayout(new GridLayout(1,4));

        menu.add(createNewSquare("Square"));
        menu.add(createNewRectangle("Rectangle"));
        menu.add(createNewTriangle("Triangle"));
        menu.add(createNewCircle("Circle"));

        return menu;
    }

    private Drawboard createDrawbackPanel() {
        Drawboard drawboard = new Drawboard();

        drawboard.setSize(600, 500);
        drawboard.setLocation(0, 100);

        return drawboard;
    }

    private JButton createNewSquare(String name) {

        square = new JButton(name);
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Square");
                drawboard.add(new Square());
                drawboard.repaint();
            }
        });
        return square;
    }

    private JButton createNewRectangle(String name) {

        rectangle = new JButton(name);
        rectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Rectangle");
                drawboard.add(new Rectangle());
                drawboard.repaint();
            }
        });
        return rectangle;
    }

    private JButton createNewTriangle(String name) {

        triangle = new JButton(name);
        triangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Triangle");
                drawboard.add(new Triangle());
                drawboard.repaint();
            }
        });
        return triangle;
    }

    private JButton createNewCircle(String name) {

        circle = new JButton(name);
        circle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Circle");
                drawboard.add(new Circle());
                drawboard.repaint();
            }
        });
        return circle;
    }
}
