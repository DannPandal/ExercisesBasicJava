package com.pandal.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        int yearsOld = 0;

        Scanner readValue = new Scanner(System.in);
        System.out.println("Ingrese la edad del usuario: ");
        yearsOld = readValue.nextInt();

        System.out.println("El invitado " + (validatePartyGuestEntry(yearsOld, readValue) ? "si" : "no") + " puede ingresar a la fiesta ");
        readValue.close();

    }

    public static boolean validatePartyGuestEntry(int yearsOld, Scanner readValue) {
        boolean validate = false;
        try {
            if (yearsOld >= 15) {
                //int bringGift = 0;
                System.out.println("Inserte 1 si el invitado trajo regalo; caso contrario, inserte 0: ");
                //bringGift = readValue.nextInt();
                validate = readValue.nextInt() == 1;
            } else {
                validate = true;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            validate = false;
        }
        return validate;
    }
}
