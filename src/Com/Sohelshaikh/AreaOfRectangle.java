package Com.Sohelshaikh;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        // Java program to find area of rectangle

        // defining scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        double length = input.nextDouble();

        System.out.println("Enter width of rectangle: ");
        double width = input.nextDouble();

        // calculating expression
        // Area of Rectangle = length * width
        double areaOfRectangle = length * width;

        // displaying result
        System.out.println("Area of Rectangle: " + areaOfRectangle);
    }
}
