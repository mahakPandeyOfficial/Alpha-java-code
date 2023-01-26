
//calculate sum with parameters 

/*
import java.util.*;

public class Day6 {
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers  : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = calculateSum(num1, num2);
        System.out.println("Sum is = " + sum);

    }
}
*/

// Swapping the value of value By Call By Value    ## JAVA ONLY USE CALL BY VALUE -- CALL BY REFRENCE IS ONLY USE IN c AND CPP

/* 
import java.util.*;

public class Day6 {
    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        swap(a, b);
        System.out.println(" a : " + a);
        System.out.println("b : " + b);
    }
}

*/

//Binomial coefficient  nCr = n! / (r! * (n-r)!)

/* 
import java.util.*;

public class Day6 {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static float binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        float binCoeff = fact_n / (fact_r * fact_nmr);

        return binCoeff;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n :  ");
        int n = sc.nextInt();

        System.out.print("Enter r : ");
        int r = sc.nextInt();

        float BinomialCoeffficient;
        BinomialCoeffficient = binCoeff(n, r);

        System.out.println("Binomial coeffcient is " + BinomialCoeffficient);
    }
}

*/
//

//Check if number is prime number or not 

/* 
import java.util.*;

public class Day6 {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime;
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        // System.out.println(" The number is Prime = " + isPrime(n));

        primesInRange(n);
    }
}
*/

//binary to decimal 

/*
import java.util.*;

public class Day6 {

    public static void binToDec(int binNum) {

        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int myNum;
            myNum = binNum;
            int lastdigit;
            lastdigit = binNum % 10;
            decNum = decNum + lastdigit * (int) Math.pow(2, pow);
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binNum = sc.nextInt(); // the number should be in only 0 or 1 format
        binToDec(binNum);
    }
}

*/

// decimal to binary conversion
/*
import java.util.*;

public class Day6 {
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;
        }
        System.out.println("binary form of " + myNum + "= " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter Decimal number : ");
        int decNum = sc.nextInt();
        decToBin(decNum);

    }

}

*/

//prime in range 

import java.util.*;

public class Day6 {

    public static boolean isPrime(int num) {

        // corner case for 2
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void primesInRange(int start, int end) {
        // take start and end number
        System.out.print("Primes in range are : ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i) == true) {

                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the start and end number for printing prime numbers in range : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        primesInRange(start, end);
    }
}