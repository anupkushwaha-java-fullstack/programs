package javaconceptoftheday;

public class SumOfAllDigits {

    //https://javaconceptoftheday.com/sum-of-all-digits-of-a-number-in-java/#google_vignette

    public static void main(String[] args) {
        sumOfAllDigits(12345);
        System.out.println("Sum of all digit using recursion: " +
                sumOfAllDigitsUsingRecursion(12345));
    }

    static void sumOfAllDigits(int inputNumber){

        int copyOfNumber =  inputNumber;
        int sum = 0;

        while(copyOfNumber != 0){

            int lastDigit =  copyOfNumber % 10;
            sum = sum + lastDigit;
            copyOfNumber = copyOfNumber/10;
        }
        System.out.println("Sum of all digits: " + inputNumber + " is " + sum);
    }


    public  static int sum = 0;

    static int sumOfAllDigitsUsingRecursion(int inputNumber){

        if(inputNumber == 0)
        {
            //if input number is 0, returning sum
            return sum;
        }
        else
        {
            //Getting last digit of input number
            int lastDigit = inputNumber % 10;

            //Adding last digit to sum
            sum = sum + lastDigit;

            //Removing last digit from input number
            inputNumber = inputNumber/10;

            //Calling the function recursively
            sumOfAllDigitsUsingRecursion(inputNumber);
        }
        return sum;
    }
}
