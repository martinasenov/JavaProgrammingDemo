package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1=20>40;
        System.out.println("result1 = " + result1); //true

        boolean result2= 300>=150;
        System.out.println("result2 = " + result2); //true

        boolean result3=100>=100; //true
        System.out.println("result3 = " + result3);

        boolean result4= 300>=500;
        System.out.println("result4 = " + result4);

        int creditScore=745;
        boolean isEligibleForLoan= creditScore>=720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan); //if the credit score is 720 or greater, then it's eligible for loan

        boolean result5=100<120; //true
        System.out.println("result5 = " + result5);

        int score=75;
        boolean hasFailed= score<=59;
        System.out.println("hasFailed = " + hasFailed);

        boolean result7=45<=60;
        System.out.println("result7 = " + result7);

        int x=100;
        int y=200;
        boolean equal= x==y;
        System.out.println("equal = " + equal);

        boolean result9= 'A'=='a';
        System.out.println("result9 = " + result9);

        boolean result11=100 !=200.5; // true
        System.out.println("result11 = " + result11);

        boolean result12= "JAVA" != "BREAK";
        System.out.println("result12 = " + result12);

    }
}
