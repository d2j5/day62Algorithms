package writingAlgorithms;

public class CountingSort {
    public static String countingSort(String arr) {
        // Step 1: Find the maximum element in the input array
        int max = 0;
        for (int i = 0; i < arr.length(); i++) {
            max = Math.max(max, arr.charAt(i) - 'a');
        }

        // Step 2: Create a count array to store the frequency of each character
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length(); i++) {
            count[arr.charAt(i) - 'a']++;
        }

        // Step 3: Modify the count array to store the cumulative frequency
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Create a sorted output array
        char[] output = new char[arr.length()];
        for (int i = arr.length() - 1; i >= 0; i--) {
            output[count[arr.charAt(i) - 'a'] - 1] = arr.charAt(i);
            }

        // Step 5: Convert the output array to a string and return it
        return new String(output);
    }

    public static void main(String[] args) {
        String input = "dcba";
        String sorted = countingSort(input);
        System.out.println(sorted); // Output: abcd
    }
}
