package java.awt1;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Метод который возвращает точку в виде текста {X;Y}
    public String getText() {
        return "{" + x + ";" + y + "}";
    }
}
