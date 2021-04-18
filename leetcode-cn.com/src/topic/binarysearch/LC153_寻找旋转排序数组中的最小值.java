package topic.binarysearch;

public class LC153_寻找旋转排序数组中的最小值 {
	// 二分查找
	public int findMin(int[] nums) {
		int end = nums.length - 1, start = 0;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > nums[end]) {
				start = mid + 1;
			} else if (nums[mid] < nums[end]) {
				end = mid;
			}
		}
		return nums[start];
	}
}
