package com.pandal.exercise7;

public class Factorial {
    private int number;

    public Factorial() {
    }

    public Factorial(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long solveFactorial() {
        long factorial = 1;
        for (int i = 1; i <= this.number; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public long solveFactorialRecursive(int number) {
        if (number == 0) {
            return 1;
        }
        return number * solveFactorialRecursive(number - 1);
    }
}
