package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(op(1, 2, OP.MINUS));
    }

    static int op(int x, int y, OP op) {
        switch (op) {
            case OP.SUM:
                return x + y;
            case OP.MINUS:
                return x - y;
            case OP.MULTY:
                return x * y;
            case OP.DIV:
                return x / y;
        }
        return 0;
    }
}

//Замените
//В методе метод op параметр OP на enum, выполняющий ту же
//самую задачу что и весь метод op.