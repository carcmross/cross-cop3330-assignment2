package ex36.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution36 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        StatisticalOperations so = new StatisticalOperations();
        List<Integer> nums = new ArrayList<>();
        String newNum = "";

        boolean isLastNum = false;
        boolean isValidNum = true;
        while (isLastNum == false) {
            isValidNum = true;
            newNum = addNum();
            if (newNum.equals("done"))
                break;
            if (so.isValidNumber(newNum) == false) {
                isValidNum = false;
                continue;
            }
            nums.add(Integer.parseInt(newNum));
        }
        String outputString = generateOutput((ArrayList) nums);
        System.out.println(outputString);
    }

    public static String addNum() {
        System.out.print("Enter a number: ");
        return in.nextLine();
    }

    public static String generateOutput(ArrayList nums) {
        StatisticalOperations so = new StatisticalOperations();
        int array_size = nums.size();

        String outputString = "Numbers: ";
        for (int i = 0; i < array_size; i++) {
            if (i != array_size - 1)
                outputString += nums.get(i) + ", ";
            else
                outputString += nums.get(i);
        }
        double mean = so.average(nums);

        outputString += "\nThe average is " + mean;
        outputString += "\nThe minimum is " + so.min(nums);
        outputString += "\nThe maximum is " + so.max(nums);
        outputString += String.format("\nThe standard deviation is %.2f", so.std(nums, mean));

        return outputString;
    }
}
