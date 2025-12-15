package org.example;

public class Point3D extends Point {
    private final int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    // Убираем закрывающую скобку и добавляем z
    @Override
    public String getText() {
        String parentString = super.getText();
        //substring —  часть извлеченной строки,по указанным начальной и/или конечному (индексам), возвращаем новый, меньший строковый фрагмент, но не изменяя оригинал
        return parentString.substring(0,parentString.length()-1) + ";"
 + z + "}";
    }
}
