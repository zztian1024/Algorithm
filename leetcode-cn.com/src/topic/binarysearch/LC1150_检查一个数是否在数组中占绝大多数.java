package topic.binarysearch;

public class LC1150_检查一个数是否在数组中占绝大多数 {
	// 二分查找 O(logn)
	public boolean isMajorityElement(int[] nums, int target) {
		int half = nums.length / 2, lindex = search(nums, target);
		return lindex + half < nums.length && (nums[lindex] == target) && (nums[lindex + half] == target);
	}

	int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1, index = 0;
		while (left <= right) {
			int mid = (left + right) >> 1;
			if (nums[mid] >= target) {
				right = mid - 1;
				index = mid;
			} else {
				left = mid + 1;
			}
		}
		return index;
	}

	// 双指针 O(n)
	public boolean isMajorityElement2(int[] nums, int target) {
		int left = 0, right = nums.length - 1, mid = nums.length / 2, count = 0;
		while (left <= right) {
			if (nums[left++] == target)
				count++;
			if (nums[right--] == target)
				count++;
		}
		return count > mid;
	}
}
