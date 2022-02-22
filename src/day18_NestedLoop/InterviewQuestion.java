package day18_NestedLoop;

public class InterviewQuestion {

    public static void main(String[] args) {

        /*Write a program that can divide two positive numbers without using /(division) and *(multiplication ) and % operators




        int a=20;
        int b=6;

        a-=b; //a=14
        a-=b; //a=8
        a-=b; //a=2

*/
        int x=100;
        int y=8;
        int count=0;


        while(x>=y){
            x-=y;
            count++;
        }

        System.out.println(count);
    }
}
