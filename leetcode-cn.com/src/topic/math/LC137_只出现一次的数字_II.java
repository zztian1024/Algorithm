package topic.math;

import java.util.HashMap;
import java.util.Map;

public class LC137_只出现一次的数字_II {

	// 有限状态自动机
	// 参考：https://leetcode-cn.com/problems/single-number-ii/solution/single-number-ii-mo-ni-san-jin-zhi-fa-by-jin407891/
	public int singleNumber(int[] nums) {
		int ones = 0, twos = 0;
		for (int num : nums) {
			ones = ones ^ num & ~twos;
			twos = twos ^ num & ~ones;
		}
		return ones;
	}

	// 哈希表法
	// 时间复杂度：O(n)，其中 nn 是数组的长度。
	// 空间复杂度：O(n)
	public int singleNumber1(int[] nums) {
		Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
		for (int num : nums) {
			cache.put(num, cache.getOrDefault(num, 0) + 1);
		}
		int res = 0;
		for (Map.Entry<Integer, Integer> entry : cache.entrySet()) {
			int num = entry.getKey(), occ = entry.getValue();
			if (occ == 1) {
				res = num;
				break;
			}
		}
		return res;
	}
}
