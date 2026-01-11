package org.example;

import org.example.characteristics.Base;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Point {
    List<Base> characteristics = new ArrayList<>();

    public void addCharacteristic(Base characteristic) {
        characteristics.add(characteristic);
    }

    // Метод который возвращает точку в виде текста {X;Y}
    public String toString() {
        String result = characteristics.stream().map(Objects::toString).collect(Collectors.joining(";"));
        return "[" + result + "]";
    }
}