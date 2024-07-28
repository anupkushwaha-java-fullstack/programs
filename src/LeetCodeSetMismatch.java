import java.util.Arrays;

public class LeetCodeSetMismatch {

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println("Sort Array::"  + Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums( int[] nums){
        int[] sortedArray = sort(nums);
        for( int index = 0; index < sortedArray.length ; index++){
            if( sortedArray[index] != index +1){
                return new int[] { sortedArray[index],index + 1};
            }
        }
        return new int[] { -1,-1 };
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
