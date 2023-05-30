package writingAlgorithms;

import java.io.OptionalDataException;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Perform n-1 passes through the array
        for (int i = 0; i < n - 1; i++) {
            // Each pass will move the largest element to the end
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap if necessary
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 1};

        System.out.println("Array before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array after sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}