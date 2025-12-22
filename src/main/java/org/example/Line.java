package org.example;

public class Line implements Cloneable {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Приведение типа к Line
        Line line = (Line) obj;
        // 2. Сравнение линий
        return this.start.equals(line.start) && this.end.equals(line.end);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Line line = new Line((Point) this.start.clone(), (Point) this.end.clone());
        //Line line = new Line(this.start, this.end);
        return line;
    }

    @Override
    public String toString() {
        return start.getText() + " до " + end.getText();
    }
    //Переопределите
    //метод сравнения объектов по состоянию таким образом, чтобы две линии считались
    //одинаковыми в том случае, если их начало и конец расположены в одинаковых
    //точках.
    //
    //Переопределите
    //метод клонирования, унаследованный от класса Object,
    //таким образом, чтобы при его вызове возвращался новый объект Линии, значения
    //полей которого будут копиями оригинальной Линии (т.е. необходимо выполнить
    //глубокое копирование).
}
