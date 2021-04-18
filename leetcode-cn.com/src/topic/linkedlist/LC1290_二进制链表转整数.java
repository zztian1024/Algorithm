package topic.linkedlist;

import base.ListNode;

public class LC1290_二进制链表转整数 {
	public int getDecimalValue(ListNode head) {
		if (head.next == null)
			return head.val;
		int res = 0;
		while (head != null) {

			res <<= 1;
			res += head.val;
			head = head.next;
		}
		return res;
	}
}
