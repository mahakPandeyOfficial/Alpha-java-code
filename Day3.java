// conditional statements
/*
 * import java.util.*;
 * 
 * public class Day3 {
 * 
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter the age : ");
 * 
 * int age = sc.nextInt();
 * 
 * if ( ag e >= 18) {
 * System.out.println("Adult : can drive and vote!");
 * if(age> 13 && age< 18){
 * System.out.print("You are a teenager!");
 * }
 * } else {
 * System.out.println("Not an adult!");
 * }
 * }
 * }
 */

// Q.1 Print the largest of two number

/*
 * 
 * import java.util.*;
 * 
 * public class Day3 {
 * public static void main(String args[]) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * int A = sc.nextInt();
 * int B = sc.nextInt();
 * 
 * if (A >= B) {
 * System.out.println("A is the largest among two numbers");
 * } else {
 * System.out.println("B is largest among two numbers");
 * }
 * }
 * }
 */

// Print if no. is odd or even
/*
 * 
 * import java.util.*;
 * 
 * public class Day3 {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter the number");
 * int num = sc.nextInt();
 * 
 * if (num % 2 == 0) {
 * System.out.println("Even");
 * } else {
 * System.out.println("Odd");
 * }
 * }
 * }
 * 
 */

// Income Tax Calculator

/*
 * 
 * import java.util.*;
 * 
 * public class Day3 {
 * 
 * public static void main(String args[]) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * int income = sc.nextInt();
 * 
 * int tax;
 * 
 * if (income < 500000) {
 * tax = 0;
 * } else if (income >= 500000 && income <= 1000000) {+
 * 
 * tax = (int) (income * 0.2);
 * } else {
 * tax = (int) (income * 0.3);
 * }
 * System.out.println("Your tax is : " + tax);
 * }
 * }
 * 
 */

// Print largest of three numbers

/*
 * 
 * import java.util.*;
 * 
 * public class Day3 {
 * public static void main(String args[]) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * int A = sc.nextInt();
 * int B = sc.nextInt();
 * int C = sc.nextInt();
 * 
 * if (A >= B && A >= C) {
 * System.out.println("A is greater among three ");
 * } else if (B >= C) {
 * System.out.println("B is greter among three number");
 * } else {
 * System.out.println("C is largest!!");
 * }
 * }
 * }
 * 
 */

// Check if a student will pass or fail (using ternary operator)

/*
 * import java.util.*;
 * 
 * public class Day3 {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter your marks : ");
 * 
 * int marks = sc.nextInt();
 * 
 * String ReportCard = marks >= 33 ? "Pass" : "Fail";
 * System.out.println(ReportCard);
 * }
 * }
 * 
 */

// Switch Case Statements

/*
 * import java.util.*;
 * 
 * public class Day3 {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter the number of button :");
 * 
 * int num = sc.nextInt();
 * 
 * switch (num) {
 * case 1:
 * System.out.println("Supprise you have got a SAMOSA");
 * break;
 * case 2:
 * System.out.println("Wohhoo! YOU have a BURGER in a plate");
 * break;
 * case 3:
 * System.out.println("Yummy tummyyy it's a MANGO SHAKE");
 * break;
 * default:
 * System.out.println("oppppss you are in dream :))");
 * }
 * }
 * }
 * 
 */

//