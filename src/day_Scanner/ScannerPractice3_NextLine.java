package day_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your full name: ");

        String fullName=input.nextLine();

        System.out.println("Enter your programming language: ");
        String programming= input.nextLine();

        System.out.println("Enter your age:");
        int age= input.nextInt();

        input.nextLine(); // capture the Enter key that is pressed by the user, otherwise the next scanner method will not be executed.

        System.out.println("Enter your school name: ");
        String schoolName=input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);

    }
}
