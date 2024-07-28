package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeNosDisappearedInArray {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> answer = missingNumber(nums);
        System.out.println("Missing Number ::"  +  answer);
    }

    private static List<Integer> missingNumber(int[] nums) {
        int[] result = sort(nums);
        List<Integer> integers = new ArrayList<>();
        for (int index = 0; index < result.length; index++){
            if(result[index] != index + 1){
                 integers.add(index + 1);
            }
        }
        return integers;
    }

    public static int[] sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i , correctIndex);
            } else {
                i++;
            }
        }
        return nums;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
