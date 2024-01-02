import java.util.*;

//Backtracking in Array--------------------------------------------------------------------------------------------------------------------

/* 
public class Day17 {

    public static void changeArr(int[] arr, int i, int value) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = value;
        changeArr(arr, i + 1, value + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}


*/

//Find Subsets---------------------------------------------------------------------------------------------------------------------------

/*

public class Day17 {
    public static void findSubsets(String str, int i, String ans) {
        // base case

        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Recursion

        // if yes is the choice

        findSubsets(str, i + 1, ans + str.charAt(i));

        // no is the choice

        findSubsets(str, i + 1, ans);

    }

    public static void main(String[] args) {
        String str = "abcdef";

        findSubsets(str, 0, "");
    }
}

*/

//N-Queens Problem (All ways)

/* 

public class Day17 {

    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;

        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void nQueens(char board[][], int row) {
        // base

        if (row == board.length) {
            printBoard(board);
            // count number of ways
            count++;
            return;
        }

        // coloum loop
        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // function call
                board[row][j] = 'x'; // backtracking step
            }

        }

    }

    public static void printBoard(char board[][]) {

        System.out.println("----------Chess Board-----------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;

        char[][] board = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
        System.out.println();
        System.out.println("Total ways to print Queens are : " + count);
    }

}
*/

// N-Queens = Print 1 Solution

/* 
public class Day17 {

    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;

        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        // base

        if (row == board.length) {
            printBoard(board);
            // count number of ways
            count++;
            return true;
        }

        // coloum loop
        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                if (nQueens(board, row + 1)) {
                    return true;
                }
                // function call
                board[row][j] = 'x'; // backtracking step
            }

        }
        return false;
    }

    public static void printBoard(char board[][]) {

        System.out.println("----------Chess Board-----------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;

        char[][] board = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("Solution is possible ");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }
        System.out.println();
        System.out.println("Total ways to print Queens are : " + count);
    }

}


*/

//Grid Ways 

public class Day17 {

    public static int GridWays(int i, int j, int n, int m) {

        // base case
        if (i == n - 1 && j == m - 1)
            return 1;
        else if (i == n || j == m)
            return 0; // bounding case

        // recusive case
        int w1 = GridWays(i + 1, j, n, m);
        int w2 = GridWays(i, j + 1, n, m);

        return w1 + w2;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of N and M ");
        int n = s.nextInt();
        int m = s.nextInt();

        System.out.println("Total number of ways for " + "(" + n + "," + m + ")" + " matrix is " + GridWays(0, 0, n, m));
    }
}