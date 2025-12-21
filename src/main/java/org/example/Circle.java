package org.example;

import java.awt.*;

public class Circle extends Figure {
    double radius;

    Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * (radius * radius);
    }
}
