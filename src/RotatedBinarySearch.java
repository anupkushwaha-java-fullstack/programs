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

    public static int findPivotWithDuplicates(int[] arr){

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
            // IN the cases of  duplicates element
            // check start  ,mid, & end are equal
            //check for pivot & skip then

            if(arr[start] == arr[mid] && arr[start] == arr[end]){

                if (arr[start] > arr[start + 1]){
                    return  start;
                }
                start++;

                if (arr[end] < arr[end- 1]){
                    return end -1;
                }
                end--;
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
