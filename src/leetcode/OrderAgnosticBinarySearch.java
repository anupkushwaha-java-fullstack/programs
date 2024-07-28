package leetcode;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,4,5,9,12,14,16,19,20,45,55};
        int[] arrd = {99,88,77,66,55,44,33,22,20,8,7};
        int answer = binarySearch(arr,16);
        System.out.println(" answer::: " + answer);
        System.out.println(" answer::: " + binarySearch(arrd,44));
    }

    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
