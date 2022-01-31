package day10_NestedIF;

public class TernariesWithNestedIf {


    public static void main(String[] args) {

        int s=120;

        String result = (s>=0 && s<=100)? (s>=60)? "Passed": "Failed": "Invalid Score";

        System.out.println(result);
    }

}
