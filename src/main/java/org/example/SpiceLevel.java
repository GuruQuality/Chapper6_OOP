package org.example;

//Содержит три предопределенных значения
//Запрещено создание соуса с некорректной остротой
//VERY_Spicy2
enum SpiceLevel {
    VERY_SPICY("очень острый"),
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
