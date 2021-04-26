package topic.binarysearch;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days/
 * 
 * @author july
 *
 */
public class LC1011_在D天内送达包裹的能力 {

	// 二分查找
	// 左侧：包裹的最大值
	// 右侧：包裹的和值
	public int shipWithinDays(int[] weights, int D) {

		int left = Arrays.stream(weights).max().getAsInt();
		int right = Arrays.stream(weights).sum();
		while (left < right) {
			int mid = (left + right) >> 1;
			int need = 1, current = 0;
			for (int w : weights) {
				if (w + current > mid) {
					need++;
					current = 0;
				}
				current += w;
			}
			if (need <= D)
				right = mid;
			else
				left = mid + 1;
		}
		return left;
	}
}
