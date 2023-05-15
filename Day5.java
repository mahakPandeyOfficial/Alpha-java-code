//to print  star pattern *
//                       **
//                       ***

/* 
import java.util.*;

public class Day5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number you want line of : ");

        int line = sc.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/

/* To print reversed star pattern ****
                                  ***
                                  **
                                  *
 */

/* 
import java.util.*;

public class Day5 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println(" Enter the number you want line of : ");

       int n = sc.nextInt();

       for (int line = 1; line <= n; line++) {
           for (int star = 1; star <= (n - line + 1); star++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}

*/

/* To print  Character pattern A
                               BC
                               DEF
                               GHIJ
 */

import java.util.*;

public class Day5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number upto which you want character : ");

        int n = sc.nextInt();
        char ch = 'A';

        for (int line = 1; line <= n; line++) {
            for (int character = 1; character <= line; character++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}