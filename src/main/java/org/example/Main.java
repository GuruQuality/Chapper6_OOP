package org.example;

import employe.*;
//import employe.Employee;

public class Main {
    public static void main(java.lang.String[] args) {
        Department department1 = new Department("Тестирование Букашек");
        Department department2 = new Department("Тестирование Птичек");
        Employee boss = new Employee("Mask", department1);
        Employee bossTEST = new Employee("Mask_Replick", department2);//cсоздала сотрудника 2-го департамента
        // Создаем точки
        Employee employee = new Employee("Петя", department1);
        department1.setBoss(boss);
        department1.setBoss(bossTEST);//переназначение боса департамента "Тестирование Букашек"

        // Выводим их
        System.out.println(employee);
        System.out.println(boss);
    }
}
