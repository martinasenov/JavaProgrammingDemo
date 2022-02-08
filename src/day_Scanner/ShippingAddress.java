package day_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        System.out.println("Enter your full name: ");
        String fullName=input.nextLine();

        System.out.println("Enter your Building number: ");
        String buildingNumber= input.next();
        input.nextLine();

        System.out.println("Enter your Street name ");
        String streetName= input.nextLine();

        System.out.println("Enter your city name ");
        String cityName= input.nextLine();

        System.out.println("Enter your state name ");
        String stateName= input.nextLine();

        System.out.println("Enter your Zip code ");
        String zipCode= input.next();


        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("zipCode = " + zipCode);
    }
}




/*
1.Full name
2.building number
3.Street name
4.City name
5.state
6.zip code



 */