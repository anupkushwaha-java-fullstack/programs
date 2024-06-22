public class LeetCodeMaximumWealth {

    public static void main(String[] args) {

        int[][] numbers = {
                {2,1,3},
                {3,2,1},
                {3,3,3}
        };

        int count = findMaxWealth(numbers);
        System.out.println("MAX Wealth :: " +
                 + count);
    }

    static int findMaxWealth(int[][] numbers) {
        int ans = 0;
        for (int[] row : numbers) {
            int sum = 0;
            for (int column : row) {
                sum += column;
            }
            if (sum > ans) {
                ans = sum;
            }
         }
      return ans;
    }
}
