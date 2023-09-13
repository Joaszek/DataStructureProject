package org.example.shapes.triangle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.shapes.base.ShapesMethods;

import javax.swing.*;

@Getter
@Setter
@Builder
public class Triangle extends JButton implements ShapesMethods {

    public Triangle() {
        this.setFocusPainted(false);
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
