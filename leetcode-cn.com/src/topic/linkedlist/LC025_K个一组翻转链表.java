package topic.linkedlist;

import base.ListNode;

public class LC025_K个一组翻转链表 {
	public ListNode reverseKGroup(ListNode head, int k) {
		if (head == null || k <= 1) {
			return head;
		}
		ListNode dummyNode = new ListNode(0);
		dummyNode.next = head;
		ListNode prev = dummyNode, end = dummyNode;

		while (prev.next != null && prev.next.next != null) {
			for (int i = 0; i < k; i++) {
				end = end.next;
				if (end == null) { // 不足 k步
					return dummyNode.next;
				}
			}
			ListNode start = prev.next;
			ListNode next = end.next;
			end.next = null;
			prev.next = reverse(start);
			start.next = next;
			prev = start;
			end = start;
		}
		return dummyNode.next;
	}
	
	ListNode reverse(ListNode head) {
		ListNode newHead = new ListNode(0);
		while (head != null) {
			ListNode temp = head.next;
			head.next = newHead;
			newHead = head;
			head = temp;
		}
		return newHead;
	}
}
