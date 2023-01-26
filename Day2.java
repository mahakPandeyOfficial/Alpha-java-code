// program in which we are using arthimatic operator 
/*
import java.util.*;

public class Day2 {

    public static void main(String args[]) {
        int A = 10;
        int B = 5;
        System.out.println("sum =  " + (A + B));
        System.out.println("Difference  =  " + (A - B));
        System.out.println("division  =  " + (A / B));
        System.out.println("remainder  =  " + (A % B));
    }
}

 */

// use of pre increment or decrement operator or post increment or decrement operator

/* 
import java.util.*;

public class Day2 {
    public static void main(String args[]) {

        int A = 10;
        int B = --A;

        System.out.println(A);
        System.out.println(B);
    }
}
*/

//using of relational operator 
/* 
import java.util.*;

public class Day2 {
    public static void main(String args[]) {
        int A = 12;
        int B = 13;
        System.out.println(A == B);
        System.out.println(A != B);
        System.out.println(A < B);
        System.out.println(A > B);
        System.out.println(A <= B);
        System.out.println(A >= B);
    }

}
*/

//logical operators 

/* 
import java.util.*;

public class Day2 {
    public static void main(String args[]) {

        System.out.println((3 < 2) && (456 <= 659));    //logical AND
        System.out.println((3 < 2) || (456 <= 659));    //logical OR
        System.out.println(!(456 <= 659));              //logical NOT
    }
}
*/

//use of assignment operator

public class Day2 {
    public static void main(String args[]) {
        int a = 10;
        // a = a + 10;
        a += 10; // this operator first add the value of a and then assign to a
        System.out.println(a);
    }
}