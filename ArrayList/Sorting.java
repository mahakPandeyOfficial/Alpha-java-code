import java.util.ArrayList;
import java.util.Collections;

public class Sorting{
    public static void main(String [] args){
        ArrayList <Integer> list1 = new ArrayList<>();

       list1.add(5);
       list1.add(8);
       list1.add(7);
       list1.add(3);
       list1.add(2);

        System.out.println("The list 1 before sorting looks like : " + list1);

        Collections.sort(list1);   //use collections class for sorting //ascending order

        System.out.println("The list after sorting : " + list1);

        Collections.sort(list1 , Collections.reverseOrder());
        System.out.println("in decening order : " + list1); 

    }
}