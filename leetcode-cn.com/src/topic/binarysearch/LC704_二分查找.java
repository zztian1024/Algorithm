package topic.binarysearch;

public class LC704_二分查找 {
	// 不重复的升序数组
	public int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = (left + right) >> 1;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	// 有重复元素，找第一个匹配的元素，返回下标
	public int search1(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;
		int left = 0, right = nums.length - 1, index = 0;
		while (left <= right) {
			int mid = (left + right) >> 1;
			if (nums[mid] >= target) {
				right = mid - 1;
				index = mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			}
		}
		return nums[index] == target ? index : -1;
	}
}
