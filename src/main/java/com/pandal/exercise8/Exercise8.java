package com.pandal.exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        int sizeArray = 0;
        Scanner readValue = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        sizeArray = readValue.nextInt();
        readValue.close();

        int[] array = generateArrayRandom(sizeArray);
        System.out.print("\nArray generado: {" );
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + (i==array.length-1 ? "}" : ","));
        }
        System.out.println("\nEl valor mayor del array es: " + getMayor(array));
        System.out.println("El valor mayor del array es: " + getMayor2(array));

    }
    public static int getMayor(int[] array) {
        int mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (mayor < array[i]) {
                mayor = array[i];
            }
        }
        return mayor;
    }
    public static int getMayor2(int[] array) {
        int mayor = array[0];
        for (int i : array) {
            mayor = (mayor < i) ? i : mayor;
        }
        return mayor;
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
