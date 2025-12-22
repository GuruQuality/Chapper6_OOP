package org.example;

public class Point implements Cloneable {
    int x;
    int y;

    // Конструктор - создает точку с заданными координатами
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // метод клонирования Object
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Point(this.x, this.y);
    }

    // Метод который возвращает точку в виде текста {X;Y}
    public String getText() {
        return "{" + x + ";" + y + "}";
    }

    //Переопределение метода сравнения двух точек
    @Override
    public boolean equals(Object obj) {
        // 1. Приведение типа к Point
        Point point = (Point) obj;
        // 2. Сравнение полей
        return x == point.x && y == point.y;
    }
    public String toString(){
        return getText();
    }
}
//Переопределите
//метод сравнения объектов по состоянию таким образом, чтобы две точки считались
//одинаковыми тогда, когда они расположены в одинаковых координатах.
//
//Переопределите метод
//клонирования, унаследованный от класса Object, таким
//образом, чтобы при его вызове возвращался новый объект Точки, значения полей
//которого будут копиями оригинальной Точки.