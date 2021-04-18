package topic.binarysearch;

public class LC540_有序数组中的单一元素 {
	public int singleNonDuplicate(int[] nums) {
	    int left = 0, right = nums.length - 1;
	    while (left < right) {
	        // Index: 0 1 2 3 4 5 6
	        // Array: 1 1 3 3 4 8 8
	        //            ^
	        int mid = (left + right) >> 1;
	        if (mid % 2 == 1) mid--; // 向前走一步
	        // Example: |0 1 1 3 3 6 6|
	        //               ^ ^
	        // Next:    |0 1 1|3 3 6 6
	        if (nums[mid] != nums[mid + 1])  right = mid;
	        // Example: |1 1 3 3 5 6 6|
	        //               ^ ^
	        // Next:     1 1 3 3|5 6 6|
	        else left = mid + 2;
	    }
	    // 'start' should always be at the beginning of a pair.
	    // When 'start > end', start must be the single element.
	    return nums[left];
	}
}