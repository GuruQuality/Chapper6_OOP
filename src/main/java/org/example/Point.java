package org.example;

public class Point {
    int x;
    int y;
    // Конструктор - создает точку с заданными координатами
    Point(int x, int y){
         this.x = x;
         this.y = y;
    }
    // Метод который возвращает точку в виде текста {X;Y}
    public String getText(){
        return "{" + x + ";" + y +"}";
    }
    public boolean equals(Point obj) {
        return (this.x == obj.x) && (this.y == obj.y);
    }
}