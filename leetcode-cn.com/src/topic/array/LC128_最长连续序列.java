package topic.array;

import java.util.HashSet;

public class LC128_最长连续序列 {
	public int longestConsecutive(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);// 添加set 去重
		}
		int maxLength = 0;
		for (int n : set) {
			if (!set.contains(n - 1)) {
				int len = 0;
				while (set.contains(n++)) {
					len++;// 累加长度
				} // 计算最大长度
				maxLength = Math.max(maxLength, len);
			}
		}
		return maxLength;
	}
}
