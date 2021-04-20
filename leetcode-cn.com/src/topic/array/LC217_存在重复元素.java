package topic.array;

import java.util.Arrays;

public class LC217_存在重复元素 {
	// 排序
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;

//		Set<Integer> set = new HashSet<>();
//        for (int num: nums) {
//            if (set.contains(num)) {
//                return true;
//            }
//            set.add(num);
//        }
//        return false;
	}
}
