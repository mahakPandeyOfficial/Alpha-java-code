// Print numbers from 1-10

/*
 * import java.util.*;
 * 
 * public class Day4 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * int num = sc.nextInt();
 * int limit = sc.nextInt(); // limits should be greater than number
 * 
 * while (num <= limit) {
 * System.out.print(num + " ");
 * num++;
 * }
 * }
 * 
 * }
 * 
 */

// Sum of first N natural numbers

/*
 * import java.util.*;
 * 
 * public class Day4 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * int range = sc.nextInt();
 * 
 * int num = 1, sum = 0;
 * 
 * while (num <= range) {
 * sum += num;
 * num++;
 * }
 * System.out.println("The sum of first N numbers is : " + sum);
 * }
 * 
 * }
 * 
 */

// Print square pattern ****
// ****
// ****
// ****

/*
 * import java.util.*;
 * 
 * public class Day4 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter the number you want line of stars : ");
 * int num = sc.nextInt();
 * 
 * for (int line = 1; line <= num; line++) {
 * System.out.println("*****");
 * }
 * }
 * }
 * 
 */

// Print Reverse of the number

/*
 * import java.util.*;
 * 
 * public class Day4 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter a number you want a reverse of : ");
 * int num = sc.nextInt();
 * 
 * while (num > 0) {
 * int lastDigit = num % 10;
 * 
 * System.out.print(lastDigit);
 * num = num / 10;
 * }
 * System.out.println();
 * }
 * }
 * 
 */

// REveerse the given number by another technique --- rev = (rev * 10)+
// lastDigit

/*
 * import java.util.*;
 * 
 * public class Day4 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter the number : ");
 * int num = sc.nextInt();
 * int rev = 0;
 * while (num > 0) {
 * int lastDigit = num % 10;
 * rev = (rev * 10) + lastDigit;
 * num = num / 10;
 * }
 * System.out.println(rev);
 * }
 * }
 */

// Keep entering number till user enter a multiple of 10

/*
 * import java.util.*;
 * 
 * public class Day4 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * do {
 * System.out.print("enter your number : ");
 * int num = sc.nextInt();
 * 
 * if (num % 10 == 0) {
 * break; // use of break keyword
 * }
 * System.out.println(num);
 * 
 * if (num == 5) {
 * continue; // use of continue keyword
 * }
 * 
 * } while (true);
 * 
 * }
 * }
 * 
 */

// Display all numbers entered by users except myltipes of 10
/*
 * 
 * import java.util.*;
 * import java.util.Scanner;
 * 
 * public class Day4 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * do {
 * System.out.println("Enter you number : ");
 * int n = sc.nextInt();
 * if (n == 10) {
 * continue;
 * }
 * System.out.println("number was : " + n);
 * } while (true);
 * }
 * }
 * 
 */

// Check if a number is prime or not (logic = Math.sqrt(n))

/*
 * import java.util.*;
 * 
 * import javax.swing.plaf.TreeUI;
 * 
 * public class Day4 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * int num = sc.nextInt();
 * 
 * if (num == 2) {
 * System.out.println("Num is prime!");
 * } else {
 * boolean isPrime = true;
 * for (int i = 2; i <= Math.sqrt(num); i++) {
 * if (num % i == 0) {
 * isPrime = false;
 * }
 * }
 * 
 * if (isPrime == true) {
 * System.out.println(" Number is a prime!");
 * } else {
 * System.out.println("Number is not an prime!");
 * 
 * }
 * 
 * }
 * }
 * }
 * 
 */

//