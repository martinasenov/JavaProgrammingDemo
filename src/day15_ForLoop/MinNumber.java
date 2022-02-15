package day15_ForLoop;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {


        /*
        Write a program that asks the user to a number for 5 times
        return the min number
         */

        Scanner scan=new Scanner(System.in);

        int min= 2147483647;  // any number that user enter will be less than 2147483647

        for (int i = 10; i <15 ; i++) {

            System.out.println("enter a number");

            int num= scan.nextInt();

            if (num<min){

                min=num;

            }

        }
            System.out.println("min = " + min);



    }
}
