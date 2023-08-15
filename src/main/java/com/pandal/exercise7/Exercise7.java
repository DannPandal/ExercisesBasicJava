package com.pandal.exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        int number = 5;
        Scanner readValue = new Scanner(System.in);
        System.out.print("Ingrese el número para hallar el factorial: ");
        number = readValue.nextInt();
        readValue.close();

        Factorial factorial = new Factorial( number);
        System.out.println("El factorial de " + number + "! es: " + factorial.solveFactorial());
        System.out.println("El factorial de " + number + "! es: " + factorial.solveFactorialRecursive(number));

    }
}
