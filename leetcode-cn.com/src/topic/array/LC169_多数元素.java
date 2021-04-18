package topic.array;

public class LC169_多数元素 {
	// 哈希表：枚举数组中的每个元素，再遍历一遍数组统计其出现次数
	// 时间复杂度为 O(n)、空间复杂度为 O(n)
	// 排序法：先将 nums 数组排序，然后返回 n/2 的下标对应的元素
	// 时间复杂度为 O(nlogn)、空间复杂度为 O(1)
	// 投票法：把众数记为 +1+1，把其他数记为 -1−1，将它们全部加起来，显然和大于 0
	// 时间复杂度为 O(n)、空间复杂度为 O(1)
	public int majorityElement(int[] nums) {
		int c = 0, n = 0;
		for (int i = 0; i < nums.length; i++) {
			if (c == 0) {
				n = nums[i];
			}
			c = n == nums[i] ? c + 1 : c - 1;
		}
		return n;
	}
}
