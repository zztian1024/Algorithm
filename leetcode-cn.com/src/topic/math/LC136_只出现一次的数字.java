package topic.math;

public class LC136_只出现一次的数字 {
	public int singleNumber(int[] nums) {
		int res = 0;
		for (int n : nums) {
			res ^= n;
		}
		return res;
	}
}
