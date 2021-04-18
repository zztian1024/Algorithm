package topic.array;

public class LC080_删除有序数组中的重复项II {
	public int removeDuplicates(int[] nums) {
		int i = 1; // i = k - 1;
		// 1.定义[0,index] 是修改后的满足要求的数组区间,
		// 这里已经把0 1 2 ...k- 1 ,共k个数 放进去了
		// 2.判断终止条件, int i = k
		for (int j = 2; j < nums.length; j++) {
			if (nums[i - 1] != nums[j]) {
				nums[++i] = nums[j];
				// 3.指针移动条件, if(nums[i] != nums[index-k+1]){
			}
		}

		return i + 1;
	}
}
