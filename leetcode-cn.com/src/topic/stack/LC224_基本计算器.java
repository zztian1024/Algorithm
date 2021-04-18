package topic.stack;

import java.util.Stack;

public class LC224_基本计算器 {
	public int calculate(String s) {
	    Stack<Integer> stack = new Stack<>();
	    int res = 0, sign = 1, len = s.length();

	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (Character.isDigit(c)) {
	            int sum = s.charAt(i) - '0';
	            while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
	                sum = sum * 10 + s.charAt(i + 1) - '0';
	                i++;
	            }
	            res += sum * sign; // imp
	        } else if (c == '+') {
	            sign = 1;
	        } else if (c == '-') {
	            sign = -1;
	        } else if (c == '(') {
	            stack.push(res);
	            stack.push(sign);
	            res = 0;
	            sign = 1;
	        } else if (c == ')') {
	            res = res * stack.pop() + stack.pop();
	        }
	    }
	    return res;
	}
}
