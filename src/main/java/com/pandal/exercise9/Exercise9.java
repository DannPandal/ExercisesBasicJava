package com.pandal.exercise9;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        int sizeArray = 0;
        Scanner readValue = new Scanner(System.in);
        System.out.println("Ingrese tamaño de array para ser generado: ");
        sizeArray = readValue.nextInt();
        readValue.close();

        int[] array = generateArrayRandom(sizeArray);
        readValue.close();

        System.out.print("\nEl array generado es: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        int[] arraySorted = InvertArray(array);
        System.out.print("\nEl array inverso es: ");
        for (int i : arraySorted) {
            System.out.print(i + " ");
        }

    }

    public static int[] generateArrayRandom(int sizeArray) {
        int[] array = new int[sizeArray];
        int numberInit = 1;
        int numberEnd = 200;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * (numberEnd - numberInit + 1) + numberInit);
        }
        return array;
    }

    public static int[] InvertArray(int[] array) {
        int[] arrayInvert = new int[array.length];
        try {
            for (int i = 0; i < array.length; i++) {
                arrayInvert[array.length - i - 1] = array[i];
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return arrayInvert;
    }


}
