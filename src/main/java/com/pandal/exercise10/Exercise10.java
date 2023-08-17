package com.pandal.exercise10;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        // Escriba un programa en el que el usuario debe adivinar un número aleatorio
        // entre 1 y 100. El programa proporcionará pistas si el número es demasiado alto
        // o demasiado bajo. El juego continuará hasta que el jugador adivine correctamente
        // el número. Al final, imprima el número y la cantidad de intentos realizados.

        int numberRandom = generatNumberRandom(1, 100);
        int count = 0;

        System.out.println("\n **** Adivine el número **** ");

        Scanner readValue = new Scanner(System.in);
        while (true) {
            count++;
            int number = readNumber(readValue);
            if (number == numberRandom) {
                System.out.println("¡Felicidades! ¡Haz adivinado el número!");
                System.out.printf("Tuviste %d intentos", count);
                break;
            }
//            int diference = Math.abs(numberRandom - number);
//            if (diference > 60) {
//                System.out.print("Estas frio, ");
//            } else if (diference > 30) {
//                System.out.print("Estas tibio, ");
//            } else if (diference > 10) {
//                System.out.print("Estas caliente, ");
//            } else {
//                System.out.print("Estas quemando, ");
//            }

            int diference = numberRandom - number;
            if (diference >= 9){
                System.out.print("Número demasiado bajo");
            } else if (diference <= -9) {
                System.out.print("Número demasiado alto");
            } else {
                System.out.print("Estas cerca");
            }
            System.out.println(", intenta nuevamente...");
        }

        readValue.close();
    }

    public static int generatNumberRandom(int numberInit, int numberEnd) {
        return (int) Math.floor(Math.random() * (numberEnd - numberInit + 1) + numberInit);
    }

    public static int readNumber(Scanner readValue) {
        int number = 0;
        System.out.print("\nIngresa un número: ");
        number = readValue.nextInt();
        return number;
    }
}
