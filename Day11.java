import java.util.Scanner;

//chaeck if the string is a palindrome  ex: racecar, noon , madam , manam

/* 
public class Day11 {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            int n = str.length();

            if (str.charAt(i) != str.charAt(n - 1 - i)) { // not an palindrome
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.next();

        System.out.println(isPalindrome(str));

    }
}

*/

//given a route containing 4 direction (E,W,N,S) find the shortest path to reach destination

/* 
public class Day11 {

    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // south
            if (dir == 'S') {
                y--;
            }
            // north
            else if (dir == 'N') {
                y++;
            }
            // west
            else if (dir == 'W') {
                x--;
            }
            // east
            else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESESNN";
        System.out.println(getShortestPath(path));
       
    }
}


*/

//String function -- Substring

/*
public class Day11 {
    public static String substring(String str, int si, int ei) {
        String substr = "";

        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloFolks";

        // by direct use of functions that are already exist in Java library
        System.out.println(str.substring(1, 5));

        // by use of user defined function
        System.out.println(substring(str, 5, 6));
    }
}

*/

//for a given set of String print the largest String

/* 
public class Day11 {
    public static void main(String[] args) {
        String fruits[] = { "apple", "zebraa", "banana" };

        String lg = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            String n = fruits[i];
            if (lg.compareToIgnoreCase(n) < 0) {
                lg = n;
            }

        }
        System.out.println(lg);
    }

}

*/

//use of String builder 

/* 
public class Day11 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);

        }

        System.out.println(sb);
    }
}

*/

//for a given string convert each the first letter of the word as the upper case -- ex . "hi i am elly"

/* 
public class Day11 {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(chara.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi i am elly";
        System.out.println(toUpperCase(str));
    }
}

*/

//String Compression

public class Day11 {
    public static String compress(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aabcccuuughhh";
        System.out.println(compress(str));
    }
}