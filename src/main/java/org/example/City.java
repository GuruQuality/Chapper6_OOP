package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class City {
    //Название Города: строка
    String nameCity = "";
    // Создаем HashMap: Город -> Стоимость поездки
    LinkedHashMap<City, Integer> ways;//LinkedHashMap-для сохранения порядка добавления.

    // Конструктор с названием и начальным набором путей
    City(String nameCity) {
        this.nameCity = nameCity;
        this.ways = new LinkedHashMap<>();
    }

    //добавление нового пути в другой город, указав либо сам путь, либо пару Город-цена
    public void addWay(City city, int cost) {
        this.ways.put(city, cost);
    }

    // Набор путей к следующим городам, где путь представляет собой сочетание Города и стоимости поездки в него

    public City travelBy(int n) {
        // Получаем первый город из множества ключей
        //current = current.ways.keySet().iterator().next();
        if (n == 0) {
            return this;
        } else {
            //Если нет путей - возвращаем null (тупик)
            if (this.ways.isEmpty()) {
                return null;
            }
            City nextCity = this.ways.firstEntry().getKey();
            return nextCity.travelBy(n - 1);
        }
    }

    public String toString() {
        String result = nameCity;
        for (City city : ways.keySet()) {
            Integer cost = ways.get(city);
            result += "\n Город: " + city.nameCity + ", Стоимость: " + cost;
        }
        return result;
    }

}


//При создании Город требует указать название и можно (но не обязательно) указывать набор путей
//Город может возвращать текстовое представление, в виде названия Города и списка связанных с ним Городов (в виде пары: “название: стоимость”)
//Городу в любой момент можно добавить новый путь в другой город, указав либо сам путь, либо пару Город-цена
//Город должен иметь метод путешествия (travelBy). Такой метод принимает число n, который обозначает количество переходов.
// Проще говоря, в текущем списке путей берется первый город, из его списка путей так же берется первый город, из списка
// путей которого в свою очередь берется город и так далее до тех пор, пока либо количество городов не станет равным n, либо у текущего города не окажется путей.
// Метод возвращает последний Город пути или null если мы попали в тупик