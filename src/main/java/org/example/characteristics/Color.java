package org.example.characteristics;

public class Color extends Base {
    String value;

    public Color(String value) {
        name = "Color";
        this.value = value;
    }

    public String toString() {
        return name + " " + value;
    }
}
