package topic.dp;

public class LC377_组合总和Ⅳ {
	public int combinationSum4(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return 0;
		int[] dp = new int[target + 1];
		dp[0] = 1;
		for (int i = 1; i < target + 1; i++) {
			for (int num : nums) {
				if (i >= num) {
					dp[i] += dp[i - num];
				}
			}
		}
		return dp[target];
	}
}
