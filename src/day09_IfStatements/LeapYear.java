package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year =2022;

        boolean leapyear= year%4==0;

        if (leapyear){

            System.out.println("Year "+year+" is a leap year");
        }
        if (!leapyear){
            System.out.println("Year "+year+" is not a leap year");
        }


        System.out.println("----------------------------------------------");

        if (leapyear){

            System.out.println("Year "+year+" is a leap year");

        }else{
            System.out.println("Year "+year+" is not a leap year");
        }
    }
}
