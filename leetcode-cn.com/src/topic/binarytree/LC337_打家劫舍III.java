package topic.binarytree;

import base.TreeNode;

public class LC337_打家劫舍III {
	// 第三种解法：状态标记递归
	public int rob(TreeNode root) {
		int[] res = robAction1(root);
		return Math.max(res[0], res[1]);
	}

	int[] robAction1(TreeNode root) {
		int res[] = new int[2];
		if (root == null)
			return res;

		int[] left = robAction1(root.left);
		int[] right = robAction1(root.right);

		res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
		res[1] = root.val + left[0] + right[0];
		return res;
	}
}

// 其他解法：
// 1.递归去偷，超时
// 2.递归去偷，记录状态
