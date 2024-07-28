package leetcode;

public class LeetCodeNoOfSteps {

    public static void main(String[] args) {

        int answer = numberOfSteps(200);
        System.out.println("No of Steps LeetCode ::"  + answer);
    }
    public static  int numberOfSteps(int num) {
         return helper(num,0);
    }

    public static int helper(int num, int steps) {

        if(num ==0 ){
            return steps;
        }

        if(num % 2 ==0 ){
            return helper(num/2,steps+1);
        }else{
            return helper(num-1,steps+1);
        }
    }
}
