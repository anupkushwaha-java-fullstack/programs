package leetcode;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int [] arr = {5,4,3,2,1};
        System.out.println("Before swap :: " + Arrays.toString(arr));
        int[] result  = bubbleSort(arr);
        System.out.println("After swap :: " + Arrays.toString(result));
    }

    public static int[] bubbleSort(int[] arr) {
        // run the step upto n-1
        for (int i = 0; i < arr.length; i++) {

            boolean swapped = false;
            // for each iteration the max item will come at the  last element.
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
                //if you did n't stop the value it means that the array is sorted
                // hence break
                if (!swapped) {
                    break;
                }
            }
        }
        return arr;
    }
}
