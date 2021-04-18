package topic.binarytree;

import java.util.Stack;

import base.TreeNode;

public class LC114_二叉树展开为链表 {
	TreeNode last;

	public void flatten(TreeNode root) {
		if (root == null) {
			return;
		}
		flatten(root.right);
		flatten(root.left);
		root.right = last;
		root.left = null;
		last = root;
	}
	public void flatten2(TreeNode root) { 
	    if (root == null){
	        return;
	    }
	    Stack<TreeNode> s = new Stack<TreeNode>();
	    s.push(root);
	    TreeNode pre = null;
	    while (!s.isEmpty()) {
	        TreeNode temp = s.pop(); 
	        /***********修改的地方*************/
	        if(pre!=null){
	            pre.right = temp;
	            pre.left = null;
	        }
	        /********************************/
	        if (temp.right != null){
	            s.push(temp.right);
	        }
	        if (temp.left != null){
	            s.push(temp.left);
	        } 
	        /***********修改的地方*************/
	        pre = temp;
	        /********************************/
	    }
	}
}
