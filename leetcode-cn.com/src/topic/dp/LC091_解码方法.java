package topic.dp;

public class LC091_解码方法 {
	public int numDecodings(String s) {
		int n = s.length();
		if (n == 0)
			return 0;

		int[] dp = new int[n];
		if (s.charAt(0) == '0')
			return 0;
		dp[0] = 1;

		for (int i = 1; i < n; i++) {
			if (s.charAt(i) != '0')
				dp[i] = dp[i - 1];
			if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2' && s.charAt(i) < '7') {
				if (i == 1)
					dp[i] += 1;
				else
					dp[i] += dp[i - 2];
			}
		}

		return dp[n - 1];
	}

	public int numDecodings2(String s) {

		int n = s.length();
		s = " " + s;
		char[] cs = s.toCharArray();
		int[] f = new int[3];
		f[0] = 1;
		for (int i = 1; i <= n; i++) {
			f[i % 3] = 0;
			int a = cs[i] - '0', b = (cs[i - 1] - '0') * 10 + (cs[i] - '0');
			if (1 <= a && a <= 9)
				f[i % 3] = f[(i - 1) % 3];
			if (10 <= b && b <= 26)
				f[i % 3] += f[(i - 2) % 3];
		}
		return f[n % 3];
	}

	public int numDecodings1(String s) {
		int n = s.length();
		s = " " + s;
		char[] cs = s.toCharArray();
		int[] f = new int[n + 1];
		f[0] = 1;
		for (int i = 1; i <= n; i++) {
			// a : 代表「当前位置」单独形成 item
			// b : 代表「当前位置」与「前一位置」共同形成 item
			int a = cs[i] - '0', b = (cs[i - 1] - '0') * 10 + (cs[i] - '0');
			// 如果 a 属于有效值，那么 f[i] 可以由 f[i - 1] 转移过来
			if (1 <= a && a <= 9)
				f[i] = f[i - 1];
			// 如果 b 属于有效值，那么 f[i] 可以由 f[i - 2] 或者 f[i - 1] & f[i - 2] 转移过来
			if (10 <= b && b <= 26)
				f[i] += f[i - 2];
		}
		return f[n];

	}
}
