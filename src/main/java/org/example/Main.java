package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем точки
        Point a = new Point(1,3);
        Point b = new Point(1,3);
        Point c = new Point(5,8);

        // Выводим их
        //System.out.println(Point.point(2,2));
        System.out.println("Точка A: " + a.getText());
        System.out.println("Точка B: " + b.getText());
        System.out.println("Точка C: " + c.getText());
        System.out.println();// Пустая строка для разделения

        // Сравниваем
        System.out.println("A и B одинаковые? " + (a==b));
        System.out.println("A и C одинаковые? " + (a==c));
    }
}