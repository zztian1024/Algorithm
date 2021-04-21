package topic.map;

public class LC242_有效的字母异位词 {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] table = new int[26];
		for (int i = 0; i < s.length(); i++) {
			table[s.charAt(i) - 'a']++;
			table[t.charAt(i) - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (table[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
