package day_Scanner;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the radius of the circle");

        double r=input.nextDouble();

        double area = r*r*3.14;
        double circumference= 2*r*3.14;
        System.out.println("area = " + area);
        System.out.println("area = " + circumference);
    }
}
