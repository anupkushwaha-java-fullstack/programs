package leetcode;

public class LeetCodeMissingPositiveNumber {

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int answer = firstMissingPositive(nums);
        System.out.println("Missing Number ::"  +  answer);
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] -1 ;
            if (nums[i] > 0 && nums[i] < nums.length &&  nums[i] != nums[correctIndex]) {
                swapElement(nums, i,correctIndex);
            }else{
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return nums.length + 1;

    }

    public static void swapElement(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
