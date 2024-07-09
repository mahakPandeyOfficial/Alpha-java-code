import java.util.*;

public class NextGreaterRight{
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();

        int nextGreater[] = new int[arr.length];

        // Loop from right to left to find the next greater element
        for (int i = arr.length - 1; i >= 0; i--) {

            // Step 1: Pop elements from the stack while they are less than or equal to arr[i]
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            // Step 2: Assign the next greater element
            if (s.isEmpty()) {
                nextGreater[i] = -1; // No greater element to the right
            } else {
                nextGreater[i] = s.peek();
            }

            // Step 3: Push the current element onto the stack
            s.push(arr[i]);
        }

        // Print the nextGreater array
        for (int i = 0; i < nextGreater.length; i++) { // Change from <= to < to avoid out-of-bounds
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}








