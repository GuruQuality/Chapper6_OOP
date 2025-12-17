package org.example;

public class Fraction extends Number{
    private int numerator = 0;//числитель
    private int denominator = 0;//denominator

    //Конструктор с начальными объектами
    Fraction(int numerator, int denominator) {
        this.setValuens(numerator, denominator);
    }

    //Конструктор для целых чисел
    Fraction(int wholeNumber) {
        this(wholeNumber, 1);
    }

    //Метод проверки данных
    private void setValuens(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель не может быть меньше или равно нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Метод сложения с дробью
    public Fraction sum(Fraction fraction2) {
        return sumFraction(this, fraction2);
    }
    //Метод сложения с целым числом
    public Fraction sum(int integer) {
        Fraction fraction2 = new Fraction(integer,1);
        return sumFraction(this, fraction2);
    }

    //Метод вычитания дроби с дробью
    public Fraction minus(Fraction fraction1) {
        return subtraction(this,fraction1);
    }

    //Метод вычитания целого числа
    public Fraction minus(int integer) {
        Fraction fraction2 = new  Fraction(integer,1);
        return subtraction(this,fraction2);
    }

    //Метод сложения двух дробей
    public static Fraction sumFraction(Fraction fraction1, Fraction fraction2) {
        //Приводим к общему знаминателю
        int newNumerotor = 0;
        int comonDemoniator = 0;
        if (fraction1.denominator != fraction2.denominator) {
            comonDemoniator = fraction1.denominator * fraction2.denominator;
            newNumerotor = (fraction1.numerator * fraction2.denominator) + (fraction2.numerator * fraction1.denominator);
        } else {
            comonDemoniator = fraction1.denominator;
            newNumerotor = fraction1.numerator + fraction2.numerator;
        }
        return new Fraction(newNumerotor, comonDemoniator);
    }

    //Метод вычитания с другой Дробью
    public static Fraction subtraction(Fraction fraction1, Fraction fraction2) {
        //Приводим к общему знаминателю
        int comonDemoniator = fraction1.denominator * fraction2.denominator;
        int newNumerotor = (fraction1.numerator * fraction2.denominator) - (fraction2.numerator * fraction1.denominator);
        return new Fraction(newNumerotor, comonDemoniator);
    }
    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    // Метод печати результата
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
