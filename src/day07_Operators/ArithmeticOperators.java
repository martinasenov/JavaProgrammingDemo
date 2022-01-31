package day07_Operators;

public class ArithmeticOperators {
/*
Arithmetic operators:
		20 / 6 = 3
		20.0 / 6 = 3.333....

		10/2 = 5
		10/3 = 3.3333...

		remainder = numerator -(denominator * integer result)
				     10      - (3 * 3) = 1

				     1/3 = 0.3333....

	     10 % 3 ==> 1

	     45 / 8 = 5.625

	     		45 - (8 * 5 ) =5


		 45 % 8 ===> 5


		 100 % 15 ==> 10

		 100 / 15 = 6.66.....
		 100 - (15 * 6) = 10
 */
    public static void main(String[] args) {
        System.out.println(20/6);
        System.out.println(20.0/6);
        System.out.println(10/2);
        System.out.println(10/3);
        System.out.println(1/3);
        System.out.println(10%3);
        System.out.println(45/8);

        int num1=10;
        int num2=3;

        // 10 divide bz 3 is equal to 3 with a remainder of 1

        int division=num1/num2; // division variable contains the result of num1 divided by num2
        int remainder = num1 % num2; // remainder variable contains the remainder of num1 divided by number

        // 10 divide by 3 is equal to 3 with a remainder of 1

        System.out.println(num1+" divided by "+num2+" is equal to "+division+" with a remainder of " + remainder);


        // what is the remainder of 25 divided by 4

        System.out.println(25%4);

    }
}
