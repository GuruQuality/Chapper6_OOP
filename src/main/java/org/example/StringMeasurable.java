package org.example;

public class StringMeasurable implements Measurable {
    private String str;

    public StringMeasurable(String str) {
        this.str = str;
    }

    @Override
    public double getLength() {
        return str.length();
    }

    //Доп метод вывода информации
    public void printInfoLenght() {
        System.out.println("(Общая длина строки: " + str.length() + ")");
    }
    @Override
    public String toString() {
        return "Строка: " + str + " ";
    }
}
