import java.util.*;

public class MaxOfAllSubaaray {

    public static void printMax(int[] arr, int k, int n){
        Deque<Integer> dq = new ArrayDeque<>();

        //process first k windows
        int i;
        for(i = 0; i<k; ++i ){
            while((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        //now process other elements i.e: arr[k] --- arr[n-1]
        for(; i<n ; ++i){

            //Print first (front) which is Largest among window
            System.out.print(arr[dq.peek()] + " ");

            //remove the element which are not usefull (which are out the window)
            while((!dq.isEmpty()) && dq.peek() <= i-k){
                dq.removeFirst();
             }

            //now same the other new elements
            while((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        System.out.print(arr[dq.peek()]);
    }
    public static void main(String [] args){
       int [] arr = {1,2,3,1,4,5,2,3,6};
       int k = 3;
       

       printMax(arr, k, arr.length);
    }
}
