package topic.binarysearch;

public class LC167_两数之和II {
	// 有序数组，二分查找
	public int[] twoSum(int[] numbers, int target) {
		for (int i = 0; i < numbers.length - 1; i++) {
			int left = i + 1, right = numbers.length - 1;
			while (left <= right) {
				int mid = (left + right) >> 1;
				if (numbers[mid] == target - numbers[i]) {
					return new int[] { i + 1, mid + 1 };
				} else if (numbers[mid] < target - numbers[i]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return new int[] { -1, -1 };
	}
}
