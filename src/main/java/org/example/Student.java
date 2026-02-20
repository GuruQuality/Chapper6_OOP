package org.example;

import java.util.ArrayList;

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

    //Метод вывода студентов с оценками
    @Override
    public String toString() {
        return name + ": " + grades;
    }

    public void addGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            this.grades.add(grade);
        } else {
            System.out.println("Оценка " + grade + " не добавлена. Допустимы оценки от 2 до 5.");
        }
    }

    public ArrayList<Integer> getGrades() {
        return new ArrayList<>(grades);//возрат копии
    }
}