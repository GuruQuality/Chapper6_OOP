package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        printList(list);
    }

    public static void printList(ArrayList<Integer> list) {
        Consumer<Integer> consumer = (item) -> System.out.println(item);
        list.forEach(consumer);
    }
}