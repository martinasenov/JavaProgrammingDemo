package day10_NestedIF;

public class CharacterIdentity {

    public static void main(String[] args) {
        char ch = '5';


        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");

        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabetic");
        } else {

            System.out.println("Special character");
        }

    }

    }
