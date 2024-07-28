package leetcode;

public class RotatedBinarySearch {

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2,3};
        int[] arrd = {4,5,6,6,6,6,7,0,1,2,3};
        int target = 2;
     //   System.out.println(search(arr,target));
        System.out.println(search(arrd,target));
    }
    public static int search(int[] arr, int target){

        //int pivot = findPivot(arr);
        int pivot =  findPivotWithDuplicates(arr);

        if(pivot == -1){
            return binarySearch(arr,target,0, arr.length-1);
        }
        if(target == arr[pivot]){
            return pivot;
        }

        if(target > arr[0]){
          return binarySearch(arr, target,  0 , pivot - 1 );
        }

       return binarySearch(arr, target, pivot + 1,arr.length-1);
    }

    public static int findPivot(int[] arr){
        int start  = 0;
        int end = arr.length-1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            // case 1
            if ( mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // case 3
            if (arr[mid] <= arr[start] ) {
                end = mid - 1;
            }
            //case 4
            if (arr[start] < mid) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]){
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

/*

Aug 16, 2023
The steps are as follows:

Place the 2 pointers i.e. low and high: Initially, we will place the pointers like this: low will point to the first index, and high will point to the last index.
Calculate the ‘mid’: Now, inside a loop, we will calculate the value of ‘mid’ using the following formula:
mid = (low+high) // 2 ( ‘//’ refers to integer division)
Check if arr[mid] == target: If it is, return the index mid.
Identify the sorted half, check where the target is located, and then eliminate one half accordingly:
1. if arr[low] <= arr[mid]: This condition ensures that the left part is sorted.
a. If arr[low] <= target && target <= arr[mid]: It signifies that the target is in this sorted half. So, we will eliminate the right half (high = mid-1).
b. Otherwise, the target does not exist in the sorted half. So, we will eliminate this left half by doing low = mid+1.
2. Otherwise, if the right half is sorted:
a. If arr[mid] <= target && target <= arr[high]: It signifies that the target is in this sorted right half. So, we will eliminate the left half (low = mid+1).
b. Otherwise, the target does not exist in this sorted half. So, we will eliminate this right half by doing high = mid-1.
Once, the ‘mid’ points to the target, the index will be returned.
This process will be inside a loop and the loop will continue until low crosses high. If no index is found, we will return -1.
* */