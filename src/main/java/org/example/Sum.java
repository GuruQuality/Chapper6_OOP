package org.example;

public class Sum {
    public static void main(String[] args) {
        double sumDouble = 0.0;

        for (String s : args) {
            double value = 0.0;
            //try {
            //Переводим строчку из строки в число
            if (checkValue(s)) {
                value = Double.parseDouble(s);
            }
            //} catch (NumberFormatException ex) {}
            sumDouble += value;
            //System.out.println(value);
        }
        System.out.println(sumDouble);
    }

    //Проверка числа в строке
    private static boolean checkValue(String args) {
        //Перебор символов в строке
        for (char simbol : args.toCharArray()) {
            if (simbol < 48 || simbol > 57) {
                return false;
            }
        }
        return true;
    }
}