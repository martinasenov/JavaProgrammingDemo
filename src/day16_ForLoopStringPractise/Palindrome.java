package day16_ForLoopStringPractise;

public class Palindrome {

    public static void main(String[] args) {


        String word="Civic";

        String reversed="";

        for (int i = word.length()-1; i >=0 ; i--) {


        }

        boolean isPalindrome=word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);
    }
}
