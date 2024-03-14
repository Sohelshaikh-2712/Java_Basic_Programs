package Com.Sohelshaikh;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args){
        // Java program to find average of three numbers

        // scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double numOne = input.nextDouble();

        System.out.println("Enter second number: ");
        double numTwo = input.nextDouble();

        System.out.println("Enter third number: ");
        double numThree = input.nextDouble();

        // calculating expression
        // formula for finding average : average = N / n
        double total = numOne + numTwo + numThree;
        double average = total / 3;

        // displaying result
        System.out.println("Average of given numbers is: " + average);

    }
}
