package topic.binarysearch;

public class LC081_搜索旋转排序数组II {
	public boolean search(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) >> 1;
			if (nums[mid] == target)
				return true;
			if (nums[start] < nums[mid]) {
				// 左侧有序，旋转发生在右侧
				if (target < nums[mid] && target >= nums[start]) {
					end = mid;
				} else {
					start = mid + 1;
				}
			} else if (nums[mid] < nums[start]) {
				// 右侧有序，旋转发生在左侧
				if (nums[mid] < target && target < nums[start]) {
					start = mid + 1;
				} else {
					end = mid;
				}
			} else {
				start++;
			}
		}
		return false;
	}
}
