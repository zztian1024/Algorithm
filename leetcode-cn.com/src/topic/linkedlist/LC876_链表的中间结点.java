package topic.linkedlist;

import base.ListNode;

public class LC876_链表的中间结点 {
	// 快慢指针
	public ListNode middleNode1(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	// 遍历长度
	public ListNode middleNode(ListNode head) {
		int len = 0;
		ListNode newHead = head;
		while (newHead != null) {
			len++;
			newHead = newHead.next;
		}
		if (len == 1)
			return head;
		newHead = head;
		int k = len / 2 - 1;
		while (k-- >= 0) {
			newHead = newHead.next;
		}
		return newHead;
	}
}
