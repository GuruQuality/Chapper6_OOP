package ru.courses.main;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(java.lang.String[] args) {
        // Создаем точки

        //Integer.parseInt("string");//Парсин строки в int

        // Выводим их
        System.out.println(matchPow(args[0], args[1]));
    }

    public static Double matchPow(String x, String y) {
        int int_x = parseInt(x);
        int int_y = parseInt(y);
        return pow(int_x, int_y);
    }
}