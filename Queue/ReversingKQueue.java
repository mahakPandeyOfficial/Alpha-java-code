
import java.util.*;
public class ReversingKQueue {

    static void reverseQueue(Deque<Integer> dq, int k){

        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            q.add(dq.removeFirst());
        }

        while(!q.isEmpty()){
            dq.addFirst(q.remove());
        }
         
    }
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        int k = 5;

        dq.addFirst(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);
        dq.addLast(50);
        dq.addLast(60);
        dq.addLast(70);
        dq.addLast(80);
        dq.addLast(90);
        dq.addLast(100);
        System.out.println("Queue Before Reversal -->  "+ dq);

        reverseQueue(dq, k);

        System.out.println("Queue After Reversal -->  "+ dq);
        
    }
}
