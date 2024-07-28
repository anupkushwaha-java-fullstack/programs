package leetcode;

public class LeetCodeDigitCount {

    public static void main(String[] args) {
        int[] numbers = {12,345,3344,455,3235,34,54};


        int count = findNumbers(numbers);
        System.out.println("COUNT OF EVEN numbers:" + count);
    }

    static int findNumbers(int[] numbers){
        int count = 0;
        for( int number : numbers){
            if(even(number)){
                count++;
            }
        }
      return count;
    }

    private static boolean even(int number) {

        int numberOfDigits =  getDigitCount(number);
        return numberOfDigits % 2 == 0;
    }

    // LESS POWERFULL
    private static int getDigit(int number) {
       if(number < 0){
           number  = number * -1;
       }
       int count = 0;
       while(number > 0){
           count++;
           number = number/10;
       }
       return count;
    }


    private static int getDigitCount(int number) {
        if(number < 0) {
            number  = number * -1;
        }
        return (int) Math.log10(number) +  1;
    }
}
