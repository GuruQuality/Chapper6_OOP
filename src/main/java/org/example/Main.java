package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Сортировка List
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10000);
        list.add(69);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(55);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
        System.out.println();
        //Сортировка Array
        int[] intArray = new int[]{10000, 69, 2, 8, 4, 55};
        System.out.print("[");
        for (int item : intArray) {
            System.out.print(item + ", ");
        }
        System.out.print("]");
        reverse(intArray);
        System.out.println();
        System.out.print("[");
        for (int item : intArray) {
            System.out.print(item + ", ");
        }
        System.out.print("]");

    }

    // Перестановка чисел в массиве
    public static void reverse(int[] intArray) {
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
    }

    // Перестановка чисел в ArrayList
    public static void reverse(ArrayList<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(n - i));
            intList.set(n - i, temp);
        }
    }
}