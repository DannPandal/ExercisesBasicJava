package com.pandal.exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        int sizePrint = 0;
        Scanner readValue = new Scanner(System.in);
        System.out.print("Ingrese el tamaño para imprimir la secuencia: ");
        sizePrint = readValue.nextInt();
        readValue.close();

        printSequence(sizePrint);
        printSequence2(sizePrint);
    }

    private static void printSequence(int sizePrint) {
        System.out.println("\nSecuencia generada: ");
        for (int i = 1; i <= sizePrint; i++) {
            System.out.println( "* ".repeat(i) );
        }
    }
    private static void printSequence2(int sizePrint) {
        System.out.println("\nSecuencia generada 2: ");
        for (int i = 1; i <= sizePrint; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}
