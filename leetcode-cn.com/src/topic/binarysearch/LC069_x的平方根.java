package topic.binarysearch;

public class LC069_x的平方根 {
	// 有多种解法，此处采用二分查找的方式
	public int mySqrt(int x) {
		if (x == 0) {
			return 0;
		}
		long left = 1, right = x, res = -1;
		while (left <= right) {
			// 此处可能溢出，因此使用 long, 或者使用 left +（right - left）/ 2
			// 通过对比，使用 >> 移位，时间会快不少，此时击败 100% 用户
			long mid = (right + left) >> 1;
			if ((long) mid * mid <= x) {
				res = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return (int) res;
	}
}
