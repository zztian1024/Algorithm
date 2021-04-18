package topic.dp;

public class LC518_零钱兑换II {
	public int change(int amount, int[] coins) {
		int dp[] = new int[amount + 1];
		dp[0] = 1;
		for (int coin : coins) {
			for (int i = coin; i <= amount; i++) {
				if (i >= coin) {
					dp[i] = dp[i] + dp[i - coin];
				}
			}
		}
		return dp[amount];
	}
}
