package topic.binarysearch;

public class LC033_搜索旋转排序数组 {
	public int search(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) >> 1;
			if (nums[mid] == target)
				return mid; // 找到了
			if (nums[start] <= nums[mid]) { 
				// 第一个元素，小于等于中间位置元素（旋转发生在mid 后）
				// 左侧有序，看看如果在这个区间，则右侧end = mid - 1
				if (nums[start] <= target && target < nums[mid])
					end = mid - 1;
				else
					start = mid + 1; 
					// 反之，应该在mid+1 后面
			} else { 
				// 第一个元素，大于中间位置元素，左侧发生了旋转，右侧是有序的
				// 中间元素小于Target 并且尾部元素大于Target，说明位于右侧区域，则缩小左侧区间
				if (nums[mid] < target && target <= nums[end])
					start = mid + 1;
				else
					end = mid - 1; 
					// 反之，在左侧区域，应该在mid-1 前面
			}
		}
		return -1;
	}
}
