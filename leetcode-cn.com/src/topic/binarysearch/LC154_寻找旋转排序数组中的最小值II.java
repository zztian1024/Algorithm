package topic.binarysearch;

public class LC154_寻找旋转排序数组中的最小值II {
	public int minArray(int[] nums) {
		int end = nums.length - 1, start = 0;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > nums[end]) {
				start = mid + 1;
			} else if (nums[mid] < nums[end]) {
				end = mid;
			} else {
				end--;
			}
		}
		return nums[start];
	}
}
