package topic.array;

import java.util.ArrayList;
import java.util.List;

public class LC229_求众数II {
//	哈希表解法，直接定义一个哈希表。遍历所有元素，统计其频率。
//	摩尔投票法，O(N)时间，O(1)空间。本质上是利用两个变量cm, cn记录频率最高的两个元素m, n的频率，遇到m,n自增对应的频率
//	如果存在大于 1/3 的元素，则最多出现2个这样的数，同样用摩尔投票法

	public List<Integer> majorityElement(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		if (nums == null || nums.length == 0)
			return res;
		int n1 = nums[0], n2 = nums[0];
		int c1 = 0, c2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (n1 == nums[i]) {
				c1++;
			} else if (n2 == nums[i]) {
				c2++;
			} else if (c1 == 0) {
				c1 = 1;
				n1 = nums[i];
			} else if (c2 == 0) {
				c2 = 1;
				n2 = nums[i];
			} else {
				c1--;
				c2--;
			}
		}
		c1 = 0;
		c2 = 0;
		for (int n : nums) {
			if (n == n1) {
				c1++;
			} else if (n == n2) {
				c2++;
			}
		}
		if (c1 > nums.length / 3) {
			res.add(n1);
		}
		if (c2 > nums.length / 3) {
			res.add(n2);
		}
		return res;
	}

}
