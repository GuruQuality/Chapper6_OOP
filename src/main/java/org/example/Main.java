package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем точки
        Point a = new Point(1,3);
        Point b = new Point(5,8);
        Point c = new Point(10,11);
        Point d = new Point(15,19);

        Line line1 = new Line(a,b);
        Line line2 = new Line(c,d);
        Line line3 = new Line(b,c);
        System.out.println("line1 "+ line1);
        System.out.println("line2 "+ line2);
        System.out.println("line3 "+ line3);
        // Выводим текствое представление линии 3
        System.out.println("Линия 3 : " + line3);
        System.out.println();// Пустая строка для разделения
        //Изменяем координаты линии 3
        b.x = 6;
        c.x = 7;
        System.out.println("line1 "+ line1);
        System.out.println("line2 "+ line2);
        System.out.println("line3 "+ line3);
        System.out.println();// Пустая строка для разделения
        // Выводим текствое представление линии 3 после изменения координат
        System.out.println("Линия 3 : " + line3);

        // Суммарная длина всех линий
        double sumLine = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Cуммарная длина всех трех линий  " + sumLine);
    }
}