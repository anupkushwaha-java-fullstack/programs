package leetcode;

public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int answer = findCeilingOfNumber(arr,15);
        System.out.println("answer::: " + answer);
    }

    public static int findCeilingOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid -1;
            } else if(target > arr[mid]){
                start = mid +1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
