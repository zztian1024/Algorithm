package topic.dp;

public class LC053_最大子序和 {
	public int maxSubArray(int[] nums) {
		// 如果是一个元素直接返回
		int len = nums.length;
		if (len == 1) {
			return nums[0];
		}
		int dp = nums[0], res = dp;
		for (int i = 1; i < len; i++) {
			dp = Math.max(nums[i], nums[i] + dp);
			res = Math.max(dp, res);
		}
		return res;
	}

	public int maxSubArray1(int[] nums) {
		int len = nums.length;
		if (len == 1) {
			return nums[0];
		}
		int[] dp = new int[len];
		dp[0] = nums[0];
		int res = dp[0];
		for (int i = 1; i < len; i++) {
			dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
			res = Math.max(res, dp[i]);
		}
		return res;
	}
}
