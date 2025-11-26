package org.example;

import java.util.Arrays;

public class PolyLineV2 {
    // (...) означают,что метод или конструктор может принимать любое количество аргументов указанного типа
    Point[] arrayPoints;//это массив объектов типа Point

    PolyLineV2(Point... points) {
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

    @Override
    public String toString() {
        return "{" +
                Arrays.toString(arrayPoints) +
                '}';
    }

    //Расчет длины ломанной
    public double getLength() {
        double result = 0.0;
        for (int i = 0; i < arrayPoints.length - 1; i++) {
            result += Math.sqrt(Math.pow(arrayPoints[i].x - arrayPoints[i + 1].x, 2) + Math.pow(arrayPoints[i].y - arrayPoints[i + 1].y, 2));
        }
        return result;
    }
    //Доп метод вывода информации
    public void printInfoLenght() {
        System.out.println("Общая длина Ломаной: " + getLength());
    }
}



