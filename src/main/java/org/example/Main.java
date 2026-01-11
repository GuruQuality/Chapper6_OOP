package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static String getStringFromStream(Stream<String> stringStream) {
        //напишите тут ваш код
        String stringJoined = stringStream.collect(Collectors.joining(" "));
        return stringJoined;
    }

    public static void main(String[] args) {
        // Создаем строку
        ArrayList<String> list = new ArrayList<>(Arrays.asList("xx", "ss", "sda", "kkok", "a", "ss"));
        String result = getStringFromStream(list.stream());
        System.out.println(result);
    }
}