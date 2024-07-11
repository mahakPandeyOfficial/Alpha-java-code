import java.util.*;

public class MinCostRope{

    static long minCost(long length[] , int n){
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            pq.add(length[i]);
        }

        int result = 0;

        while(pq.size() > 1){
            long first = pq.poll();
            long second = pq.poll();
            result += (first + second);
            pq.add(first + second);
        }

        return result;
    }
    public static void main(String [] args){
        long length[] = {4, 2, 7, 6, 9}; //length of 4 ropes individually
        int n = 5; //number of ropes

        System.out.println("Minimum Cost of the Rope is " + minCost(length, n));  //62
    }
}