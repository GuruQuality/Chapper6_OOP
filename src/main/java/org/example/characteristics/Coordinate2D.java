package org.example.characteristics;

import java.util.Optional;

public class Coordinate2D extends Base {
    int x;
    int y;

    public Coordinate2D(int x, int y) {
        name = "Coordinate2D";
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return name + " " + "{" + x + ";" + y + "}";
    }
}
