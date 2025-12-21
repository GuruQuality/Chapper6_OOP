package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем студента
        Student student = new Student("Алешка", new int[]{7, 4, 9}, new PartyCheckRule());
        Student student2 = new Student("Ванечка", new int[]{6, 5, 12}, new BetweenRule());//создала объект BetweenRule
        //Добавляем Ванечке оценку
        student.addGrade(8);
        student.addGrade(3);
        student.addGrade(5);
        //Student student2 = new Student("СуперВанечка");
        // Выводим его
        System.out.println(student2 + " " + student);
        //System.out.println(student);
    }
}