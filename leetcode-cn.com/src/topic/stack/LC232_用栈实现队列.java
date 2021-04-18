package topic.stack;

import java.util.Stack;

public class LC232_用栈实现队列 {
	Stack<Integer> stack1;
	Stack<Integer> stack2;

	public LC232_用栈实现队列() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public void push(int x) {
		stack1.push(x);
	}

	public int pop() {
		transferIfNeeded();
		return stack2.pop();
	}

	public int peek() {
		transferIfNeeded();
		return stack2.peek();
	}

	public boolean empty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}

	void transferIfNeeded() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
	}
}
