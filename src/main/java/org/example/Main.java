package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем лист
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N(четное): ");
        Integer n = Integer.parseInt(scanner.nextLine());
        if (n % 2 != 0) {
            throw new RuntimeException("Нечетные числа запрещены");
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        System.out.println("List : " + list);
        //Попарная перестановка
        for (int i = 0; i < n ; i += 2) {
            Integer a = list.get(i);
            Integer b = list.get(i + 1);
            list.set(i, b);
            list.set(i + 1, a);
        }
        // Выводим лист
        System.out.println("List : " + list);

    }
}