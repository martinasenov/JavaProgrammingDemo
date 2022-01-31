package day08_IfStatement;

public class SingleIfStatements {

    public static void main(String[] args) {

        int number= 300;

        boolean evenNumber= number%2==0;

        if (evenNumber){

            System.out.println(number+" is evenNumber");
        }


        if(!evenNumber){  //not even number

            System.out.println(number+" is odd number");
        }

        System.out.println("-------------------------------------------");

        int n=0;
        //positive
        if(n>0){
            System.out.println(n+" is positive");
        }
        // negative
        if (n<0){
            System.out.println(n+" is negative");
        }
        // zero
        if (n==0){
            System.out.println(n+" is zero");
        }
    }
}
