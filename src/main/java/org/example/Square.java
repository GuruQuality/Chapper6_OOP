package org.example;

import java.util.Random;

public class Square extends Figure {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
