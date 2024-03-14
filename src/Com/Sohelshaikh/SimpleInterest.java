package Com.Sohelshaikh;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        // Java program to find simple interest

        // defining scanner class for user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Principle amount: ");
        double principleAmount = input.nextDouble();

        System.out.println("Enter the time in Months: ");
        double timeInMonths = input.nextDouble();

        System.out.println("Enter the interest rate per year: ");
        double interestRatePerYear = input.nextDouble();

        // calculating the expression
        /* formula for finding simple interest
        simple interest = (principal amount × interest rate × time) / 100
        */
        double simpleInterest = (principleAmount * interestRatePerYear * timeInMonths) / 100;

        // displaying result
        System.out.println("Simple Interest for given values is: " + simpleInterest);

        // total amount to pay
        double totalAmount = principleAmount + simpleInterest;
        System.out.println("Total amount to pay is :"+totalAmount);

    }
}
