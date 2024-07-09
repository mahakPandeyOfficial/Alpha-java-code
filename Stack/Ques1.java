//Push at the Bottom of the Stack

import java.util.*;

public class Ques1 {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // Print Stack function
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    // main function for reverse Stack que ke liye
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Reversed stack is: ");
        reverseStack(s);
        printStack(s);

    }

    /*
     * //push at bottom ka main function
     * 
     * public static void main(String[] args) {
     * Stack<Integer> s = new Stack<>();
     * 
     * s.push(1);
     * s.push(2);
     * s.push(3);
     * 
     * pushAtBottom(s, 4);
     * 
     * while (!s.isEmpty()) {
     * System.out.println(s.peek());
     * s.pop();
     * }
     * }
     * 
     */
}
