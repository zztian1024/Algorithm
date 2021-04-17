package topic.array;

public class LC189_旋转数组 {
	public void rotate(int[] nums, int k) {
		// 方法2：旋转数组
		// 思想：当我们将数组的元素向右移动 k 次后，尾部 k % n 个元素会移动至数组头部，
		// 其余元素向后移动 k % n 个位置
		// 先将所有元素翻转，这样尾部的 k % n 个元素就被移至数组头部，
		// 然后我们再翻转 [0, k % n-1] 区间的元素和 [k % n, n−1] 区间的元素即能得到最后的答案
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	// 方法1：新数组缓存
	public void rotate1(int[] nums, int k) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			// int target = i < k ? nums.length - 1 - k : i + k;
			arr[(i + k) % nums.length] = nums[i];
		}
		System.arraycopy(arr, 0, nums, 0, nums.length);
	}
}
