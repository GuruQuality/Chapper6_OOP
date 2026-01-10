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
        bubbleSort(list);
        System.out.println(list);
        System.out.println();
        //Сортировка Array
        int[] intArray = new int[]{10000, 69, 2, 8, 4, 55};
        System.out.print("[");
        for (int item : intArray) {
            System.out.print(item + ", ");
        }
        System.out.print("]");
        bubbleSort(intArray);
        System.out.println();
        System.out.print("[");
        for (int item : intArray) {
            System.out.print(item + ", ");
        }
        System.out.print("]");

    }

    // Создаем сортуровку для листа
    public static void bubbleSort(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
    }

    public static void bubbleSort(int[] intArray) {
        // Реализовать сортировку для массива
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }

}