package topic.string;

import java.util.HashMap;
import java.util.Map;

public class LC387_字符串中的第一个唯一字符 {
	public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
