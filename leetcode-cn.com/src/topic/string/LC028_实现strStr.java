package topic.string;

public class LC028_实现strStr {
	public int strStr(String haystack, String needle) {
		// if (needle.isEmpty() ) {
		// return 0;
		// }

		// int n = haystack.length(), m = needle.length();
		// for (int i = 0; i + m <= n; i++) {
		// boolean flag = true;
		// for (int j = 0; j < m; j++) {
		// if (haystack.charAt(i + j) != needle.charAt(j)) {
		// flag = false;
		// break;
		// }
		// }
		// if (flag) {
		// return i;
		// }
		// }
		// return -1;

		int h = haystack.length();
		int n = needle.length();
		if (n == 0)
			return 0;
		if (n > h)
			return -1;
		int i = 0, j = 0;
		for (; i < h; i++) {
			if (j < n && haystack.charAt(i) == needle.charAt(j)) {
				j++;
			} else {
				i -= j;
				j = 0;
			}
			if (j == n) {
				return i + 1 - n; // 先将 i 指针右移，再减去字符串 needle 的长度，即为起始位置
			}
		}
		return -1;

	}
}
