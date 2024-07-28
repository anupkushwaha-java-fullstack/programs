package leetcode;

public class FindMin {

    public static void main(String[] args) {
        int[] nums = {12,34,55,66,43,53,22,1,38,56};
        int answer = findMinimumElement(nums);
        System.out.println("MINIMUM VALUE IS ::"  + answer);
    }

    public static int findMinimumElement(int[] arr ) {

        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int index = 1; index < arr.length ; index++) {
            if (arr[index] < min) {
                min = arr[index];
            }
        }
        return min;
    }
}
