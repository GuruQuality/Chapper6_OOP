package org.example;

public class Line extends Object {
    Point a;
    Point b;

    // Конструктор - создает линию с заданными точками
    Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    Line(int x, int y, int x2, int y2) {
        this.a = new Point(x, y);
        this.b = new Point(x2, y2);
    }

    //Длина линии
    public double getLength() {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public String toString() {
        return a.getText() + " " + b.getText();
    }
}
