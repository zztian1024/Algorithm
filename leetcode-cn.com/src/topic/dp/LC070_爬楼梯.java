package topic.dp;

public class LC070_爬楼梯 {
	public int climbStairs(int n) {
		int a = 0, b = 1, c = 0;
		for (int i = 1; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public int climbStairs2(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
