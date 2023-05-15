//Write a Java program to get a number from the user and print whether it is positive or negative

/* 
import java.util.*;

public class practiceDay3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is positive !");
        } else {
            System.out.println("The number is negative!");
        }
    }
}

*/

//prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever

/* 
import java.util.*;

public class practiceDay3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in fhaernites you have calculated : ");
        float temperatue = sc.nextFloat();

        if (temperatue >= 100) {
            System.out.println("You have a fever! Take a consultancy from doctor");
        } else {
            System.out.println("Relax you don't have a fever!");
        }
    }
}

*/

//Write a Java program to input week number(1-7) and print day of week name using switch case

/*
import java.util.*;

public class practiceDay3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of day :");

        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
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
                System.out.println("Check it out there are only 7 Days in a week!");
        }
    }
}

*/

//Write a Java program that takes a year from the user and print whether that year is a leap year or not

import java.util.*;

public class practiceDay3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("Yes! this year is a leap year :) ");

        } else {
            System.out.println("NO This year not an leap year!!");
        }
    }
}