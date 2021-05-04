package DynamicPrograming;

import java.util.Arrays;

public class DP_322 {
    public static void main(String[] args) {

    }
}

class Solution_322 {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (i = 1; i <= amount; ++i) {
            f[i] = Integer.MAX_VALUE;
            for (j = 0; j < n; j++) {
                f[i] = Math.min(f[i - coins[j]] + 1, f[i]);
            }
        }
    }
}