package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {


        int number = 9;

        switch (number){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;  // optional if it is at the end and none of the cases are matching
        }

    }
}
