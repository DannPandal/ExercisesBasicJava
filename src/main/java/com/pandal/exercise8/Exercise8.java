package com.pandal.exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        int number = 0;
        Scanner readValue = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        number = readValue.nextInt();

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el valor del elemento " + (i + 1) + ": ");
            array[i] = readValue.nextInt();
        }
        readValue.close();

        System.out.println("El valor mayor del array es: " + getMayor(array));
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


}
