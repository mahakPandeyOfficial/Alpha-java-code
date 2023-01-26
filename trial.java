
/*import java.util.*;

public class trial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int countEven = 0;
        int countOdd = 0;
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            if (countEven < countOdd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

*/

/*
import java.util.*;

public class trial {

    public static void main(String[] args) {

        String str = "I Love You";
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            word += str.charAt(i);
            System.out.print(word);
            System.out.println();
        }

        System.out.println();

    }
}



*/

import java.util.*;

public class trial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want table of : ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= 10; i++) {
            result = i * n;
            System.out.println(n + " X " + i + " = " + result);
        }
    }
}
