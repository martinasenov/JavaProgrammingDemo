package day09_IfStatements;

public class IsEligibleToBuyAlcohol {

    public static void main(String[] args) {

        String name="Martin";
        String wasBornIn="Bulgaria";
        char gender='M';
        int age= 32;

        if(age>21){

            System.out.println(name+" is eligible to buy Alcohol");
        }else{

            System.out.println(name+" is NOT eligible to buy Alcohol");
        }



    }
}
