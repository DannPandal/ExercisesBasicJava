package com.pandal.exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        double paymentForHour = 40;
        int quantityHoursWorked = 0;

        Scanner readValue = new Scanner(System.in);
        System.out.println("Ingrese la cantidad total de horas trabajadas: ");
        quantityHoursWorked = readValue.nextInt();
        readValue.close();

        calculatePaymentForWorked(quantityHoursWorked, paymentForHour);
    }

    public static void calculatePaymentForWorked(int quantityHoursWorked, double paymentForHour) {
        double paymentForWorked = 0;
        try {
            int quantityHoursWorkedExtraGreater48 = quantityHoursWorked > 48 ? quantityHoursWorked - 48 : 0;
            int quantityHoursWorkedExtraGreater40 = quantityHoursWorked > 40 ? quantityHoursWorked - quantityHoursWorkedExtraGreater48 - 40 : 0;
            int quantityHoursWorkedNormal = quantityHoursWorked - quantityHoursWorkedExtraGreater48 - quantityHoursWorkedExtraGreater40;

            paymentForWorked += quantityHoursWorkedExtraGreater48 * paymentForHour * 3;
            paymentForWorked += quantityHoursWorkedExtraGreater40 * paymentForHour * 2;
            paymentForWorked += quantityHoursWorkedNormal * paymentForHour;

            System.out.println("**** Pago por labores ******* \n ");
            System.out.println(" * Costo por Hora: \t$" + paymentForHour);
            System.out.println(" * Por horas normal: \t" + quantityHoursWorkedNormal + " horas \t\t $" + quantityHoursWorkedNormal * paymentForHour);
            System.out.println(" * Por horas extras > 40: " + quantityHoursWorkedExtraGreater40 + " horas \t\t $" + ( quantityHoursWorkedExtraGreater40 * paymentForHour * 2 ));
            System.out.println(" * Por horas extras > 48: " + quantityHoursWorkedExtraGreater48 + " horas \t\t $" + ( quantityHoursWorkedExtraGreater48 * paymentForHour * 3 ));
            System.out.println("\n\t\t\t * Total pago: " + paymentForWorked);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}
