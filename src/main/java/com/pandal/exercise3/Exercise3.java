package com.pandal.exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        int quantityLitersConsumed = 0;
        double paymentForWaterComsumption = 0;

        Scanner readValue = new Scanner(System.in);
        System.out.println("Ingrese la cantidad total de litros de agua consumido: ");
        quantityLitersConsumed = readValue.nextInt();
        readValue.close();


        System.out.println(" * El costo total a pagar por consumo es de: \t$" + paymentForWaterConsumption(quantityLitersConsumed));

    }

    public static double paymentForWaterConsumption(int quantityLitersConsumed) {
        double fixedPayment = 10;
        double paymentRateForLiterbetween50and200 = 0.5;
        double paymentRateForLiterOver200 = 1.5;

        double paymentForWaterComsumption = 0;
        try {

            // free 50 liters of water consumption
            paymentForWaterComsumption += fixedPayment;

            // between 50 and 200 liters of water consumption
            paymentForWaterComsumption += (quantityLitersConsumed > 50 && quantityLitersConsumed <= 200) ? (quantityLitersConsumed - 50) * paymentRateForLiterbetween50and200 : 0;

            // over 200 liters of water consumption
            paymentForWaterComsumption += (quantityLitersConsumed > 200) ? (150 * paymentRateForLiterbetween50and200) + (quantityLitersConsumed - 200) * paymentRateForLiterOver200 : 0;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return paymentForWaterComsumption;
    }
}
