package topic.backtracking;

import java.util.LinkedList;
import java.util.List;

public class LC046_全排列 {
	// 记录结果
    private List<List<Integer>> res = new LinkedList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList();
        backtrack(nums, track);
        return res;
    }

    void backtrack(int[] nums, LinkedList<Integer> track) {
        // 退出条件
        if (nums.length == track.size()) {
            res.add(new LinkedList(track));
            return;
        }
        // 遍历
        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;           // 过滤
            }
            track.add(nums[i]);     // 做选择
            backtrack(nums, track); // 递归
            track.pollLast();       // 撤销
        }
    }
}
