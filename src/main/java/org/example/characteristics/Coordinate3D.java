package org.example.characteristics;

public class Coordinate3D extends Base {
    int x;
    int y;
    int z;

    public Coordinate3D(int x, int y, int z) {
        name = "Coordinate3D";
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return name + " " + "{" + x + ";" + y + ";" + z + "}";
    }
}
