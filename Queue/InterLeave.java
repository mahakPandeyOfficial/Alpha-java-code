import java.util.*;

public class InterLeave {

    public static void interLeave(Queue<Integer> q ){
        int size = q.size();
        Queue<Integer> firstHalf = new ArrayDeque<>();

        //push first half part of main q into fistHalf Queue
        for(int i = 0; i < size/2; i++){
            firstHalf.add(q.remove());
        }

        //Push into original queue
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());  //firstHalf me se nikalo
            q.add(q.remove());          // original queue is bache element ko nikalo 
        }
    }


    public static void main(String [] args){
       Queue<Integer> q = new ArrayDeque<>();

       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       q.add(6);
       q.add(7);
       q.add(8);
       q.add(9);
       q.add(10);

       interLeave(q);

       while(!q.isEmpty()){
        System.out.print(q.remove() + " ");
       }
       System.out.println();
    }
}
