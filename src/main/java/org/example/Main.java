package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем точки
        Point a = new Point(1, 3);
        Point b = new Point(1, 3);
        Point a2 = null;// Инициализируем переменную значением null
        try {
            a2 = (Point) a.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // Выводим их
        //System.out.println(Point.point(2,2));
        System.out.println("Точка a: " + a.getText());
        System.out.println("Точка a2: " + a2.getText());
        System.out.println();// Пустая строка для разделения

        // Сравниваем
        System.out.println("A и A2 одинаковые? " + (a.equals(a2)));
        System.out.println("B и A2 одинаковые? " + (b.equals(a2)));
    }
}