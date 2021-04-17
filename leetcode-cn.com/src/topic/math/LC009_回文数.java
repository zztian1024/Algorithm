package topic.math;

import java.util.ArrayList;
import java.util.List;

public class LC009_回文数 {
	public boolean isPalindrome(int x) {
		if (x == 0) {
			return true;
		}
		// 小于0，或余数为0，直接返回false
		if (x < 0 || x % 10 == 0) {
			return false;
		}

		// 创建动态数组，保存每位数字
		List<Integer> arr = new ArrayList<Integer>();
		while (x > 0) {
			int v = x % 10; // 求每一位值
			arr.add(v); // 添加入数组
			x /= 10; // 向前走
		}
		int size = arr.size();
		for (int i = 0; i < size; i++) {
			if (arr.get(i) != arr.get(size - 1 - i)) {
				return false; // 不匹配，则直接返回
			}
		}

		return true;
	}
}
