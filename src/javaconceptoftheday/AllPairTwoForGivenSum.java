package javaconceptoftheday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AllPairTwoForGivenSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15,4,5};
        int target = 9;
        int[] answer = twoSum(nums,target);
        Map<Integer,Integer> answer2 = twoSumValue(nums,target);
        System.out.println("two sum problem ::"  + Arrays.toString(answer));
        System.out.println("two sum problem with value ::"  + answer2.toString());
    }

    public static int[] twoSum(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[]{-1,-1};
        }

        Map<Integer,Integer> integerMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++ ) {
            int complement = target - nums[i];

            if(integerMap.containsKey(complement)){
               return new int[]{integerMap.get(complement),i};
           }else {
               integerMap.put(nums[i],i);
           }
        }
        return new int[]{-1,-1};
    }

    public static Map<Integer,Integer> twoSumValue(int[] nums, int target) {

        Map<Integer,Integer> values = new HashMap<>();

        if (nums.length == 0) {
             values.put(-1,-1);
             return values;
        }

        Map<Integer,Integer> integerMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++ ) {
            int complement = target - nums[i];

            if(integerMap.containsKey(complement)){
                values.put(complement,nums[i]);
            }else {
                integerMap.put(nums[i],i);
            }
        }
        if(!values.keySet().isEmpty()){
            return values;
        }

        values.put(-1,-1);
        return values;
    }
}
