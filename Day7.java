//Hollow rectangle pattern ****
//                         *  *
//                         *  *
//                         ****  

/* 
import java.util.*;

public class Day7 {
    public static void hollow_rect(int totrow, int totcolm) {
        // outer loop
        for (int i = 1; i <= totrow; i++) {
            // inner loop
            for (int j = 1; j <= totcolm; j++) {
                // cell (i,j)
                if (i == 1 || i == totrow || j == 1 || j == totcolm) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the Total rows and total column in nnumbers ");
        int totrow = sc.nextInt();
        int totcolm = sc.nextInt();

        hollow_rect(totrow, totcolm);
    }

}

*/

/*inverted and rotated half pyramid       *
                                         **
                                        ***
                                       ****  

*/

/*
import java.util.*;

public class Day7 {
    public static void inv_rotated_half_pyramid(int totrow) {
        // outer rows
        for (int i = 1; i <= totrow; i++) {
            // spaces
            for (int j = 1; j <= totrow - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter total numbers of rows : ");
        int totrow = sc.nextInt();
        inv_rotated_half_pyramid(totrow);
    }
}
*/

/*inverted half pyramid with numbers  12345
                                      1234
                                      123
                                      12
                                      1

*/

/*
import java.util.*;

public class Day7 {
    public static void inv_half_number_pyramid(int totrow) {
        // outer
        for (int i = 1; i <= totrow; i++) {
            // inner
            for (int j = 1; j <= totrow - i + 1; j++) {
                // number
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" ENter the number of rows : ");
        int totrow = sc.nextInt();
        inv_half_number_pyramid(totrow);

    }
}

*/

/*floyd's triangle
                     1
                     2 3
                     4 5 6
                     7 8 9 10
                    11 12 13 14
 */
/*

import java.util.*;

public class Day7 {
    public static void floyds_triangle(int totrow) {
        int count = 1;

        // outer
        for (int i = 1; i <= totrow; i++) {
            // inner
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the number of rows : ");
        int totrow = sc.nextInt();

        floyds_triangle(totrow);
    }

}
*/

/* 0 -- 1 triangle 1
                   01                 //logic -> (i + j)  = even then print 1 or if odd then printd 0
                   101
                   0101
                   10101
 
*/

/*
import java.util.*;

public class Day7 {
    public static void zero_one_triangle(int totrow) {
        // outer
        for (int i = 1; i <= totrow; i++) {
            // inner
            for (int j = 1; j <= i; j++) {
                // zero_one
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the total rows :");
        int totrow = sc.nextInt();

        zero_one_triangle(totrow);
    }
}
*/

/*butterfly pattern    *    *
                       **  **
                       ******
                       ******
                       **  **
                       *    *
                       
*/
/*
import java.util.*;

public class Day7 {
    public static void butterfly_pattern(int totrow) {
        // first half

        for (int i = 1; i <= totrow; i++) {
            // inner stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces = (n-i)*2
            for (int j = 1; j <= (totrow - i) * 2; j++) {
                System.out.print(" ");
            }
            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = totrow; i >= 1; i--) {
            // inner stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces = (n-i)*2
            for (int j = 1; j <= (totrow - i) * 2; j++) {
                System.out.print(" ");
            }
            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total row : ");
        int totrow = sc.nextInt();
        butterfly_pattern(totrow);
    }
}

*/

//Solid rhombus 
/* 
import java.util.*;

public class Day7 {
    public static void solid_rhombus(int totrow) {
        // outer
        for (int i = 1; i <= totrow; i++) {
            // spaces
            for (int j = 1; j <= totrow - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totrow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENter total rows : ");
        int totrow = sc.nextInt();
        solid_rhombus(totrow);
    }
}

*/

//diamond pattern 

import java.util.*;

public class Day7 {
    public static void diamond_pattern(int totrow) {
        // 1st half
        for (int i = 1; i <= totrow; i++) {
            // spaces
            for (int j = 1; j <= totrow - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = totrow; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= totrow - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of rows : ");
        int totrow = sc.nextInt();
        diamond_pattern(totrow);
    }
}