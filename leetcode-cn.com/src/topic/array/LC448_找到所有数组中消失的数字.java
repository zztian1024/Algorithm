package topic.array;

import java.util.ArrayList;
import java.util.List;

public class LC448_找到所有数组中消失的数字 {
	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> res = new ArrayList<>();
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			int curr = (nums[i] - 1) % len;
			nums[curr] += len;
		}

		for (int i = 0; i < len; i++) {
			if (nums[i] <= len) {
				res.add(i + 1);
			}
		}
		return res;
	}
}
