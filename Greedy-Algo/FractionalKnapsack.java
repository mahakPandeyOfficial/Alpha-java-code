
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String []args){
        int [] val = {60,100,120};
        int  [] weight = {10,20,30};
        int W = 50;

        //create 2D array for storing ratio => value/weight
        double ratio[][] = new double[val.length][2];
        //0th col => index, 1st col => ratio

        //store ratio
        for(int i = 0; i<val.length; i++){
            ratio[i][0] = i; //0th col
            ratio[i][1] = val[i]/(double)weight[i];  //1st col
        }

        //sort in ascending order
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1])); 

        int capacity = W;
        int finalVal = 0;
        for(int i = ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0]; //0th col
            if(capacity >= weight[idx]){
                //include full item 
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                //include fractions of items
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value = " + finalVal);
    }
}
