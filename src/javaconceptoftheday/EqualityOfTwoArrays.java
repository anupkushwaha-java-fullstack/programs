package javaconceptoftheday;

import java.util.Arrays;
//https://javaconceptoftheday.com/java-interview-programs-with-solutions/#google_vignette
public class EqualityOfTwoArrays {

    public static void main(String[] args) {

        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};
        System.out.println("Is Array Equal Using Normal ::: " + checkEqualityOfArray(arrayOne,arrayTwo));
        System.out.println("Is Array Equal Using Arrays.Equals  ::: " + checkEqualityOfArrayEquals(arrayOne,arrayTwo));

        int[][] array2DOne = {{2, 5, 1, 7, 4},{5, 6, 7, 8, 9}};
        int[][] array2DTwo = {{2, 5, 1, 7, 4},{5, 6, 6, 8, 9}};
        System.out.println("Is Array Equal Using Arrays.DeepEquals  ::: " + checkEqualityOfArrayDeepEquals(array2DOne,array2DTwo));

    }

    public static boolean checkEqualityOfArray(int[] arrayOne, int[] arrayTwo) {

        if (arrayOne.length != arrayTwo.length) {
            return false;
        } else {

            boolean isEquals = true;

            for (int i = 0; i < arrayOne.length - 1; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    isEquals = false;
                    break;
                }
            }
            return isEquals;
        }
    }

    public static boolean checkEqualityOfArrayEquals(int[] arrayOne, int[] arrayTwo) {
        return Arrays.equals(arrayOne,arrayTwo);
    }

    public static boolean checkEqualityOfArrayDeepEquals(int[][] arrayOne, int[][] arrayTwo) {
        return Arrays.deepEquals(arrayOne,arrayTwo);
    }

}
