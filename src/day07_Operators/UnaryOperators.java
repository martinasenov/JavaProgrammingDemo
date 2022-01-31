package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {


        int num1=+25,
            num2=-25;
        System.out.println(num1<0); // false
        System.out.println(num2<0); // True

        System.out.println("----------------------------------------");

        int a=5;
        ++a; //pre increment : increases the value by 1 right away

        System.out.println(a);

        System.out.println("----------------------------------------");

        int b=5;
         b++; //post increment : first passes the current value, then increases the value by 1

        System.out.println(b);

        System.out.println("----------------------------------------");

        int x= 200;
        System.out.println(--x); //pre decrement: decrease the value by 1 right away

        int y=200;

        System.out.println(y--); //post decrement: first passes the current value, then decreases the value by 1

        System.out.println("----------------------------------------");

        int z= 45;
        System.out.println(++z); // 46, z = 46
        System.out.println(z++); // 46, z=47
        System.out.println(z);   // z= 47

        int q= 30;
        System.out.println(--q); // 29, q=29
        System.out.println(q--); // 29, q=28
        System.out.println(q); // q= 28





    }
}
