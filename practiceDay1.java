//Q.1   print the average of three numbers

/* 
import java.util.*;

public class practiceDay1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of A,B,C : ");

        Float a = sc.nextFloat();
        Float b = sc.nextFloat();
        Float c = sc.nextFloat();
        Float sum = a + b + c;
        Float avg = (a + b + c) / 3;
        System.out.println(avg);
    }

}
*/

//Q.2   print the area of square taking inputs from users
/* 
import java.util.*;

public class practiceDay1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Float side = sc.nextFloat();
        Float area = side * side;

        System.out.println(area);
    }
}
*/

// Enter cost of 3 items from the user(using float datatype)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
/* 
import java.util.*;

public class practiceDay1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of pencil : ");
        Float pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen : ");
        Float pen = sc.nextFloat();
        System.out.println("Enter the cost of eraser : ");
        Float eraser = sc.nextFloat();

        Float Bill = pencil + pen + eraser;
        System.out.print("Bill of material is :");
        SystemT.out.println(Bill);

        Float GSTamount = (Float) Bill + (Bill * 0.18f);
        System.out.println("After applying Gst the amount is : ");
        System.out.println(GSTamount)

    }
}

*/

//will this statement give an error int$=24;

public class practiceDay1 {

    public static void main(String args[]) {
        int $ = 24;
        System.out.println($); // NO this will not give any error and complie safely :)

    }
}