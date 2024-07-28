package leetcode;

public class LeetCodeDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = duplicateNumber(nums);
        System.out.println("Duplicate Number::" + duplicate);
    }

    public static int duplicateNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swapElement(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
    return -1;
}

    public static void swapElement(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
