package day15_ForLoop;

public class ForLoopPractices {

    // 15 16 17 17 .........45

    public static void main(String[] args) {


        for(int i=15; i<=45; i++){   //i: 15 16 17 18.............45

            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");


        System.out.println("-------------------------------------------");


        for(int i=100; i>=50; i--) {   // i: 100,99,98.......50

            System.out.print(i + " ");

        }

        System.out.println();
        System.out.println("----------------------------------------------");


            //print all the even numbers between 1~55

            for (int i=1; i<=55; i++){


                if(i%2==0){    //2 4 6 8 10 12 14 16 18 20.....54

                    System.out.print(i+" ");
                }

            }
                    System.out.println();

                    System.out.println("------------------------------------------");


                for (int i=2; i<=54;i+=2){  // second solution, i increases 2 by 2

                    System.out.print(i+" ");
                }








        }

    }

