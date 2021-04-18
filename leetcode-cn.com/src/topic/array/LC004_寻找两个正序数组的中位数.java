package topic.array;

public class LC004_寻找两个正序数组的中位数 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;
		int left = (m + n + 1) / 2, right = (m + n + 2) / 2;
		return (getKth(nums1, 0, m - 1, nums2, 0, n - 1, left) + getKth(nums1, 0, m - 1, nums2, 0, n - 1, right)) * 0.5;
	}

	int getKth(int[] n1, int s1, int e1, int[] n2, int s2, int e2, int k) {
		int l1 = e1 - s1 + 1, l2 = e2 - s2 + 1;
		if (l1 > l2)
			return getKth(n2, s2, e2, n1, s1, e1, k);
		if (l1 == 0)
			return n2[s2 + k - 1];

		if (k == 1)
			return Math.min(n1[s1], n2[s2]);

		int i = s1 + Math.min(l1, k / 2) - 1;
		int j = s2 + Math.min(l2, k / 2) - 1;

		if (n1[i] > n2[j])
			return getKth(n1, s1, e1, n2, j + 1, e2, k - (j - s2 + 1));
		else
			return getKth(n1, i + 1, e1, n2, s2, e2, k - (i - s1 + 1));
	}
}

class NC在两个长度相等的排序数组中找到上中位数 {
	public int findMedianinTwoSortedAray1(int[] arr1, int[] arr2) {
		int len = arr1.length;
		int a1 = 0;
		int a2 = 0;
		while (len > 1) {
			if (arr1[a1] <= arr2[a2])
				a1++;
			else
				a2++;
			len--;
		}
		return Math.min(arr1[a1], arr2[a2]);
	}

	public int findMedianinTwoSortedAray(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int left = 0;
		int right = n;
		while (left < right) {
			int i = left + ((right - left) >> 1);
			int j = n - i;
			if (arr1[i] < arr2[j - 1]) {
				left = i + 1;
			} else {
				right = i;
			}
		}
		int bound1 = left;
		int bound2 = n - left;
		if (bound1 == n) {
			return arr1[n - 1];
		}
		if (bound2 == n) {
			return arr2[n - 1];
		}
		return Math.max(arr1[bound1 - 1], arr2[bound2 - 1]);
	}
}
