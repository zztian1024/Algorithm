package topic.linkedlist;

import base.ListNode;

public class LC143_重排链表 {
	// 一头一尾取元素
	public void reorderList(ListNode head) {
		if (head == null || head.next == null) {
			return;
		}
		// 找中点
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode newHead = slow.next;
		slow.next = null;
		newHead = reverse(newHead);// 第二个链表倒置

		while (newHead != null) {// 链表节点依次连接
			ListNode temp = newHead.next;
			newHead.next = head.next;
			head.next = newHead;
			head = newHead.next;
			newHead = temp;
		}
	}

	ListNode reverse(ListNode head) {
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
