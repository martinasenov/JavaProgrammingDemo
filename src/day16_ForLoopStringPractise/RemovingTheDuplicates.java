package day16_ForLoopStringPractise;

public class RemovingTheDuplicates {

    public static void main(String[] args) {

        // AABBCCBC    REMOVE THE DUPLICATES


        String str="aabbaacc";

        String result="";


        for (int i = 0; i <str.length() ; i++) {  //i: represents the all the index numbers of str (start from 0)

            String ch=""+str.charAt(i);  // represents each character of str

            if(!result.contains(ch))
            result+=ch;  //te character will be added to the result

        }

        System.out.println(result);

    }
}
