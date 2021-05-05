package topic.dp;

public class LC740_删除并获得点数 {
	// 计算最大值 100%
	public int deleteAndEarn(int[] nums) {
		int maxVal = 0;
		for (int i = 0; i < nums.length; i++) {
			maxVal = Math.max(maxVal, nums[i]);
		}
		int[] dp = new int[maxVal + 1];
		for (int i = 0; i < nums.length; i++) {
			dp[nums[i]] += nums[i];
		}
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + dp[i]);
		}
		return dp[maxVal];
	}
	// 写定上限，35%
	public int deleteAndEarn1(int[] nums) {
		int maxVal = 10001;
		int[] dp = new int[maxVal];

		for (int i = 0; i < nums.length; i++) {
			dp[nums[i]] += nums[i];
		}

		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + dp[i]);
		}

		return dp[maxVal - 1];
	}
}
