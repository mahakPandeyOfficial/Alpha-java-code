import java.util.ArrayList;

public class Operation{
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();

        //Adding elements to the list 
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);
        list1.add(11);

        System.out.println("The list 1 is after adding element : " + list1);

        // Get element by providing index number
        // int element = list1.get(5);
        // System.out.println( "The element at 5 th index : "+ element);

        //Remove the element from arrayList
       // list1.remove(2);
       // System.out.println("The list 1 after removing from index 2 : "+  list1);

        //set element at given index
        list1.set(5, 13);
        System.out.println("The list after setting value 13 at 5th index : " + list1);

        //Contains element is the operation for cheacking existence of the element in the list
        System.out.println(list1.contains(9));
        System.out.println(list1.contains(11));

        //Size method
        System.out.println(list1.size());

        //iterate over list
        for(int i = 0; i<list1.size() ; i++){
            System.out.println("The value at index "+ i + " is " + list1.get(i));
        }
    }
}