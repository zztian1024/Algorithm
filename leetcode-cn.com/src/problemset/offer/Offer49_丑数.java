package problemset.offer;

public class Offer49_丑数 {
	
	// 任何丑数乘以2、3、5，其结果也是丑数
	public int nthUglyNumber(int n) {
		int x = 0, y = 0, z = 0;
		int[] dp = new int[n];
		dp[0] = 1;
		for (int i = 1; i < n; i++) {
			int n2 = dp[x] * 2, n3 = dp[y] * 3, n5 = dp[z] * 5;
			dp[i] = Math.min(Math.min(n2, n3), n5);
			if (dp[i] == n2)
				x++;
			if (dp[i] == n3)
				y++;
			if (dp[i] == n5)
				z++;
		}
		return dp[n - 1];
	}
}
