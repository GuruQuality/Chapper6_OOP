package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем точки
        Point a = new Point(1, 3);
        Point b = new Point(2, 3);
        Point с = new Point(3, 3);
        Point a2 = null;// Инициализируем переменную значением null
        try {
            a2 = (Point) a.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
//        // Выводим их Точки
//        //System.out.println(Point.point(2,2));
//        System.out.println("Точка a: " + a.getText());
//        System.out.println("Точка a2: " + a2.getText());
//        System.out.println();// Пустая строка для разделения
//
//        // Сравниваем Точки
//        System.out.println("A и A2 одинаковые? " + (a.equals(a2)));
//        System.out.println("B и A2 одинаковые? " + (b.equals(a2)));
//        System.out.println();// Пустая строка для разделения

        // Создаем линии
        Line line1 = new Line(a, b);
        Line line2 = new Line(с, b);
        Line line3 = null;// Инициализируем переменную значением null
        try {
            line3 = (Line) line1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //line1.start.x = 10;

//        // Выводим их Линии
//        //System.out.println(Point.point(2,2));
//        System.out.println("Линия line1: " + line1.toString());
//        System.out.println("Линия line2: " + line2.toString());
//        System.out.println("Линия line3: " + line3.toString());
//        System.out.println();// Пустая строка для разделения
//
//        // Сравниваем Линии
//        System.out.println("line1 и line2 одинаковые? " + (line1.equals(line2)));
//        System.out.println("line1 и line3 одинаковые? " + (line1.equals(line3)));

        PolyLine polyLine1 = new PolyLine(new Point(1, 2), new Point(3, 4));
        PolyLine polyLine2 = new PolyLine(new Point(1, 2), new Point(3, 3));
        System.out.println();// Пустая строка для разделения
        // Выводим их Ломанную Линию
        System.out.println("polyLine1: " + polyLine1.toString());
        System.out.println("polyLine2: " + polyLine2.toString());
        System.out.println();// Пустая строка для разделения

        // Сравниваем Две Ломанные Линии
        System.out.println("polyLine1 и polyLine2 одинаковые? " + (polyLine1.equals(polyLine2)));
    }
}