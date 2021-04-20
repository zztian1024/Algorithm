package topic.array;

import java.util.ArrayList;
import java.util.List;

public class LC442_数组中重复的数据 {

	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < nums.length; ++i) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] < 0)
				res.add(Math.abs(index + 1));
			// 如果位置i-1 上的数字已经为负，则i是出现两次的数字。
			nums[index] = -nums[index];
			// 将位置i-1处的数字翻转为负数
		}
		return res;
	}

	public List<Integer> findDuplicates1(int[] nums) {
		List<Integer> res = new ArrayList<>();

		if (nums == null || nums.length == 0) {
			return res;
		}
		// 原地 hash 排 和之前的那个差不多
		// 他这里相当于只用考虑 第3部分
		for (int i = 0; i < nums.length; i++) {
			while (nums[nums[i] - 1] != nums[i]) {
				swap(nums, i, nums[i] - 1);
			}
		}

		// 把不对应的收集
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				res.add(nums[i]);
			}
		}
		return res;
	}

	public void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
}
