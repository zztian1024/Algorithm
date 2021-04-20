package problemset.offer;

public class Offer10_I斐波那契数列 {
	public int fib(int n) {// 第 n 项
		if (n < 2)
			return n;
		long first = 0, second = 1, sum = 0;
		for (int i = 0; i < n - 1; i++) {
			// 答案需要取模 1e9+7（1000000007），
			// 如计算初始结果为：1000000008，请返回 1
			sum = (first + second) % 1000000007;
			first = second;
			second = sum;
		}
		return (int) sum;
	}
}
