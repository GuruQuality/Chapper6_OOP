package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем студента
        Student student = new Student("Ванечка", new int[]{7, 4, 9});
        //Добавляем Ванечке оценку
        student.addGrade(5);
        student.addGrade(3);
        System.out.println("Оценки Ванечки до удаления" + student.getGrades());
        ArrayList<Integer> grades = student.getGrades();
        grades.remove(0); //
        System.out.println("Оценки Ванечки после удаления" + student.getGrades());
        student.addGrade(5);
        Student student2 = new Student("СуперВанечка");
        // Выводим его
        System.out.println("Рейтинг всех студентов: " + student2 + " " + student);
    }
}