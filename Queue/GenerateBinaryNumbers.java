import java.util.*;

public class GenerateBinaryNumbers {
    static void printBinary(int n){
        Queue<String> q = new ArrayDeque<>();

        q.add("1");

        while(n-- > 0){
            String temp = q.peek();
            q.remove();

            System.out.print(temp + " ");
            q.add(temp + "0");
            q.add(temp + "1");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printBinary(n);
    }
}
