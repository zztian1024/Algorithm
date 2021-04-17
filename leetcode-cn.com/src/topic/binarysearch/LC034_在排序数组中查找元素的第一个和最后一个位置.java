package topic.binarysearch;

public class LC034_在排序数组中查找元素的第一个和最后一个位置 {
	// 二分查找
	public int[] searchRange(int[] nums, int target) {
		int left = search(nums, target, true);
		int right = search(nums, target, false) - 1;
		if (left <= right && right < nums.length && nums[left] == target && nums[right] == target) {
			return new int[] { left, right };
		}
		return new int[] { -1, -1 };
	}

	int search(int[] nums, int target, boolean lower) {
		int left = 0, right = nums.length - 1, index = nums.length;
		while (left <= right) {
			int mid = (left + right) >> 1;
			if (nums[mid] > target || (lower && nums[mid] >= target)) {
				right = mid - 1;
				index = mid;
			} else {
				left = mid + 1;
			}
		}
		return index;
	}
}
