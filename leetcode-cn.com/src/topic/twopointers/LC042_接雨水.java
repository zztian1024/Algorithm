package topic.twopointers;

public class LC042_接雨水 {
	public int trap(int[] height) {
		// 左右最高 - 自生高度
		int left = 0, right = height.length - 1;
		int lmax = 0, rmax = 0, res = 0;
		while (left < right) {
			lmax = Math.max(lmax, height[left]);
			rmax = Math.max(rmax, height[right]);
			if (lmax < rmax) {
				res += (lmax - height[left++]);
			} else {
				res += (rmax - height[right--]);
			}
		}
		return res;
	}
}
