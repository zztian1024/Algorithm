package topic.twopointers;

public class LC027_移除元素 {
	// 双指针1
	public int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i++] = nums[j];
			}
		}
		return i;
	}

	// 双指针2
	public int removeElement2(int[] nums, int val) {

		int slow = 0, fast = 0;
		while (fast < nums.length) { // 1.迭代
			if (nums[fast] != val) { // 2.如果没有遇到目标元素，则慢指针步进
				nums[slow] = nums[fast];// 3.交换快慢指针元素
				slow++; // 步进
			}
			fast++; // 4.快指针步进
		}
		return slow;
	}
}
