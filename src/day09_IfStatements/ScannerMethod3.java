package day09_IfStatements;

import java.util.Scanner;

public class ScannerMethod3 {
    public static void main(String[] args) {


    Scanner input=new Scanner(System.in);

        System.out.println("Enter your Score");
        int score = input.nextInt(); //85+Enter will be taken as an input

        input.nextLine(); // by using this method we erase the ENTER input from the memory

        System.out.println("Enter your full name");
        String fullName=input.nextLine();

        System.out.println("score = " + score);
        System.out.println("fullName = " + fullName);


    }
}
