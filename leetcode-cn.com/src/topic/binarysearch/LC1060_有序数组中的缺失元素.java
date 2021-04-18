package topic.binarysearch;

public class LC1060_有序数组中的缺失元素 {
	public int missingElement(int[] nums, int k) {

		if (k <= 0 || nums == null || nums.length == 0) {
			return -1;
		}

		int min = nums[0];
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = (right + left) >> 1;
			// 对于以0开头，连续无缺失值数组，索引和数字相等，如果前面有缺失值，则必然 num[idx] - idx > 0；
			// 对于缺失超过 k 个值的数字，必然有 num[idx] - idx - k >= 0，由于本题数组开始值不为0，还需要减去最小值
			if (nums[mid] - min - mid - k >= 0) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		// 最后结果分两步判断：
		// 1、如果整个数组缺失值不超过k，则left为nums.length，假设数组连续，
		// 则最后一位为起始值加数组长度减一，这样大于数组末尾的第k值就是最后一位加k；
		// 2、如果left在数组中，则根据收缩条件num[left] - left - min - k >= 0为最前面满足条件的值，
		// 即num[left - 1] -left + 1 - min - k < 0
		// 即min + left + k - 1在left - 1和left索引指向的数的中间，可以推断为缺失的第k个值。
		// 结合得到一个公式：
		return min + left + k - 1;
	}
}
class NC_缺失数字 {

	// 二分查找(简化写法)
	public int solve(int[] a) {
		int left = 0, right = a.length - 1;
		while (left <= right) {
			int mid = (right + left) >> 1;
			if (a[mid] == mid) { // 这里注意
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return left;
	}
}
