package topic.twopointers;

public class LC011_盛最多水的容器 {
	public int maxArea(int[] height) {

		int left = 0, right = height.length - 1, max = 0;

		while (left < right) {
			int area = (right - left) * Math.min(height[left], height[right]);
			max = Math.max(max, area);
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return max;
	}
}
