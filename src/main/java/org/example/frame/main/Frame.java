package org.example.frame.main;


import org.example.shapes.rectangle.Rectangle;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {

        Rectangle circularButton = new Rectangle();
        circularButton.setBackground(Color.BLACK);


        this.add(circularButton);
        this.setLayout(null);
        this.setSize(600, 600);
        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
