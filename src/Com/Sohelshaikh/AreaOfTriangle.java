package Com.Sohelshaikh;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        // Java program to find area of triangle

        // scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base of triangle: ");
        double base = input.nextDouble();

        System.out.println("Enter the height of triangle: ");
        double height = input.nextDouble();

        // calculating expression
        // formula for finding area of triangle: Area=(1/2) * base * height
        double areaOfTriangle = (0.5) * (base * height);

        // displaying result
        System.out.println("Area of triangle for given values is: " + areaOfTriangle);
    }
}
