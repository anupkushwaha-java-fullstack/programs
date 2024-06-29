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
        List<Integer> disAppeared = new ArrayList<>();
        for (int index = 0; index < result.length; index++){
            if(result[index] != index + 1){
                 disAppeared.add(index + 1);
            }
        }
        return disAppeared;
    }

    public static int[] sort(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] -1 ;
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
