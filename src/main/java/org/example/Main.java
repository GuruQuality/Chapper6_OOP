package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаем точки
        Point a = new Point(1, 5);
        Point b = new Point(2, 8);
        Point c = new Point(5, 3);
        Point d = new Point(8, 9);

        Line line1 = new Line(a, b);
        Line line2 = new Line(c, d);
        Line line3 = new Line(b, c);
        System.out.println("line1 " + line1);
        System.out.println("line2 " + line2);
        System.out.println("line3 " + line3);
        System.out.println();// Пустая строка для разделения

        //Вызов массива линий.Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        PolyLineV2 polyLine = new PolyLineV2(a, b, c, d);
        System.out.println("Ломаная " + polyLine);
        System.out.println();// Пустая строка для разделения

        //2 Рассчитать длину Ломаной
        polyLine.printInfoLenght();
        System.out.println();// Пустая строка для разделения

        //3 Получить у Ломаной массив Линий
        Line[] arrayLines = polyLine.getArrayLines();

        //4 Рассчитать длину массива Линий
        double sumLine2 = 0;
        for (int i = 0; i < arrayLines.length; i++) {
            sumLine2 += arrayLines[i].getLength();
        }
        System.out.println("Длина массива линий: " + sumLine2);
        System.out.println();// Пустая строка для разделения

        //6 Измение координаты Точки b {2,8}
        b.x = 12;
        b.y = 8;
        // Проверка изменений в Ломаной, в двух Линиях массива и в точке
        System.out.println("Измененная Ломаная " + polyLine);
        System.out.println("Точка б " + b);
        System.out.println("Линия 1 " + line1 + " Линия 3 " + line3);

        //Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3)

    }
}