package com.pandal.exercise7;

public class Factorial {

    public Factorial() {
    }

    public long solveFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
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
