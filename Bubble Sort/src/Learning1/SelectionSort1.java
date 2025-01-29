package Learning1;

import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        selectionSort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int start) {
        if (start >= arr.length - 1) return; // Base case: stop when start reaches the end

        int minIndex = findMinIndex(arr, start, start + 1);

        // Swap the found minimum element with the first element of the unsorted part
        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        // Recursive call for the remaining part of the array
        selectionSort(arr, start + 1);
    }
    static int findMinIndex(int[] arr, int minIndex, int current) {
        if (current == arr.length) return minIndex; // Base case: reached end of array

        if (arr[current] < arr[minIndex]) {
            minIndex = current;
        }

        return findMinIndex(arr, minIndex, current + 1);
    }
}
