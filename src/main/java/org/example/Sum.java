package org.example;

public class Sum {
    public static void main(String[] args) {
        double sumDouble = 0.0;
        //System.out.println("B и C одинаковые? ");
        for (String s : args) {
            double value = 0.0;
            try {
                //Переводим строчку из строки в число
                value = Double.parseDouble(s);
            } catch (NumberFormatException ex) {
            }
            sumDouble += value;
            //System.out.println(value);
        }
        System.out.println(sumDouble);
    }
}