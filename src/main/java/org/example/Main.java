package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем точки
        Figure circle = new Circle(5.0);
        Figure square = new Square(5.0);
        Figure rectangle = new Rectangle(5.0, 4.0);


        // Выводим их
//        System.out.println("Площадь Круга " + circle.getArea());
//        System.out.println("Площадь Квадрата " + square.getArea());
//        System.out.println("Площадь Прямоугольника " + rectangle.getArea());

        List<Figure> figureList = new ArrayList<>();
        figureList.add(circle);
        figureList.add(new Circle(6.0));
        figureList.add(square);
        figureList.add(new Square(6.0));
        figureList.add(rectangle);
        figureList.add(new Rectangle(4, 4));
        //Выводим общую площадь фигур
        System.out.print("Общая площадь фигур " + sumAllAreas(figureList));
    }

    public static Double sumAllAreas(List<Figure> figureList) {
        double sumAll = 0.0;
        for (Figure figure : figureList) {
            sumAll += figure.getArea();
        }
        return sumAll;
    }
}