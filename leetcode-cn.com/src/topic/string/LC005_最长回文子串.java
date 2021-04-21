package topic.string;

public class LC005_最长回文子串 {
	public String longestPalindrome(String s) {
		if (s == null || s.length() < 1) {
			return "";
		}
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int l1 = palindrome(s, i, i);
			int l2 = palindrome(s, i, i + 1);
			int len = Math.max(l1, l2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}

		return s.substring(start, end + 1);
	}

	// 中心向两边扩散，返回以s[l] s[r] 为中心的最长子串
	int palindrome(String s, int l, int r) {
		while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;
		}
		return r - l - 1;
	}
}
