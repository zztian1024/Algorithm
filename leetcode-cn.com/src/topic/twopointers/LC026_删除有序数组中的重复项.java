package topic.twopointers;

public class LC026_删除有序数组中的重复项 {
	public int removeDuplicates1(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				nums[++i] = nums[j];
			}
		}
		return i + 1;
	}

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return nums.length;
		}
		// 原地删除，快慢指针法
		// 左指针标记位置，
		int index = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[index]) {
				index++;
				nums[index] = nums[j];
			}
		}
		return index + 1;
	}
}
