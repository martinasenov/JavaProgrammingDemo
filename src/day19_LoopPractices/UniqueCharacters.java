package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {


String str="aabccdeef";

String result=""; //bdf




        for (int j = 0; j <str.length() ; j++) {

            char ch=str.charAt(j);
            int count=0; //represents the freq, of the ch



        for (int i = 0; i <str.length() ; i++) { // compares the character that outer loop picked, with each character

            char each=str.charAt(i); // each character of str
            if(ch==each){
                count++;
            }

        }

        if(count!=1){ // if the freq, of the character is not equal to 1 skip it
            continue;

        }

         result+=ch;
        }

        System.out.println(result);
    }
}
        /*


        2. Write a program that can find the unique characters from a string
without using indexOf() and lastIndexOf() methods
Ex:
str = "aabccdeef";
output:
bdf

*/