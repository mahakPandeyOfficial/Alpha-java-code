
/* 
import java.util.*;

public class Day8 {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}
*/

//linear search 
/*
import java.util.*;

public class Day8 {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[3];
        System.out.println("emter numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("enter key : ");

        int key = sc.nextInt();
        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("NOT FOUND !");
        } else {
            System.out.println("key is on index = " + index);
        }

    }
}

*/

//find largest in Array 

/* 
import java.util.*;

public class Day8 {
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE; // -INFINITY

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter numbers : ");
        int number[] = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("Largest value is " + getLargest(number));
    }
}

*/

//Binary search

/*
import java.util.*;

public class Day8 {
    public static int binarySearch(int number[], int key) {

        int start = 0, end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            // comparison

            if (number[mid] == key) { // found
                return mid;
            }
            if (number[mid] < key) { // right
                start = mid + 1;
            } else { // left

                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("enter key ");
        int key = sc.nextInt();

        System.out.println("index is " + binarySearch(number, key));
        if (binarySearch(number, key) == -1) {
            System.out.println("not found");
        }
    }

}

*/

//reverse an array

/*
import java.util.*;

public class Day8 {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5]; // { 2, 3, 4, 5, 6 };

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();

        }
        reverse(numbers);
        System.out.print("reversed array : ");

        for (int j = 0; j < numbers.length; j++) {

            System.out.print(numbers[j] + " ");
        }
        System.out.println();
    }
}

*/

//pairs in array

/* 
import java.util.*;

public class Day8 {
    public static void printPairs(int numbers[]) {

        int totalPair = 0;

        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + totalPair);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        printPairs(numbers);

    }
}

*/

/* 
//print subarray  

import java.util.*;

public class Day8 {
    // public static void printSubarray(int number[]) {
    /*
      int totalSubarrray = 0;
      int sum = 0;
      int maxSum = Integer.MIN_VALUE;
      for (int i = 0; i < number.length; i++) {
      int start = i;
      
      for (int j = i; j < number.length; j++) {
      int end = j;
      sum = 0;
      for (int k = start; k <= end; k++) {
      // System.out.print(number[k] + " ");
      
      sum = sum + number[k];
      }
      // totalSubarrray++;
      System.out.println("sum of subarray = " + sum);
      if (maxSum < sum) {
      maxSum = sum;
      }
      
      }
      // System.out.println("sum of subarray is " + sum);
      System.out.println();
      }
      System.out.println("max sum = " + maxSum);
      // System.out.println("Total subarray is " + totalSubarrray);
      
      }
     */
/* 
    // prefix sum

    public static void maxSubArrSum(int number[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[number.length];
        prefix[0] = number[0];

        for (int k = 1; k < prefix.length; k++) {
            // calculate prefix array
            prefix[k] = prefix[k - 1] + number[k];
        }
        for (int i = 0; i < number.length; i++) {
            int start = i;

            for (int j = i; j < number.length; j++) {
                int end = j;

                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum sum is " + maxSum);

    }

    */

/* 
// kadane's algorithm

public static void kadanes(int number[]) {

    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for (int i = 0; i < number.length; i++) {
        cs = cs + number[i];
        if (cs < 0) {
            cs = 0;
        }
        ms = Math.max(cs, ms);
    }
    System.out.println("max sum is " + ms);

}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int number[] = { 1, 2, 3, 4 };
    // System.out.println("array is ");
    
      for (int i = 0; i < number.length; i++) {
      number[i] = sc.nextInt();
      }
     
    // System.out.println("subarray of entered array is following : ");

    // printSubarray(number);

     //maxSubArrSum(number);

    kadanes(number);

}
}

*/
//Trapping Rainwater

/* 
import java.util.*;

public class Day8 {
    public static int trappedRainwater(int height[], int width) {

        int n = height.length;
        // calculate left maxBoundary-array

        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary-array

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        // loop

        for (int i = 0; i < n; i++) {
            // waterlevel = min (leftMax boundary , right max boundary)

            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water

            trappedWater += (waterlevel - height[i] * width);
        }

        return trappedWater;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int width = 1;
        System.out.println(trappedRainwater(height, width));

    }
}
*/

//Buy and Sell Stocks

import java.util.*;

public class Day8 {

    public static int BuyAndSellStocks(int prices[]) {

        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice; // todays profit
                maxprofit = Math.max(maxprofit, profit);

            } else {
                buyPrice = prices[i];
            }

        }
        return maxprofit;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println(BuyAndSellStocks(prices));
    }
}