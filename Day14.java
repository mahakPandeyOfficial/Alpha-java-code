//**********************************************************RECURSION***********************************************************************
//******************************************************************************************************************************************

//Print the number in decresing order using Recursion

/* 
import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want order from : ");
        int num = sc.nextInt();
        printDec(num);
    }

    public static void printDec(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }
        System.out.println(num + "");
        printDec(num - 1);
    }
}

*/

//Print the number in Incresing Order

/* 
import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number you want number to print upto : ");
        int num = sc.nextInt();
        printInc(num);
    }

    public static void printInc(int num) {
        if (num == 1) {
            System.out.print(num);
            return;
        }
        printInc(num - 1);
        System.out.print(" " + num);
    }
}

*/

// Find a Factorial of N 

/*
import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want factorial of : ");

        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }
}
*/

// Print sum of N natural Number
/* 
import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want sum upto which :");
        int N = sc.nextInt();
        System.out.println("The Total sum of " + N + " natural number is " +
                calcSum(N));
    }

    public static int calcSum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return (num + calcSum(num - 1));
        }
    }

}

*/

//Print N th Fibonacci number:

/* 
import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth number for Fibonacci number : ");
        int N = sc.nextInt();
        System.out.print("The number at Nth place of fabonacci series is : " + fibonacci(N));
    }

    public static int fibonacci(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            int fib_Nm1 = fibonacci(N - 1);
            int fib_Nm2 = fibonacci(N - 2);

            int fib_N = fib_Nm1 + fib_Nm2;

            return fib_N;
        }
    }
}

*/

//Check if the array is sorted or not ?
/* 
import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 6, 8, 5 };
        System.out.println(isSorted(arr, 0));

    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

}
*/

//WAP to find the First occurance of an element in the array

/* 
import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.print("enter the the key you want to search : ");
        int key = sc.nextInt();
        System.out.println("First Occurance of the element you have entered is at " + firstOccurance(arr, key, 0));
    }

    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }
}

*/

//WAP to find the last occurance of an element you have entered in the array:

/* 
import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.print("enter the key you want to search in the array : ");
        int key = sc.nextInt();
        System.out.println(lastOccurance(arr, key, 0));

    }

    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        // Look forward first
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
}

 */

//Print X to the power N:

/* 
import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the X : ");
        int X = sc.nextInt();
        System.out.print("Enter the N : ");
        int N = sc.nextInt();

        // System.out.println(X + " to the power " + N + " is " + pow(X, N));
        System.out.println(X + " to the Power  " + N + " is " + optimizedPower(X, N));
    }

    public static int pow(int X, int N) {  //Time Complexity = O(N)
        if (N == 0) {
            return 1;
        }
        return X * pow(X, N - 1);
    }
// Optimized Way to solve this same Problem ___________________ Time Complexity  = O(logN)

    public static int optimizedPower(int a, int N) {
        if (N == 0) {
            return 1;
        }

        int halfPower = optimizedPower(a, N / 2);
        int halfPowerSq = halfPower * halfPower;

        // if N is odd number

        if (N % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;

    }
}


*/

//TILING PROBLEM ------------- Amazon (IMP)

/* 
import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("total number of ways are : " + tilingProblem(n));
    }

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam

        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // horizontal choice
        int fnm2 = tilingProblem(n - 2);

        int total = fnm1 + fnm2;
        return total;

    }
}

*/

// Remove Duplicates in a string ------------- Google , Microsoft

/* 
import java.util.*;

public class Day14 {

    public static int removeDuplicates(String str, int indx, StringBuilder newStr, boolean map[]) {
        if (indx == str.length()) {
            System.out.println(newStr);
            return 0;
        }

        // kaam
        char currChar = str.charAt(indx);
        if (map[currChar - 'a'] == true) {
            // mtlb duplicate hai , toh usko remove karna padega
            removeDuplicates(str, indx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, indx + 1, newStr.append(currChar), map);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string contain duplicate character : ");
        String str = sc.next();
        System.out.print(removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]));

    }
}

 */

// Friends Pairing Problem 

/* 
import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number of friends enter in the party : ");
        int n = sc.nextInt();

        System.out.println("total number of ways are  " + friendsPairing(n));
    }

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // single
        int fnm1 = friendsPairing(n - 1);

        // pairing
        int fnm2 = friendsPairing(n - 2);
        int pairWay = (n - 1) * fnm2;

        int total = fnm1 + pairWay;
        return total;

        // return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
}

*/

//Binary String Problem ------------------- PAYtm 

import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        System.out.println(printBinaryString(n, 0, ""));
    }

    public static int printBinaryString(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return 0;
        }
        int count = 0;

        // kaam
        printBinaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str + "1");
            count++;
        }

        return count;
    }
}