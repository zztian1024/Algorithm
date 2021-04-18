package topic.linkedlist;

import base.ListNode;

public class LC234_回文链表 {
	public boolean isPail(ListNode head) {
		// 反转部分链表，空间复杂度为O(1)
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		if (fast != null) {
			slow = slow.next;
		}

		ListNode tail = ReverseList(slow);
		while (head != null && tail != null) {
			if (head.val != tail.val) {
				return false;
			}
			head = head.next;
			tail = tail.next;
		}
		return true;
	}

	ListNode ReverseList(ListNode head) {
		ListNode newHead = null;

		while (head != null) {
			ListNode temp = head.next;
			head.next = newHead;
			newHead = head;
			head = temp;
		}
		return newHead;
	}
}
