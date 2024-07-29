package javaconceptoftheday;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;
        int sum = checkArmstrongNumber(153);
        if (sum == number)
        {
            System.out.println(number+" is an armstrong number");
        }
        else
        {
            System.out.println(number+" is not an armstrong number");
        }
    }

    private static int checkArmstrongNumber(int number) {
        int copyNumber =  number;
        int noOfDigit = (int) Math.log10(number) + 1;
        int sum = 0;
        while (copyNumber != 0) {
            int lastDigit  =  copyNumber % 10;
            sum  = (int) (sum + Math.pow(lastDigit,noOfDigit));

            /*
            * for(int i = 0; i < noOfDigit; i++)
            {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
            }
            sum = sum + lastDigitToThePowerOfNoOfDigits;
            *
            * */
            copyNumber = copyNumber / 10;
        }
        return sum;
    }
}
