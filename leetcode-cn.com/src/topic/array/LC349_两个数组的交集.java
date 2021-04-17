package topic.array;

import java.util.HashSet;
import java.util.Set;

public class LC349_两个数组的交集 {
	// 双集合法
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		// 去重
		for (int n : nums1) {
			set1.add(n);
		}
		for (int n : nums2) {
			if (set1.contains(n)) {
				set2.add(n);
			}
		}
		int res[] = new int[set2.size()];
		int i = 0;
		for (int n : set2) {
			res[i++] = n;
		}
		return res;
	}
}
