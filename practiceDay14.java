//Que 1 -- 

/* 
import java.util.*;

public class practiceDay14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        System.out.println(indicesOcc(key, arr, 0));
    }

    public static int indicesOcc(int key, int arr[], int i) {
        if (i == arr.length) {
            return 0;
        }
        if (arr[i] == key) {
            System.out.print(i + " "); 
        }
        indicesOcc(key, arr, i + 1);

        return 0;
    }

}
*/

//  Que - 2. Number to String Converter--- 

/* 
import java.util.*;

public class practiceDay14 {
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :  ");
        int number = sc.nextInt();
        System.out.println(convertStr(number));
    }

    public static int convertStr(int number) {
        if (number == 0) {
            return 0;
        }

        int lastNum = number % 10;
        convertStr(number / 10);
        System.out.print(digits[lastNum] + " ");

        return 0;
    }

}

*/

//WAP to find length of string by recursion
/* 
import java.util.*;

public class practiceDay14 {

    public static int strLength(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return strLength(str.substring(1)) + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(strLength(str));
    }
}
*/

//WAP We are given a string S , We need to find the count of all contagious substring starting and ending with the same character\

import java.util.*;

public class practiceDay14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        System.out.println(retSubString(str, 0, n - 1, n));
    }

    public static int retSubString(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }

        int res = retSubString(str, i + 1, j, n - 1) + retSubString(str, i, j - 1, n - 1)
                - retSubString(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;
    }
}