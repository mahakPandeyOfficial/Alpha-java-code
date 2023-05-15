import java.util.*;

//BubbleSort 
public class Day9 {

    public static void BubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int arr[]) {
        int misPos;
        for (int i = 0; i < arr.length; i++) {

            int minPos = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    misPos = arr[j];
                }
            }
            // swap

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //insertion sort 
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int arr[] = { 7, 6, 9, 4, 2 };
        int arr[] = new int[5];

        System.out.println("enter the number :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("sorted form : ");
        // BubbleSort(arr);
        selectionSort(arr);
        printArray(arr);
    }
}
