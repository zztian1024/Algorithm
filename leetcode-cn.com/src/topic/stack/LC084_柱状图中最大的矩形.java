package topic.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC084_柱状图中最大的矩形 {
	// 单调栈 & 哨兵位
	public int largestRectangleArea(int[] heights) {
		// 边界判断
		int len = heights.length;
		if (len == 0) {
			return 0;
		}
		if (len == 1) {
			return heights[0];
		}

		// 初始新数组，添加入首尾0，
		int res = 0;
		int[] newHeights = new int[len + 2];
		newHeights[0] = 0;
		System.arraycopy(heights, 0, newHeights, 1, len);
		newHeights[len + 1] = 0;
		len += 2;
		heights = newHeights;

		Deque<Integer> stack = new ArrayDeque<>(len);
		stack.addLast(0); // 放入哨兵位

		for (int i = 1; i < len; i++) { // 直接从1开始
			while (heights[i] < heights[stack.peekLast()]) {
				int curHeight = heights[stack.pollLast()];
				int curWidth = i - stack.peekLast() - 1;
				res = Math.max(res, curHeight * curWidth);
			}
			stack.addLast(i);
		}
		return res;
	}
}
