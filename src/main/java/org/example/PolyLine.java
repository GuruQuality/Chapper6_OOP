package org.example;

import java.util.Arrays;

public class PolyLine {
    Point[] arrayPoints;

    public PolyLine(Point... points) {
        this.arrayPoints = points;// Создаем массив с одним элементом
    }

    //Получить массив Линий(Не важно как создать новый или вернуть существующий)
    public Line[] getArrayLines() {
        Line[] result = new Line[arrayPoints.length - 1];
        for (int i = 0; i < arrayPoints.length - 1; i++) {
            result[i] = new Line(arrayPoints[i], arrayPoints[i + 1]);
        }
        return result;
    }

    //Расчет длины ломанной
    public double getLength2() {
        double sum = 0.0;
        for (int i = 0; i < arrayPoints.length - 1; i++) {
            sum += Math.sqrt(Math.pow(arrayPoints[i].x - arrayPoints[i + 1].x, 2) + Math.pow(arrayPoints[i].y - arrayPoints[i + 1].y, 2));
        }
        return sum;
    }
    //Расчет длины ломанной
    public double getLength() {
        double sum = 0.0, lenX,lenY;
        for (int i = 0; i < arrayPoints.length - 1; i++) {
            lenX = arrayPoints[i].x - arrayPoints[i + 1].x;
            lenY = arrayPoints[i].y - arrayPoints[i + 1].y;
            //Math.pow - возводим в степень
            sum += Math.sqrt(lenX * lenX + lenY * lenY);
        }
        return sum;
    }
    @Override
    public String toString() {
        return "{" +
                Arrays.toString(arrayPoints) +
                '}';
    }
    //Доп метод вывода информации
    public void printInfoLenght() {
        System.out.println("Общая длина Ломаной: " + getLength());
    }

}
