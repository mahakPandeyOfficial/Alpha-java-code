//Que: Max Length Chain of Pairs
import java.util.*;
public class ChainOfPairs {
    public static void main(String[] args){
        int[][] pairs = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1; //first selected by default (pick first chain)
        int chainEnd = pairs[0][1]; //selected pair ka end 

        for(int i = 1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                // selected 
                chainLen++;   //update length
                chainEnd = pairs[i][1];  //update end of the chain

            }
        }

        System.out.println("Max length of the Chain of Pairs = " + chainLen);

    }
}
