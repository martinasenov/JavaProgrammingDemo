package day10_NestedIF;

public class FieldTrip {

    public static void main(String[] args) {

       int grade=4;
       String location = "";
       int groupNumber=0;
       String teacher="";

       if(grade>=1 && grade<=4) {

        if(grade==1){
            location="Apple orchard";
            groupNumber=3;
            teacher="Ms. Smith";
        }else if (grade==2){
                location="Zoo";
                groupNumber=7;
                teacher="Mr. Lee";

            }else if(grade==3){
            location="Aquarium";
            groupNumber=5;
            teacher="Mr. Lee";

        }else if(grade==4){
            location="Movie Theater";
            groupNumber=5;
            teacher="Mr. Lee";







           System.out.println("Invalid Grade");
        }

            System.out.println("location = " + location+ "\nnumberof groups :"+groupNumber+"\nteacher in charge: "+teacher);
    }
}
}
