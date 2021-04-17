package topic.twopointers;

import java.util.Arrays;

public class LC088_合并两个有序数组 {
	// 双指针，从后向前
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1, p2 = n - 1, p3 = m + n - 1;
		while (p2 >= 0) { // 数组2已经遍历完
			if (p1 >= 0 && nums1[p1] > nums2[p2]) {
				nums1[p3--] = nums1[p1--];
			} else {
				nums1[p3--] = nums2[p2--];
			}
		}
	}

	// 合并后排序
	public void merge1(int[] nums1, int m, int[] nums2, int n) {
		System.arraycopy(nums2, 0, nums1, m, n);
		Arrays.sort(nums1);
	}
}
