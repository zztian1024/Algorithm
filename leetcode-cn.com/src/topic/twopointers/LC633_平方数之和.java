package topic.twopointers;

public class LC633_平方数之和 {
	// 双指针
	public boolean judgeSquareSum(int c) {
		int a = 0;
		int b = (int) Math.sqrt(c);
		while (a <= b) {
			int sum = a * a + b * b;
			if (sum == c) {
				return true;
			} else if (sum > c) {
				b--;
			} else {
				a++;
			}
		}
		return false;
	}
}
