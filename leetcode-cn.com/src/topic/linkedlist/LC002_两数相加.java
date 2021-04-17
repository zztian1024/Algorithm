package topic.linkedlist;

import base.ListNode;

public class LC002_两数相加 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode newHead = new ListNode(0);
		ListNode prev = newHead;
		int up = 0;
		while (l1 != null || l2 != null || up > 0) {
			int v1 = l1 == null ? 0 : l1.val;
			int v2 = l2 == null ? 0 : l2.val;
			int val = v1 + v2 + up;
			up = val / 10;
			val %= 10;
			prev.next = new ListNode(val);
			l1 = l1 == null ? null : l1.next;
			l2 = l2 == null ? null : l2.next;
			prev = prev.next;
		}
		return newHead.next;
	}
}
