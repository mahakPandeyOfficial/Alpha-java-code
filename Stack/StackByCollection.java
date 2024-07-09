import java.util.*;

//this code is using Java Collection Framework , It include all the classes of Stack and you have to only import it and declare it in the main program.

public class StackByCollection {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}