package leetcode;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int [] arr = {5,4,3,2,1};
        System.out.println("Before swap :: " + Arrays.toString(arr));
        int[] result  = selectionSort(arr);
        System.out.println("After swap :: " + Arrays.toString(result));
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last  = arr.length - i - 1;
            int maxIndex  =  getMaxIndexElement(arr,0, last);
            swap( arr, maxIndex, last);
        }
        return arr;
    }

    private static int getMaxIndexElement(int[] arr, int start, int lastIndex) {
        int max = start;
        for (int j = start; j <= lastIndex; j++) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }
        return max;
    }

    public static void swap(int [] arr, int first, int second){
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
