package day08_IfStatement;

public class SwapTwoVariables_WithTemproraryVariable {

    public static void main(String[] args) {
/* 1.Write aprogram that can swipe two variables' value by using a temporary variable
          Example;
          if a=10, b=15
          output:
          a=15
          b=10

 */
        int a=10;
        int b=15;

        //------------------------------------------
        int c=b;

        b=a; // b=10
        a=b; //b=10
        a=c;


        System.out.println("a = " + a); //expected result 15
        System.out.println("b = " + b); //expected result 10



    }
}
