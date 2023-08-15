package com.pandal.exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        int sizeArray = 0;
        Scanner readValue = new Scanner(System.in);
        System.out.println("Ingrese tamaño de array para ser generado: ");
        sizeArray = readValue.nextInt();
        readValue.close();

        int[] array = generateArrayRandom(sizeArray);
        for (int i = 0; i < array.length; i++) {
            System.out.println("El elemento " + i + " es: " + array[i]);
        }
    }

    private static int[] generateArrayRandom(int sizeArray) {
        int[] array = new int[sizeArray];
        int numberInit = 1;
        int numberEnd = 200;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * (numberEnd - numberInit + 1) + numberInit);
        }
        return array;
    }
}

