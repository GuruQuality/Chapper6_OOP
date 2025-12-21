package org.example;

public class Main {
    public static void main(String[] args) {
//        // Создаем точки
//        Point a = new Point(1,3);
//        Point b = new Point(1,3);
//        Point c = new Point(5,8);
        // Создаем точкe 3D
        //Point3D point3D = new Point3D(1, 3, 4);
        Point3D point3D = new Point3D(1);
        point3D.color = "желтого цвета";
        point3D.timeCreates = "11:00";

//        // Выводим их
//        //System.out.println(Point.point(2,2));
//        System.out.println("Точка A: " + a.getText());
//        System.out.println("Точка B: " + b.getText());
//        System.out.println("Точка C: " + c.getText());
        System.out.println();// Пустая строка для разделения
        // Сравниваем
//        System.out.println("A и B одинаковые? " + (a==b));
//        System.out.println("A и C одинаковые? " + (a==c));
//        System.out.println();// Пустая строка для разделения
        System.out.println(point3D.getText());
    }
}