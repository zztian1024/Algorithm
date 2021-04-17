package topic.array;

import java.util.HashMap;
import java.util.Map;

public class LC001_两数之和 {
	public int[] twoSum(int[] nums, int target) {
        // 哈希表
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            if (map.containsKey(v)) {
                return new int[]{map.get(v), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
