public class LeetCodeFindInMountainArray {

  //  https://leetcode.com/problems/find-in-mountain-array/

    public static void main(String[] args) {
        int answer =  search();
        System.out.println("answer:::: " + answer);
    }

    public static int search(){
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int end = getPeakFromMountainArray(arr);
        int answer = findInMountainArray(arr,target,0,end);
        if(answer != -1) {
            return answer;
        }
        return findInMountainArray(arr,target,end,arr.length);
    }

    public static int getPeakFromMountainArray(int [] mountainArr) {
            int start = 0;
            int end = mountainArr.length-1;
            while(start < end) {
                int mid = start + (end - start) / 2;
                if(mountainArr[mid] > mountainArr[mid+1]){
                    end = mid;
                } else {
                    start = mid +1;
                }
            }
            return start;
    }

    public static int findInMountainArray(int[] arr, int target, int start , int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
