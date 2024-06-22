public class FloorOfNumber {

    public static void main(String[] args) {
        int[] arr = {2,4,5,9,12,14,16,19,20,45,55};
        int answer = findFloorOfNumber(arr,12);
        System.out.println("answer::: " + answer);
    }

    public static int findFloorOfNumber(int[] arr, int target) {
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
        return end;
    }
}
