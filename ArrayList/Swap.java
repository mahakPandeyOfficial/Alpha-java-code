import java.util.ArrayList;

public class Swap{

    public static void swapping(ArrayList<Integer> list , int indx1 , int indx2){
        int temp = list.get(indx1);
        indx1 = list.set(indx1 , list.get(indx2));
        indx2 = list.set(indx2 , temp);
    }
    public static void main(String[] args){
     ArrayList <Integer> list = new ArrayList<>();

     list.add(2);
     list.add(4);
     list.add(8);
     list.add(6);
     list.add(9);

    int indx1 = 1, indx2 = 4;
     System.out.println("The List before swapping : " + list);
    swapping(list, indx1 , indx2);
    System.out.println("The List after Swapping : " + list);
    }
}