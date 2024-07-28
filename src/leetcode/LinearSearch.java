package leetcode;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arrays = {12,34,55,66,43,53,22,1,34,56};
        int target = 34;
        int answer = linearSearch(arrays,target);

        int answerElement = linearSearchReturnElement(arrays,target);
        boolean isPresent = linearSearchReturnBoolean(arrays,target);

        System.out.println("Answer Index ::"  + answer);
        System.out.println("Answer Element:: "  + answerElement);
        System.out.println("Answer is Present :: "  + isPresent);
    }

    public static int linearSearch(int[] arr , int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    public static int linearSearchReturnElement(int[] arr , int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
    public static boolean linearSearchReturnBoolean(int[] arr , int target) {

        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
