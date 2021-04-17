package topic.string;

public class LC415_字符串相加 {
	public String addStrings(String num1, String num2) {
		// 1234567890
		StringBuilder res = new StringBuilder("");
		int c1 = num1.length() - 1, c2 = num2.length() - 1, carry = 0;
		while (c1 >= 0 || c2 >= 0) {
			int n1 = c1 >= 0 ? num1.charAt(c1) - '0' : 0;
			int n2 = c2 >= 0 ? num2.charAt(c2) - '0' : 0;
			int tmp = n1 + n2 + carry;
			carry = tmp / 10;
			res.append(tmp % 10);
			c1--;
			c2--;
		}
		if (carry == 1)
			res.append(1);
		return res.reverse().toString();
	}
}
