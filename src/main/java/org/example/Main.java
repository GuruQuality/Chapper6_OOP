package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем студента
        Student student = new Student("Ванечка", new int[]{7, 4, 9});
        //Добавляем Ванечке оценку
        student.addGrade(5);
        student.addGrade(3);
        student.addGrade(5);
        Student student2 = new Student("СуперВанечка");
        // Выводим его
        System.out.println(student2 + " " + student);
    }
}