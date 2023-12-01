package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = input.nextDouble();
        input.close();
        double A = Circle.getArea(r);
        System.out.println("The area of the circle is "+ A);


    }
}
