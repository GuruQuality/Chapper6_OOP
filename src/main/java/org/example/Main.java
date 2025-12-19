package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);
        //Fraction result = f1.sum(f2).sum(f3).minus(5);
//        System.out.println("Fraction = " + result);
//        System.out.println("intValue: " + f1.intValue());
//        System.out.println("longValue: " + f1.longValue());
//        System.out.println("floatValue: " + f1.floatValue());
//        System.out.println("doubleValue: " + f1.doubleValue());
//
//        // Демонстрация, что Fraction действительно подтип Number
//        System.out.println("\nИспользование как Number:");
//        Number num = result;
//        System.out.println("Number.intValue(): " + num.intValue());
//        System.out.println("Number.doubleValue(): " + num.doubleValue());
        SumCalculator sumCalculator = new SumCalculator();
        double result2 = sumCalculator.sumAll(
                2, new Fraction(3, 5), 2.3,
                3.6, new Fraction(49, 12), 3, new Fraction(3, 2),
                new Fraction(1, 3), 1
        );
        System.out.println(result2);

    }
}
