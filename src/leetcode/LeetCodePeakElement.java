package leetcode;

public class LeetCodePeakElement {

  //  https://leetcode.com/problems/peak-index-in-a-mountain-array/

    public static void main(String[] args) {
        int[] arr = {0,1,3,5,7,9,10,8,6,4,2};

        int answer = peakIndexInMountainArray(arr);
        System.out.println("answer::: " + answer);
    }

    public static int peakIndexInMountainArray(int [] nums) {
            int start = 0;
            int end = nums.length-1;
            while(start < end) {
                int mid = start + (end - start) / 2;
                if(nums[mid] > nums[mid+1]){
                    end = mid;
                } else {
                    start = mid +1;
                }
            }
            return start;
    }

}
