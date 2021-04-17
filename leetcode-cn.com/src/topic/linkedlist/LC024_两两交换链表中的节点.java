package topic.linkedlist;

import base.ListNode;

public class LC024_两两交换链表中的节点 {
	public ListNode swapPairs(ListNode head) {

		ListNode dummyNode = new ListNode(0);
		dummyNode.next = head;
		ListNode prev = dummyNode;

		while (prev.next != null && prev.next.next != null) {
			ListNode temp = head.next.next;
			prev.next = head.next;
			head.next.next = head;
			head.next = temp;
			prev = head;
			head = head.next;
		}
		return dummyNode.next;
	}
}
