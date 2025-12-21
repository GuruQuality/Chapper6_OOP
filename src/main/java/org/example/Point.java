package org.example;

import java.util.Optional;

public class Point {
    protected int x;
    Optional<Integer> y = null;
    //int y;

    public Point(int x) {
        this.x = x;
    }

    // Конструктор - создает точку с заданными координатами
    public Point(int x, Optional<Integer> y) {
        this.x = x;
        this.y = y;
    }

    // Метод который возвращает точку в виде текста {X;Y}
    public String getText() {
        return "{" + x + ";" + y + "}";
    }
}