package ex26.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class paymentCalculator {
    public static int calculateMonthsUntilPaidOff(String balance, String APR, String monthly_payment) {
        double b = Double.parseDouble(balance);
        double p = Double.parseDouble(monthly_payment);
        double i = (Double.parseDouble(APR) / 100) / 365;
        double part1 = -1.0 / 30;
        double part2 = Math.log10(1 + ((b / p) * (1 - Math.pow(1 + i, 30))));
        double part3 = Math.log10(1 + i);
        double num_months = part1 * part2 / part3;
        return (int) Math.ceil(num_months);
    }
}
