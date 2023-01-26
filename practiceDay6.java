//Write a java method to compute the avg of three number 

/* 
import java.util.*;

public class practiceDay6 {

    public static int avg(int sum) {
        int avg = 0;
        int n = 3;
        avg = sum / n;
        return avg;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter three numbers : ");

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int sum = A + B + C;

        System.out.println(" average of three numbers entered by you is :  " + avg(sum));
    }
}
*/

//write a method named isEven that accept an int arguments the method should return true if the argument is even or return false otherwise 

/* 
import java.util.*;

public class practiceDay6 {
    public static boolean isEven(int num) {

        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter number and checks if its an even num or not !");
        int num = sc.nextInt();

        System.out.print(" the number is Even : " + isEven(num));
    }
}

 */

// write a program to check if a number is palindrome or not 
/*
import java.util.*;

public class practiceDay6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");

        int num = sc.nextInt();
        int myNum = num;
        int rev = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            rev = rev * 10 + lastdigit;
            num = num / 10;

        }
        if (myNum == rev) {
            System.out.println("Entered number is palindrome ");
        } else {
            System.out.println("not an palindrome ");
        }
    }
}
*/

//write a java program or method to compute the sum of digit in an integer

import java.util.*;

public class practiceDay6 {
    public static int sumOfInteger(int num) {
        int sum = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            sum = sum + lastdigit;
            num = num / 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");

        int num = sc.nextInt();
        System.out.println(" The sum of digits of entered integer is  " + sumOfInteger(num));

    }
}