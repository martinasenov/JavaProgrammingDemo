package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {


        /*
        Score
        90~100 ==> Excellent
        80~89==> Great
        70~79==> Good
        60~69==> Passed
         0~59==> Failed
         */

        int score=95;

        boolean a=score>=90 && score <=100;
        boolean b=score>=80 && !a; // or score <=89
        boolean c=score>=70 && !a && !b;  // or score <=79
        boolean d=score >=60 && score <=69;
        boolean f= !a && !b && !c && !d;

        if (a){

            System.out.println("Excellent");
        }

        if(b){
            System.out.println("Great");
        }

        if(c){

            System.out.println("Good");
        }

        if(d){

            System.out.println("Passed");
        }

        if(f){

            System.out.println("Failed");
        }


    }
}
