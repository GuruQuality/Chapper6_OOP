package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем точки
        Bird sparrow = new Sparrow();
        Bird cuckoo = new Cuckoo();
        Bird parrot = new Parrot("I'm Parrot");

//        // Выводим их
//        sparrow.sing();
//        cuckoo.sing();
//        parrot.sing();

        List<Bird> birdCage = new ArrayList<>();
        birdCage.add(sparrow);
        birdCage.add(new Sparrow());
        birdCage.add(cuckoo);
        birdCage.add(new Cuckoo());
        birdCage.add(parrot);
        birdCage.add(new Parrot("Parrot !!!"));

        sings(birdCage);
    }

    public static void sings(List<Bird> birdCage) {
        for (Bird bird : birdCage) {
            bird.sing();
        }
    }
}