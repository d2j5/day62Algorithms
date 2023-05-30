package algorithmExercises;

import java.util.Arrays;

public class MainProgram {
    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 1; i< array.length; i++) {
// Compare the current element with the smallest value
            if (array[i] < smallest) {
                // Update the smallest value if the current element is smaller
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[indexOfSmallest]) {
                indexOfSmallest = i;
            }

        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));

        // indices:      0  1  2  3  4
        int[] numbers1 = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers1));

        // indices:       0  1  2  3   4
        int[] numbers2 = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers2, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers2, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers2, 2));

        //Swaping numbers
        int[] numbers3 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers3));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers3));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers3));

    }
}
