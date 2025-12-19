package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем точки
        Bird sparrow = new Sparrow();
        Bird cuckoo = new Cuckoo();
        Bird parrot = new Parrot("I'm Parrot");


        // Выводим их
        sparrow.sing();
        cuckoo.sing();
        parrot.sing();
    }
}