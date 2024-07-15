import java.util.*;
public class ChocolaProblem {
    public static void main(String[] args){

        int n = 4, m = 6;
        Integer [] costVer = {2,1,3,1,4};  //m-1
        Integer [] costHor = {4,1,2};  //n-1

    // Sort first in Descending order
      Arrays.sort(costVer, Collections.reverseOrder());
      Arrays.sort(costHor, Collections.reverseOrder());

      //define 5 variables
      int h = 0, v = 0;  // tracking current horizontal, current vertical
      int hp = 1, vp = 1;  //tracking horizontal pieces and vertical pieces
      int cost = 0; 

      //logic
      while(h < costHor.length && v < costVer.length){

        if(costVer[v] <= costHor[h]){
            //horizontal cut
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        else{
            //vertical cut
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
      }

      //jo hor and ver bach gaye hai unke liye bhi alg se ek baar loop run kara do
      while(h < costHor.length){
          cost += (costHor[h] * vp);
            hp++;
            h++;
        }
      while(v < costVer.length){
           cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("min cost to cut the chocolate into single pieces = " + cost);
    }
}
