package org.example;

import java.util.Optional;

public class Point3D extends Point {
    Optional<Integer> z = null;
    String color;
    String timeCreates;

    Point3D(int x) {
        super(x);
    }

    Point3D(int x, Optional<Integer> y) {
        super(x, y);
    }

    Point3D(int x, Optional<Integer> y, Optional<Integer> z) {
        super(x, y);
        this.z = z;
    }

    // Убираем закрывающую скобку и добавляем z
    @Override
    public String getText() {
        String parentString = super.getText();
        StringBuilder result = new StringBuilder();
        result.append("Точка в координате {");
        result.append(this.x);
        if (y != null) {
            result.append("," + this.y);
        }
        if (z != null) {
            result.append("," + this.z);
        }
        result.append("} ");
        if (timeCreates != null) {
            result.append("в " + this.timeCreates);
        }
        if (color != null) {
            result.append(", " + this.color);
        }
        return result.toString();
        //substring —  часть извлеченной строки,по указанным начальной и/или конечному (индексам), возвращаем новый, меньший строковый фрагмент, но не изменяя оригинал
//        return parentString.substring(0, parentString.length() - 1) + ";"
//                + z + "} " + "в " + timeCreates + ", " + color;
    }
}
