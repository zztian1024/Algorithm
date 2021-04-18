package topic.array;

import java.util.Arrays;

public class LC179_最大数 {
	public String largestNumber(int[] nums) {
		String[] strs = new String[nums.length];
		for (int i = 0; i < nums.length; i++)
			strs[i] = String.valueOf(nums[i]);
		Arrays.sort(strs, (y, x) -> (x + y).compareTo(y + x));
		StringBuilder res = new StringBuilder();
		for (String s : strs)
			res.append(s);
		if (strs[0].equals("0")) {
			return "0";
		}
		return res.toString();
	}
}
