package leetcode;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int [][] arr =  {
                {23,34,56},
                {35,65,76},
                {43,45,99},
                {233,45,40}
        };

        int[] answer = searchIn2DArray(arr, 65);
        int minimumInArray = searchMinimumInArray(arr);
        int maximumInArray = searchMaximumInArray(arr);

        System.out.println("Element in 2D array  is ::"+ Arrays.toString(answer));
        System.out.println("MIN element in 2D array is :: "  + minimumInArray);
        System.out.println("Max element in 2D array is :: "  + maximumInArray);
    }

    public static int[] searchIn2DArray(int[][] arr, int target) {

        if (arr.length == 0) {
            return new int [] {-1,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for ( int col = 0; col < arr[row].length ; col++) {
                if (arr[row][col] == target) {
                    return new int []{ row,col};
                }
            }
        }
        return new int [] {-1,-1};
    }

    public static int searchMinimumInArray(int[][] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if(element < min){
                    min = element;
                }
            }
        }
        return min;
    }

    public static int searchMaximumInArray(int[][] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
