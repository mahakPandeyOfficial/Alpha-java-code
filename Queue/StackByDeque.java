import java.util.*;

public class StackByDeque {
    static class Stack{
        Deque<Integer> deque = new ArrayDeque<>();

        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }

    public static void main(String [] args){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Peek : " + s.peek());

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());    
    }
}
