package day17_White_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {



        String str="AAABBBC";


        char ch='B';

        int frequency=0; //+1+1+1 ==> 3

        for (int i = 0; i <str.length() ; i++) {  // i:indexes of str

            char eachChar=str.charAt(i);  //eachChar:each character of str


            // 'A'== 'A'
            if(ch==eachChar){ // if the given ch is matching with the eachChar, then ch shows up in the String

                frequency++;
            }

            }
        System.out.print(frequency);




    }
}





        /*1. Write a program that can return the frequency of a char from a
String
Ex:
str = "AAABBBC"
ch = 'A'
Output:
3*/