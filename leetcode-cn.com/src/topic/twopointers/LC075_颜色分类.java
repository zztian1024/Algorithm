package topic.twopointers;

public class LC075_颜色分类 {
	public void sortColors(int[] nums) {
		int zero = 0, one = 0, two = nums.length - 1;
		while (one <= two) {
			if (nums[one] == 0) {
				swap(nums, one++, zero++);
			} else if (nums[one] == 1) {
				one++;
			} else if (nums[one] == 2) {
				swap(nums, one, two--);
			}
		}
	}

	void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
