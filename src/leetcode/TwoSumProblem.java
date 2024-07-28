package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] answer = twoSum(nums,target);
        System.out.println("two sum problem ::"  + Arrays.toString(answer));
    }

    public static int[] twoSum(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[]{-1,-1};
        }

        Map<Integer,Integer> integerMap = new HashMap<>();
        for(int i = 0; i < nums.length-1; i++ ) {
            int complement = target - nums[i];

            if(integerMap.containsKey(complement)){
               return new int[]{integerMap.get(complement),i};
           }else {
               integerMap.put(nums[i],i);
           }
        }
        return new int[]{-1,-1};
    }
}
