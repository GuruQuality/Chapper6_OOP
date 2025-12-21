package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student {
    private String name = "";
    private ArrayList<Integer> grades = new ArrayList<>();//обявили свойство (ссылку на объект)
    private Rule rule;

    // Конструктор - создает точку с заданными координатами
    Student(String name, Rule rule) {
        this(name, new int[0], rule);
//        this.name = name;
//        this.rule = rule;
    }

    // Конструктор - создает точку с заданными координатами
    Student(String name, int[] grades, Rule rule) {
        this.name = name;
        this.rule = rule;
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
        if (rule.validate(grade)) {//вызов метода валидации у конкретного Правила через Свойчтво rule
            this.grades.add(grade);
        }
    }
}
