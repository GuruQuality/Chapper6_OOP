package org.example;

import java.util.Random;

public class Parrot extends Bird {
    String text = "";
    Random rand = new Random();

    Parrot(String text) {
        this.text = text;
    }

    @Override
    public void sing() {
        int countChar = rand.nextInt(text.length())+1;
        for (int i = 0; i <= countChar - 1; i++) {

            System.out.print(text.substring(i,i+1));
        }
        System.out.println();
    }
}
