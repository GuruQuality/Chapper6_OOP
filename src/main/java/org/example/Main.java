package org.example;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        Dog dog = new Dog("Lolik", 2.0, new ArrayList<>(Arrays.asList("Caesar", "Barsik", "Betty")));
        // Обнулить все поля кроме примитивов
        System.out.println("До обнуления полей" + cat);
        ObjectNullifier.nullifyObject(cat);
        System.out.println("После обнуления полей" + cat);
        System.out.println();
        System.out.println("До обнуления полей" + dog);
        ObjectNullifier.nullifyObject(dog);
        System.out.println("После обнуления полей" + dog);
    }
}