package org.example;

public class Line extends Object implements Measurable {
    Point a;
    Point b;
    // Конструктор - создает линию с заданными точками
    Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    //Длина линии
    public double getLength() {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public String toString() {
        return a.getText() + " " + b.getText();
    }
}
