package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student {
    private String name = "";
    private ArrayList<Integer> grades = new ArrayList<>();//обявили свойство (ссылку на объект)

    // Конструктор - создает точку с заданными координатами
    Student(String name) {
        //this(name, new int[0]);
        this.name = name;
    }

    // Конструктор - создает точку с заданными координатами
    Student(String name, int[] grades) {
        this.name = name;
        for (int grade : grades) {
            this.addGrade(grade);
        }
    }

    //Метод вывода оценкок
    @Override
    public String toString() {
        return name + ": " + grades;
    }

    public void addGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            this.grades.add(grade);
        }
    }
}
//Создайте класс Студент (Student), которая описывается:
//Имя (name): строка
//Оценки (grades): массив целых чисел
//При создании обязательно указать имя, и опционально набор оценок
//Может возвращать текстовое представление вида “Имя: [оценка1, оценка2,…,оценкаN]” (toString)
//Оценки можно добавлять в любой момент, но нельзя удалять
//Все оценки должны быть в диапазоне от 2 до 5
//Весь набор оценок можно получить в любой момент
//Задача
//считается решенной корректно, если выполняются требования инкапсуляции.