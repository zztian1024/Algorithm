package topic.twopointers;

public class LC283_移动零 {
	// 双指针2
	public void moveZeroes1(int[] nums) {
		if (nums == null) {
			return;
		}
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) { // 核心思想：如果一直不为0，则i=j,即没有交换
				int temp = nums[i]; // 如果有0存在，则势必 j < i
				nums[i] = nums[j]; // 则相当于将大于 0 的都移动到了 j 的左侧，
				nums[j++] = temp; // 右侧就是交换后的 0
			}
		}
	}

	// 双指针1：
	public void moveZeroes(int[] nums) {
		if (nums == null) {
			return;
		}
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) { // 核心思想就是，如果当前位置不为 0 ，则向前移动
				nums[j++] = nums[i]; // 向前移动
			}
		}
		for (; j < nums.length; j++) {
			nums[j] = 0; // 复写为 0
		}
	}
}
