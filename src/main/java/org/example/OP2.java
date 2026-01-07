package org.example;

public enum OP2 {
    SUM() {
        public double apply(double a, double b) {
            return a + b;
        }
    },
    MINUS() {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    MULT() {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIV() {
        @Override
        public double apply(double a, double b) {
            return a / b;
        }
    };

    public abstract double apply(double a, double b);
}
