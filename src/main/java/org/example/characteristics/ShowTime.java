package org.example.characteristics;

public class ShowTime extends Base {
    String value;

    public ShowTime(String value) {
        name = "ShowTime";
        this.value = value;
    }

    public String toString() {
        return name + " " + value;
    }
}
