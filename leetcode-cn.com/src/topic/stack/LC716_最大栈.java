package topic.stack;

import java.util.Stack;

public class LC716_最大栈 {
	Stack<Integer> stack;
	Stack<Integer> max;

	public LC716_最大栈() {
	        stack = new Stack<>();
	        max = new Stack<>();
	        max.push(Integer.MIN_VALUE);
	    }

	public void push(int x) {
		stack.push(x);
		max.push(Math.max(x, max.peek()));
	}

	public int pop() {
		max.pop();
		return stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int peekMax() {
		return max.peek();
	}

	public int popMax() {
		Stack<Integer> tmpStack = new Stack<>();
		while (!stack.peek().equals(max.peek())) {
			tmpStack.push(this.pop()); // 如果栈顶元素不同，则pop到缓存栈
		}
		int max = this.pop(); // 获得最大值
		while (!tmpStack.isEmpty()) {
			this.push(tmpStack.pop()); // 将缓存栈中元素压入
		}
		return max;
	}
}
