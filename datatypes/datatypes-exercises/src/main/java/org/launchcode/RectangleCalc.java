package org.launchcode;
import java.util.Scanner;
public class RectangleCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?:");
        double num = input.nextDouble();
        System.out.println("What is the width of your rectangle?:");
        double num2 = input.nextDouble();
        input.close();
        double area = num * num2;
        System.out.println("The area of your rectangle is " + area);
    }
}
