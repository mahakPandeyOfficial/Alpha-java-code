//Deque :  It is a double ended queue

import java.util.*;

public class DequeImplement{
    public static void main(String [] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(" Start Peek is " + deque.getFirst()); //2
        System.out.println(" End Peek is " + deque.getLast());  //4

        System.out.println(deque); // 2 1 3 4
        deque.removeLast();
        System.out.println(deque); //2 1 3
        deque.removeFirst(); 
        System.out.println(deque); //1 3

    }
}