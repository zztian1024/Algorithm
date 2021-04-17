package topic.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15_三数之和 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();

		if (nums == null || nums.length < 3) {
			return res;
		}
		Arrays.sort(nums); // 排序，双指针
		for (int i = 0; i < nums.length - 2; i++) {

			if (nums[i] > 0)
				break;
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			int left = i + 1, right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					ArrayList<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[left]);
					list.add(nums[right]);
					res.add(list);

					while (left < right && nums[left] == nums[left + 1])
						left++;
					while (left < right && nums[right] == nums[right - 1])
						right--;

					left++;
					right--;
				} else if (sum > 0) {
					right--;
				} else {
					left++;
				}
			}
		}

		return res;
	}
}
