package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {
        String name="Steven";
        int age=19;
        String citizen= "UK";

        boolean isEligible= age >=18 && citizen=="USA";;
        System.out.println(name+" is Eligible: " + isEligible);
        //                      18 >= 18 &&  "USA" == "USA"
        //                      true    &&  true ==> true
        // AND operator :  true && true =="USA" = TRUE
        // AND operator .  true && false == "UK" = FALSE
        // BOTH STATEMENT SHOULD BE TRUE IN ORDER FOR THE "AND"(&&) OPERATOR TO BE TRUE

        System.out.println("----------------------------------");

        String name2="Josh";
        int age2=23;
        int creditScore=1000;
        int netIntcome= 40000;
        boolean isEligible2= creditScore>=700 && age2 >=21 && netIntcome>=50000;
        System.out.println(name+" is Eligible for Loan = " + isEligible2);

        System.out.println("-----------------------------------");

        String name3="Shay";
        int age3=21;
        char gender='F';
        boolean isEligible3= age3>=18 && (gender=='M' || gender=='F');
        // 21>=18 && ('F'=='M' || 'F'=='F' )
        // true && (false || true )
        // true && true
        // true
        System.out.println(name+" is Eligible to register = " + isEligible3);

        System.out.println("----------------------------");

        String name4="James";
        String countryOfBirth="UK";
        boolean marriedToUSCitizen= false;

        boolean isEligible4= countryOfBirth=="USA" || marriedToUSCitizen == true;
        // false               //             false
        System.out.println(name4+" isEligible to apply for citizenship = " + isEligible4);

        System.out.println("---------------------------------------");

        String student="Anna";
        double gpa=3.5;
        int familyIncome=100000;
        boolean isEligible5 = gpa>=3.5 || familyIncome <=60000;

        System.out.println(student+" isEligible for scholarship = " + isEligible5);

        System.out.println("---------------------------------");

        boolean result2=true;
        System.out.println("result2 = " + result2);
        boolean result3=!result2;
        System.out.println("result3 = " + result3);

        System.out.println("----------------------------------");

        int score=55;
        boolean passed=score>=60;
        boolean failed=!passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);




    }
}
