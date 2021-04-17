package topic.dp;

public class LC053_最大子序和 {
	public int maxSubArray(int[] nums) {
		int len = nums.length;
		if (len == 1) {
			return nums[0];
		}
		int[] dp = new int[len];
		dp[0] = nums[0];
		for (int i = 1; i < len; i++) {
			dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
		}
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			res = Math.max(res, dp[i]);
		}
		return res;
	}
}
