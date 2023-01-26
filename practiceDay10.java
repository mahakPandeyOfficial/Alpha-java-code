//print the no. of 7's in matrix 

import java.util.*;

public class practiceDay10 {

    /*
     * public static void countKey(int matrix[][], int key) {
     * 
     * int count = 0;
     * for (int i = 0; i < matrix.length; i++) {
     * for (int j = 0; j < matrix[0].length; j++) {
     * if (matrix[i][j] == key) {
     * count++;
     * }
     * }
     * }
     * System.out.println(count);
     * 
     * }
     * 
     * public static void main(String[] args) {
     * int matrix[][] = { { 4, 7, 8 },
     * { 7, 7, 7 } };
     * 
     * int key = 7;
     * countKey(matrix, key);
     * }
     * 
     * 
     */

    // Printout the sum of second row of the given array

    /*
     * public static void sumRow(int num[][]) {
     * 
     * int sum = 0;
     * 
     * for (int j = 0; j < num[0].length; j++) {
     * sum += num[1][j];
     * }
     * System.out.println(sum);
     * }
     * 
     * public static void main(String[] args) {
     * int num[][] = { { 1, 4, 9 },
     * { 11, 4, 3 },
     * { 2, 2, 3 } };
     * 
     * sumRow(num);
     * }
     * 
     * 
     */

    public static void main(String[] args) {
        int row = 2, col = 3;

        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        // display original matrix
        printMatrix(matrix);

        // transpose

        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("the matrix is : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
