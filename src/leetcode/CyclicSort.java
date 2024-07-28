package leetcode;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int[] answer = sort(nums);
        System.out.println("Cyclic Sort ::"  + Arrays.toString(answer));
    }

    public static int[] sort(int[] arr) {
        int i =0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i] != arr[correctIndex]) {
                swapElement(arr, i,correctIndex);
            }else{
                i++;
            }
        }
        return arr;
    }

    public static void swapElement(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
