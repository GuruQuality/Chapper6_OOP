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
//Содержит три предопределенных значения
//Запрещено создание соуса с некорректной остротой
//VERY_Spicy2
enum SpiceLevel{
    VERY_Spicy("очень острый"),
    SPICY("острый"),
    NOT_SPICY("не острый");

    private final String spiceLevel;

    SpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }
    //возвращает читаемое описание на русском
    public String getRussianName() {
        return spiceLevel;
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