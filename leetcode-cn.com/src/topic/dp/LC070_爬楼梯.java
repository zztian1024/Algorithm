package topic.dp;

public class LC070_爬楼梯 {
	public int climbStairs(int n) {
		int a = 0, b = 1, c = 0;
		for (int i = 1; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}
