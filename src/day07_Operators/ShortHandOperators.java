package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment: =
        int number =100;
        System.out.println("number = " + number); //100

        number=200; // updated value, java works from top to down and left to right
        System.out.println("number = " + number); //200

        String word="Java Programming";
        System.out.println("word = " + word); // Java Programming

        word="Wooden Spoon"; // updated
        System.out.println("word = " + word);
        
        word="Cydeo"; // it is basically replacing the value
        System.out.println("word = " + word); // Cydeo

        // we can not assign int to String later on, example : word = 123;

        //ADDITION ASSIGNMENT OPERATOR
        int x=100;
        System.out.println("x = " + x);

        //x=x+200;
        x+=200; // (+)adds the assigned value and replaces the with the old one

        String str= "Wooden";
        System.out.println("str = " + str);

        str+=" Spoon"; // this time (+) is used for concatenation
        System.out.println("str = " + str);

        double num1=2.5;
        System.out.println("num1 = " + num1); //2.5

        num1+=5.5;

        System.out.println("num1 = " + num1); // 8.0

        double availableBalance= 1000.50;
        //deposit 300$;
        availableBalance+=300;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("---------------------------------");

        //withdrawing 500$
        availableBalance-=500;
        System.out.println("availableBalance = " + availableBalance);


        //withdrawing 200$, then depositing 400$
        availableBalance-=200; //available balance= 600.5
        availableBalance+=400; //available balance= 1000.5
        System.out.println("availableBalance = " + availableBalance);


        System.out.println("---------------------------------");

        double salary= 50000.50;
        System.out.println("salary = " + salary);
        salary*=2;
        System.out.println("salary = " + salary);

        double doge=0.00000001;
        doge *=1000000;
        System.out.println("doge = " + doge);

        double num2= 25000.0;
        //num2=num2/2
        num2 /=2;
        System.out.println("num2 = " + num2);

        System.out.println("----------------------");

        double num3=100;
        //%=
        num3%=3;
        System.out.println("num3 = " + num3);

        System.out.println("--------------------------------");

        int amount= 127; // cents
        int quarters= amount /25;
        int cents=amount%25;
        System.out.println("cents = " + cents);

        System.out.println("----------------------");

        int cents2=127;
        cents2%=25;
        System.out.println("cents2 = " + cents2);

        System.out.println("-----------------");

        int y=300;
        y%=16;
        System.out.println("y = " + y);
        System.out.println("---------------------");

        int balance=3500;
        //insurance fee: $153
        balance%=153;
        System.out.println("balance = " + balance);






    }
}
