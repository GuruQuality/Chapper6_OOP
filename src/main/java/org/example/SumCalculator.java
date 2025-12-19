package org.example;

public class SumCalculator {
    public Double sumAll(Number... numbers) {
        Double sum = 0.0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
