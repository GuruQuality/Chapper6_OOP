package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем города
        City moscow = new City("Москва");
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City F = new City("F");
        //City kazan = new City("Казань");

        moscow.addWay(A, 500);
        moscow.addWay(C,400);
        A.addWay(B,200);
        A.addWay(D,300);
        A.addWay(F,100);
        B.addWay(A,200);
        //A.addWay(kazan, 700);
        System.out.println();// Пустая строка для разделения
        System.out.println(moscow);
        City result = moscow.travelBy(3);
        System.out.println();
        System.out.println("Конечный город: " + result);
    }
}