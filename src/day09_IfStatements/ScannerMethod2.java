package day09_IfStatements;

import java.util.Scanner;

public class ScannerMethod2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first sentence");

        String firstSentence=input.nextLine();

        System.out.println("Enter your second sentence");
        String secondSentence= input.nextLine();

        System.out.println("firstSentence = " + firstSentence);
        System.out.println("secondSentence = " + secondSentence);


    }
}
