package ex30.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class MultiplicationTable {
    public static void printTable() {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++)
                System.out.printf("%4d", i * j);
            System.out.print("\n");
        }
    }
}
