package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeFindAllDuplicate {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> answer = findAllDuplicate(nums);
        System.out.println("Duplicates in Array ::"  + answer.toString());
    }

    public static List<Integer> findAllDuplicate(int[] nums){
        int[] answer = sort(nums);
        List<Integer>  duplicates = new ArrayList<>();
        for(int index =0; index < answer.length; index++){
            if(answer[index] != index+1){
                duplicates.add(answer[index]);
            }
        }
        return duplicates;
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
