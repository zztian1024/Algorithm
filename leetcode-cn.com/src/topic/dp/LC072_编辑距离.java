package topic.dp;

public class LC072_编辑距离 {
	public int minDistance1(String word1, String word2) {
		int n = word1.length();
		int m = word2.length();

		// 有一个字符串为空串
		if (n * m == 0) {
			return n + m;
		}

		// DP 数组
		int[][] D = new int[n + 1][m + 1];

		// 边界状态初始化
		for (int i = 0; i < n + 1; i++) {
			D[i][0] = i;
		}
		for (int j = 0; j < m + 1; j++) {
			D[0][j] = j;
		}

		// 计算所有 DP 值
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				int left = D[i - 1][j] + 1;
				int down = D[i][j - 1] + 1;
				int left_down = D[i - 1][j - 1];
				if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
					left_down += 1;
				}
				D[i][j] = Math.min(left, Math.min(down, left_down));
			}
		}
		return D[n][m];
	}

	public int minDistance(String word1, String word2) {
		int n1 = word1.length();
		int n2 = word2.length();
		int[][] dp = new int[n1 + 1][n2 + 1];
		// 第一行
		for (int j = 1; j <= n2; j++)
			dp[0][j] = dp[0][j - 1] + 1;
		// 第一列
		for (int i = 1; i <= n1; i++)
			dp[i][0] = dp[i - 1][0] + 1;
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n2; j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1];
				else
					dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
			}
		}
		return dp[n1][n2];
	}
}
