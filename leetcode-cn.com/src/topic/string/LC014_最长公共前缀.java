package topic.string;

public class LC014_最长公共前缀 {
	// 方法1：笨方法，遍历前缀，横向查找
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) {
            return "";
        }
        String first = strs[0];
        // StringBuffer result = new StringBuffer();
        outer: for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                String curr = strs[j];
                // 如果当前字符串长度比较短
                // 或者字符不相同，则终止遍历
                if (curr.length() <= i || ch != curr.charAt(i)) {
                    return first.substring(0, i);
                    // break outer;
                }
                // if (j == len - 1) {
                //     result.append(ch);
                // }
            }
        }
        // return result.toString();
        return first;
    }
}
