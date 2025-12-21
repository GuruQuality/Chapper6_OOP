package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем точки
        Figure circle = new Circle(5.0);
        Figure square = new Square(5.0);
        Figure rectangle = new Rectangle(5.0,4.0);


        // Выводим их
        System.out.println("Площадь Круга " + circle.getArea());
        System.out.println("Площадь Квадрата " + square.getArea());
        System.out.println("Площадь Прямоугольника " + rectangle.getArea());

    }
}