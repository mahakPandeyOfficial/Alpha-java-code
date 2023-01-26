
//2D array topics 

/* 
import java.util.*;

public class Day10 {

    // we can search keys in the 2D arrays also
    public static int search(int matrix[][]) {

        // for finding largest
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                    // System.out.println("found the on cell :" + "(" + i + "," + j + ")");
                    // return true;
                }
            }
        }

        // System.out.println("not found");
        // return false;
        return largest;
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]);
            }
            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(matrix[endRow][j]);
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startCol]);
            }

            startCol++;
            startRow++;
            endRow--;
            endCol--;

        }
        System.out.println();
    }

    // main function for the spiral matrix

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        printSpiral(matrix);

    }

    /*
     * public static void main(String[] args) {
     * int matrix[][] = new int[2][2];
     * 
     * int n = matrix.length, m = matrix[0].length;
     * 
     * Scanner sc = new Scanner(System.in);
     * 
     * for (int i = 0; i < n; i++) {
     * for (int j = 0; j < m; j++) {
     * matrix[i][j] = sc.nextInt();
     * }
     * }
     * 
     * // output
     * 
     * for (int i = 0; i < n; i++) {
     * for (int j = 0; j < m; j++) {
     * System.out.print(matrix[i][j] + " ");
     * 
     * }
     * System.out.println();
     * }
     * // System.out.println("the largest amoung matrix : " + search(matrix));
     * 
     * 
     * }
     
     
     }
     */

import java.util.*;

public class Day10 {
    public static int diagonalSum(int matrix[][]) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // primary diagonal
                if (i == j) {
                    sum += matrix[i][j];
                }
                if ((i + j) == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // optimize technique
    /*
     * public static int DiagonalMatSum(int matrix[][]) {
     * int sum = 0;
     * for (int i = 0; i < matrix.length; i++) {
     * // pd
     * sum += matrix[i][i];
     * //
     * if (i != (matrix - 1 - i)) {
     * sum += (int) matrix[i][matrix.length - 1 - i];
     * }
     * }
     * return sum;
     * }
     */
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        System.out.println(diagonalSum(matrix));
    }
}
