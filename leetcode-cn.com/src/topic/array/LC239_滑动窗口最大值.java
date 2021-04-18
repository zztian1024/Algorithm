package topic.array;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC239_滑动窗口最大值 {
	public int[] maxSlidingWindow(int[] nums, int k) {
	    if (nums == null || k <= 0) {
	        return new int[0];
	    }
	    int len = nums.length, index = 0;
	    int res[] = new int[len - k + 1];
	    Deque<Integer> dq = new ArrayDeque<>();
	    for (int i = 0; i < nums.length; i++) {
	        // 移除超界元素
	        while (!dq.isEmpty() && dq.peek() < i - k + 1) {
	            dq.poll();
	        }
	        // 清理前朝老臣中小于当前元素的
	        while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
	            dq.pollLast();
	        }
	        dq.offer(i);        // 入队
	        if (i >= k - 1) {   // 记录
	            res[index++] = nums[dq.peek()];
	        }
	    }
	    return res;
	}
}
