package topic.string;

import java.util.ArrayList;
import java.util.List;

public class LC022_括号生成 {
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		_generate(0, 0, n, "", result);
		return result;
	}

	void _generate(int left, int right, int max, String str, List<String> result) {

		// 终止条件
		if (left == max && right == max) {
			// 处理结果
			result.add(str);
			return;
		}

		// 处理当前

		// 下转
		if (left < max) // 剪枝
			_generate(left + 1, right, max, str + "(", result);
		if (right < left) // 剪枝
			_generate(left, right + 1, max, str + ")", result);
		// 清理当前状态
	}
}
