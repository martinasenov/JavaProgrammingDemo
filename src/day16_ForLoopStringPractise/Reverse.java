package day16_ForLoopStringPractise;

public class Reverse {

    public static void main(String[] args) {


        /*
        1. Write a program that can reverse a String
            Ex:
            input:
            Wooden Spoon
            output:
             noopS nedooW
         */

        String str="Wooden Spoon";
        // index:   01234567.....

        String result=""; // contain the reversed version of str
/*
        result +=str.charAt(11);  //n
        result +=str.charAt(10);  //o
        result +=str.charAt(9);   //o
        result +=str.charAt(8);   //p
        result +=str.charAt(7);   //S
        result +=str.charAt(6);   //n
        result +=str.charAt(5);   //e
        result +=str.charAt(4);   //d
        result +=str.charAt(3);   //e
        result +=str.charAt(2);   //o
        result +=str.charAt(1);   //o
        result +=str.charAt(0);   //w


        System.out.println("result = " + result);

*/
        for (int i = str.length()-1; i >=0 ; i--) { // i: index numbers of str (starting from last index to index 0

            result+=str.charAt(i);
        }


        System.out.println("result = " + result);








    }
}
