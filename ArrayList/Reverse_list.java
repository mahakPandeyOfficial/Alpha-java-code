import java.util.ArrayList;

public class Reverse_list{
    public static void main(String[] args){
        ArrayList <Integer> reverse = new ArrayList<>();

        reverse.add(1);
        reverse.add(2);
        reverse.add(3);
        reverse.add(4);
        reverse.add(5);

        System.out.println("The list before reversing : " +  reverse);

        //reverse the list 
        int length = reverse.size();
        for(int i = length-1 ; i>=0 ; i--){
            System.out.print(reverse.get(i) + " ");
        }
    }
}