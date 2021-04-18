package topic.stack;

import java.util.Stack;

public class LC155_最小栈 {
	class MinStack {
	    private Stack<Integer> min;
	    private Stack<Integer> stack;

	    public MinStack() {
	        min = new Stack<>();
	        stack = new Stack<>();
	        min.push(Integer.MAX_VALUE); // 插入元素，防止 peek 失败
	    }
	    
	    public void push(int val) {
	        stack.push(val);
	        min.push(Math.min(val, min.peek()));
	    }
	    
	    public void pop() {
	        stack.pop();
	        min.pop();
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int getMin() {
	        return min.peek();
	    }
	}
}
