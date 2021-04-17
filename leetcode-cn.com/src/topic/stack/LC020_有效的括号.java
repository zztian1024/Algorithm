package topic.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC020_有效的括号 {
	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();
		Map<Character, Character> map = new HashMap<>() {
			{
				put('}', '{');
				put(']', '[');
				put(')', '(');
			}
		};

		for (Character c : s.toCharArray()) {
			if (!stack.isEmpty() && map.containsKey(c)) {
				if (stack.peek() == map.get(c)) {
					stack.pop();
				} else {
					return false;
				}
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
}
