package day17_White_DoWhile;

import java.util.Scanner;

public class BranchingStatements {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        for (char i = 'A'; i <='Z' ; i++) {


            System.out.print(i+" ");

            if(i=='G'){
                break;
            }



        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------");


        while(true){
            System.out.println("Enter a number: ");
            int num=scan.nextInt();

            if(num<0){
                break;
            }

        }

    }
}
