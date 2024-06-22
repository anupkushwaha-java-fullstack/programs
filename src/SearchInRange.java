public class SearchInRange {

    public static void main(String[] args) {
        int[] nums = {12,34,55,66,43,53,22,1,38,56};
        int target = 34;
        int start = 4;
        int end = 10;
        int answer = linearSearchInRange(nums,target, start, end);

        System.out.println("Answer Index ::"  + answer);
    }

    public static int linearSearchInRange(int[] arr , int target, int start, int end) {

        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
