package topic.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC554_砖墙 {
	public int leastBricks(List<List<Integer>> wall) {

		Map<Integer, Integer> map = new HashMap<>();
		for (List<Integer> list : wall) {
			int total = 0;
			for (int i = 0; i < list.size() - 1; i++) {
				total += list.get(i);
				map.put(total, 1 + map.getOrDefault(total, 0));
			}
		}
		int cur = 0;
		for (int value : map.values()) {
			if (value > cur)
				cur = value;
		}
		return wall.size() - cur;
	}
}
