package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем Соусы
        //Sauce s1 = new Sauce("Ketchup", "острый");
        //Sauce s2 = new Sauce("Masik", "не острый");
        // Создаем Соусы  с использованием enum
        Sauce s1 = new Sauce("Ketchup", SpiceLevel.SPICY);
        Sauce s2 = new Sauce("Mayonnaise", SpiceLevel.NOT_SPICY);
        Sauce s3 = new Sauce("Mustard", SpiceLevel.VERY_SPICY);
        //s2.spiceLevel.getRussianName(jjjj);????
        // Выводим их
        //System.out.println(Point.point(2,2));
        System.out.println("Sauce: " + s1.getText());
        System.out.println("Sauce: " + s2.getText());
        System.out.println("Sauce: " + s3.getText());

    }
}