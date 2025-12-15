package org.example;

import java.util.Arrays;

public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point a, Point b, Point c, Point d) {
        super(a,b,c,d);
    }

    @Override
    public double getLength() {
        double sum = super.getLength();
        // Добавляем замыкающий отрезок от последней точки к первой
        double lenX = arrayPoints[0].x - arrayPoints[arrayPoints.length-1].x;
        double lenY = arrayPoints[0].y - arrayPoints[arrayPoints.length - 1].y;
        sum += Math.sqrt(lenX * lenX + lenY * lenY);
        return sum;
    }
    //Доп метод вывода информации
    public void printInfoLenght() {
        System.out.println("Общая длина Замкнутой Ломаной: " + getLength());
    }
}
