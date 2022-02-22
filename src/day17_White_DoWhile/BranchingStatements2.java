package day17_White_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {


        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {

                continue;     // skipping
            }

            System.out.println(i);  //A B D E

        }


        System.out.println("-------------------------------------------");


        //print all even numbers 1~10

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 1) {

                continue;


            }

            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("------------------------------------------");

        for (int i =1; i<=10 ; i++) {

            if (i%2==0){

                continue;
            }
            System.out.print(i+" ");
        }

    }
}
