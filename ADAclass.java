import java.util.*;

public class ADAclass {
    public static void main(String[] args) {
        int A[] = { 5, 6, 9, 8, 7, 2, 3, 4, 1 };
        System.out.println("Sorted form of array is : ");

        mergeSort(A, 0, 0);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
    }
    public static void mergeSort(int A[], int p, int r) {
        int q;
        if (p < r) {

            q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);

        }
    }

    public static void Merge(int A[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 1; i <= n1; i++) {
            L[i] = A[p + i];
        }
        for (int j = 1; j <= n2; j++) {
            R[j] = A[q + 1 + j];
        }
        int i = 1, j = 1, k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }
    }
}
