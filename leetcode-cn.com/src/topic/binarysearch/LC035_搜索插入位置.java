package topic.binarysearch;

public class LC035_搜索插入位置 {
	public int searchInsert(int[] nums, int target) {
		int left = 0, right = nums.length - 1, index = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target < nums[mid]) {
				right = mid - 1;
			} else if (target > nums[mid]) {
				left = mid + 1;
				index = mid + 1;
			} else {
				return mid;
			}
		}
		return index;
	}
}
