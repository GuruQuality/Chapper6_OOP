package org.example;

public class Sauce {
    String name;
    private SpiceLevel spiceLevel;

    // Конструктор - создает точку с заданными координатами
    Sauce(String name, SpiceLevel spiceLevel) {
        this.name = name;
        this.spiceLevel = spiceLevel;
    }

    // Метод который возвращает название суоса и остроты
    public String getText() {
        return name + " " + spiceLevel.getRussianName();
    }
}
//Создайте
//класс Соус, который описывается:
//
//Название: строка
//Острота: одно из {очень острый, острый, не острый}
//При создании требует указать название и остроту
//Может возвращать текстовое представление вида “Соус НАЗВАНИЕ: ОСТРОТА”
//Гарантируйте, что острота соуса может указываться
//только одним из предопределенных значений.