package day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {


/*
Write a program that asks the user to enter a number for 5 times

 */

        Scanner scan=new Scanner(System.in);

        int max=-2147483648; // any user entered number will be greater than this value

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            int num=scan.nextInt();

            if(num>max){ // if the user entered number that is greater than current maximum number

                max=num;


            }

        }

        System.out.println("max = " + max);
    }
}
