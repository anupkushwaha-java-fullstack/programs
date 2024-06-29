import java.util.Arrays;

public class LeetCodeMissingNumber {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int answer = missingNumber(nums);
        System.out.println("Missing Number ::"  +  answer);
    }

    private static int missingNumber(int[] nums) {
        int[] result = sort(nums);
        for (int index = 0; index < result.length; index++){
            if(result[index] != index){
                return index;
            }
        }
        return result.length;
    }

    public static int[] sort(int[] nums) {
        int i =0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if (nums[i] < nums.length &&  nums[i] != nums[correctIndex]) {
                swapElement(nums, i,correctIndex);
            }else{
                i++;
            }
        }
        return nums;
    }

    public static void swapElement(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
