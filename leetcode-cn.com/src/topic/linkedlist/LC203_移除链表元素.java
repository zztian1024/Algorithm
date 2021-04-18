package topic.linkedlist;

import base.ListNode;

public class LC203_移除链表元素 {
	public ListNode removeElements(ListNode head, int val) {
		ListNode sentinel = new ListNode(0);
		sentinel.next = head;

		ListNode prev = sentinel, curr = head;
		while (curr != null) {
			if (curr.val == val)
				prev.next = curr.next;
			else
				prev = curr;
			curr = curr.next;
		}
		return sentinel.next;
	}
}