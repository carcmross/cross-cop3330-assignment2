package ex26.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution26 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        paymentCalculator pc = new paymentCalculator();
        String balance = getBalance();
        String APR = getAPR();
        String monthly_payment = getMonthlyPayment();
        int months_left = pc.calculateMonthsUntilPaidOff(balance, APR, monthly_payment);
        String outputString = generateOutput(months_left);
        System.out.println(outputString);
    }


    public static String generateOutput(int months_left) {
        return "It will take you " + months_left + " months to pay off this card.";
    }

    public static String getBalance() {
        System.out.print("What is your balance? ");
        return in.nextLine();
    }

    public static String getAPR() {
        System.out.print("What is the APR on the card (as a percent)? ");
        return in.nextLine();
    }

    public static String getMonthlyPayment() {
        System.out.print("What is the monthly payment you can make? ");
        return in.nextLine();
    }
}
