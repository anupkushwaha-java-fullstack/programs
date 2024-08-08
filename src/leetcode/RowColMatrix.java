package leetcode;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
      int[][]  arr = { {12 ,13, 14, 15},
                       {22, 23, 24, 25},
                       {32, 33, 34, 35},
                       {42, 43 ,44 ,45}
        };
        System.out.println(Arrays.toString(search(arr,34)));
    }

    public static int[] search(int[][] matrix, int target){
        int row = 1;
        int col = matrix.length-1;

        while(row < matrix.length && col >= 0 ){

            if(matrix[row][col] == target){
                return new int[]{row,col};
            }

            if(matrix[row][col] < target){
               row ++;
            }else {
                col --;
            }
        }
        return new int[]{-1,-1};
    }
}
