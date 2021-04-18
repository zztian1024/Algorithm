package topic.stack;

import java.util.LinkedList;
import java.util.Queue;

public class LC225_用队列实现栈 {
	Queue<Integer> queue1;
	Queue<Integer> queue2;

	public LC225_用队列实现栈() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}

	public void push(int x) {
		queue2.offer(x);
		while (!queue1.isEmpty()) {
			queue2.offer(queue1.poll());
		}
		Queue<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
	}

	public int pop() {
		return queue1.poll();
	}

	public int top() {
		return queue1.peek();
	}

	public boolean empty() {
		return queue1.isEmpty();
	}
}

class LC225_用队列实现栈1 {
	Queue<Integer> queue;

	public LC225_用队列实现栈1() {
		queue = new LinkedList<Integer>();
	}

	public void push(int x) {
		int n = queue.size();
		queue.offer(x);
		for (int i = 0; i < n; i++) {
			queue.offer(queue.poll());
		}
	}

	public int pop() {
		return queue.poll();
	}

	public int top() {
		return queue.peek();
	}

	public boolean empty() {
		return queue.isEmpty();
	}
}
