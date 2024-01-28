import java.util.*;
//brute force approach
public class PairSum1{
    public static int Sum(ArrayList<Integer> list, int target){
        for(int i = 0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if((list.get(i) + list.get(j)) == target){
                    System.out.println(list.get(i) + " and " + list.get(j) + " are the one pair which is equal to reach target.");
                    //return true;
                }
            }
        }
        return 0;
    }

    //optimize 
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp < rp){
            //case 1 : 
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case 2 : 
            else if (list.get(lp) + list.get(rp) < target){
                lp++;
            }
            //case 3: lp + rp > target
            else { 
                rp--;
            }
        }
        return false;
    }
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();

        //1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(Sum(list,target));
        System.out.println(pairSum(list, target));

    }
}