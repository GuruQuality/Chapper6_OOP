package org.example;

import org.example.characteristics.Color;
import org.example.characteristics.Coordinate2D;
import org.example.characteristics.ShowTime;

public class Main {
    public static void main(String[] args) {
        // Создаем точку
        Point a = new Point();
        // Создаем характеристику
        a.addCharacteristic(new Coordinate2D(1, 2));
        a.addCharacteristic(new Color("Желтый"));
        a.addCharacteristic(new ShowTime("11:00"));
        // Выводим их
        System.out.println(a);// Пустая строка для разделения
    }
}