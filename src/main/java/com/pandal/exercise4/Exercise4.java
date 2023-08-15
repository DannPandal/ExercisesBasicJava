package com.pandal.exercise4;


import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise4 {
    public static void main(String[] args) {

        int number = 0;

        Scanner readValue = new Scanner(System.in);
        System.out.print("Ingrese el numero para iniciar la evaluación de numeros impares: ");
        number = readValue.nextInt();
        readValue.close();


        System.out.print("\n");
        // with function
        printNumberImpar(number);

        // with stream for
        IntStream.range(1, number).filter(n -> n % 2 != 0).forEach(System.out::println);

    }

    private static void printNumberImpar(int number) {
        for (int n = 1; n <= number; n += 2) {
            System.out.println(n);
        }
    }
}
