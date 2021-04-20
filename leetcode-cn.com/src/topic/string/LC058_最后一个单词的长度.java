package topic.string;

public class LC058_最后一个单词的长度 {
	public int lengthOfLastWord(String s) {

		// 倒序遍历字符串，遇到空格停止
		int len = s.length();
		int end = len - 1;
		int count = 0;
		while (end >= 0 && s.charAt(end) == ' ') {
			end--;
		}
		while (end >= 0 && !(s.charAt(end) == ' ')) {
			end--;
			count++;
		}
		return count;
	}

	public int lengthOfLastWord1(String s) {
		int end = s.length() - 1;
		while (end >= 0 && s.charAt(end) == ' ')
			end--;
		if (end < 0)
			return 0;
		int start = end;
		while (start >= 0 && s.charAt(start) != ' ')
			start--;
		return end - start;
	}
}
