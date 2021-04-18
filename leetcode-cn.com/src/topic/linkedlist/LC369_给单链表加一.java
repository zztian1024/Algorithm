package topic.linkedlist;

import base.ListNode;

public class LC369_给单链表加一 {
	public ListNode plusOne(ListNode head) {
		ListNode fast = head;
		ListNode slow = new ListNode(0);
		slow.next = head;
		while (fast != null) {
			if (fast.val != 9) {
				slow = fast;
			}
			fast = fast.next;
		}
		slow.val += 1;
		ListNode cur = slow.next;
		while (cur != null) {
			cur.val = 0;
			cur = cur.next;
		}
		return slow.next == head ? slow : head;
	}
}
