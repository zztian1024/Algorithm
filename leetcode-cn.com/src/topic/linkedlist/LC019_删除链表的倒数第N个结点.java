package topic.linkedlist;

import base.ListNode;

public class LC019_删除链表的倒数第N个结点 {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode dummyNode = new ListNode(-1);
		dummyNode.next = head;
		ListNode fast = head;
		ListNode slow = dummyNode;

		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		ListNode temp = slow.next.next;
		slow.next = temp;
		return dummyNode.next;
	}
}
