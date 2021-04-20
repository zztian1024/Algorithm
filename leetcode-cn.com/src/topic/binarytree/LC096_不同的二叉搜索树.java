package topic.binarytree;

public class LC096_不同的二叉搜索树 {
	public int numTrees(int n) {
		int[] counts = new int[n + 2];
		counts[0] = 1;
		counts[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				counts[i] += counts[j] * counts[i - j - 1];
			}
		}
		return counts[n];
	}
}
