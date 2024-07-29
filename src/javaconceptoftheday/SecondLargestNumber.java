package javaconceptoftheday;

import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5,6,7,8};
        int secondLargest = secondLargest(arr);
        System.out.println("Second Largest Element from " +
                Arrays.toString(arr) + " is " + secondLargest);
    }

   public static int secondLargest(int[] input){
        int firstLargerElement;
        int secondLargerElement;

        if(input[0] > input[1]){
            firstLargerElement = input[0];
            secondLargerElement = input[1];
        } else {
            firstLargerElement = input[1];
            secondLargerElement = input[0];

            for (int i = 2; i < input.length - 1; i++) {

                if (input[i] > firstLargerElement) {
                    firstLargerElement = input[i];
                    secondLargerElement = firstLargerElement;
                } else if (input[i] < firstLargerElement && input[i] > secondLargerElement) {
                    secondLargerElement = input[i];
                }
            }
        }
        return secondLargerElement;
    }
}
