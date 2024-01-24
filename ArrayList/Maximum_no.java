import java.util.ArrayList;

public class Maximum_no{
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(4);
        list.add(12);
        list.add(6);

        int max = Integer.MIN_VALUE;
 
        for(int i = 0; i<list.size() ; i++){

           // if(list.get(i) > max) max = list.get(i);

            max = Math.max(max , list.get(i));
        }        
        System.out.println("Maximum Element is " + max);
    }
}