package problemset.offer;

import java.util.HashSet;
import java.util.Set;

public class Offer03_数组中重复的数字 {
	// 原地哈希
	public int findRepeatNumber(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			if (nums[i] == i) {// 如果当前位置元素值 == 当前位置下标，则继续
				i++;
				continue;
			}
			// 如果当前位置元素以及存在，返回，否则，进行交换
			if (nums[nums[i]] == nums[i])
				return nums[i];
			int temp = nums[i];
			nums[i] = nums[temp];
			nums[temp] = temp;
		}
		return -1;
	}

	// 哈希表
	public int findRepeatNumber1(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		int repeat = -1;
		for (int num : nums) {
			if (!set.add(num)) {
				repeat = num;
				break;
			}
		}
		return repeat;
	}
}
