//write a program that reads a set of integers and then prints the sum of of even and odd integer
/* 
import java.util.*;

public class practiceDay4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int evenSum = 0;
        int oddSum = 0;
        int choice;

        do {

            System.out.println("Enter the number : ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum = evenSum + num;
            } else {
                oddSum = oddSum + num;
            }

            System.out.println("Enter the choice 1 if you want to continue and choice 0 if you dont want to continue");

            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("The sum of even numbers is : " + evenSum);
        System.out.println("The sum of odd number is : " + oddSum);
    }
}
*/

//Write a program to find the factorialof any number entered by the user

/* 
import java.util.*;

public class practiceDay4 {

    public static int factorialOf(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number whose fatorial you want to print");
        int num = sc.nextInt();
        int factorial;
        factorial = factorialOf(num);
        System.out.println("Factorial of  " + num + " is " + factorial);
    }

}

*/

import java.util.*;

public class practiceDay4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number you want multiplication table of ");
        int num = sc.nextInt();
        System.out.println(" Table of " + num);
        for (int i = 1; i <= 10; i++) {
            int table;
            table = num * i;
            System.out.println(num + "*" + i + "=" + table);

        }
    }
}
