package Learning1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
//        int[] arr = {1, 2, 3, 4, 5, 6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean isSwapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            //at each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j -1 ] = temp;
                    isSwapped = true;
                }
            }
            //if you did not swap for a particular value of i, means the array is sorted
            if (!isSwapped){
                break;
            }
        }
    }
}
