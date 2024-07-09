import java.util.ArrayList;

public class StackProgram {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // check empty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push = Insert the element in the stack---->
        public void push(int data) {
            list.add(data);
        }

        // pop = remove the element from the TOP of the Stack---->
        public int pop() {
            if (isEmpty())
                return -1;

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek = return the TOP element of the Stack----> (java feature not in c++)
        public int peek() {
            if (isEmpty())
                return -1;
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
