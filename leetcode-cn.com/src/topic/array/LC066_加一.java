package topic.array;

public class LC066_加一 {
	public int[] plusOne(int[] digits) {
	    // 直接在当前数组上面修改
	    for (int i = digits.length - 1; i >= 0; i--) {
	        digits[i]++;
	        digits[i] %= 10;
	        if (digits[i] != 0) {
	            return digits; // 无需进位
	        }
	    }
	    // 到这里则说明需要进位+1了，
	    int res[] = new int[digits.length + 1]; // 100000
	    res[0] = 1;
	    return res;
	}
}
