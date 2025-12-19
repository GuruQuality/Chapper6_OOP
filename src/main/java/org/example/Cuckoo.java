package org.example;

import java.util.Random;

public class Cuckoo extends Bird {
    Random rand = new Random();

    @Override
    public void sing() {
        int countSings = rand.nextInt(9);
        while (countSings-- > 0) {
            System.out.print("ку-ку ");
        }
        System.out.println("ку-ку");
    }
}
