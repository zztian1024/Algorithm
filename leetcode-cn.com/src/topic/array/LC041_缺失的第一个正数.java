package topic.array;

public class LC041_缺失的第一个正数 {

	public int firstMissingPositive(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			// 核心思想：将值为1的元素，放入到下标为0位置，交换
			// 将值为2元素放入到下标为1的位置，交换
			while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
				int temp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = temp;
			}
		}
		// 统计 位置不等于 i + 1 的直接返回，说明每有被上一步检查到
		for (int i = 0; i < n; i++) {
			if (nums[i] != i + 1)
				return i + 1;
		}

		return n + 1;
	}
}
