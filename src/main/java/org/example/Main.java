package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(op(1, 2, 1));
    }

    static int op(int x, int y, int op) {
        switch (op) {
            case 1:
                return x + y;
            case 2:
                return x - y;
            case 3:
                return x * y;
            case 4:
                return x / y;
        }
        return 0;
    }
}
//Замените
//метод op на enum, выполняющий ту же
//самую задачу что и весь метод op.