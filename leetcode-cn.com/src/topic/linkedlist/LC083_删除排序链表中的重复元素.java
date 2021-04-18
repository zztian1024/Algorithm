package topic.linkedlist;

import base.ListNode;

public class LC083_删除排序链表中的重复元素 {
	public ListNode deleteDuplicates(ListNode head) {
		// 头结点为空或只有一个节点
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = head;
		while (head.next != null) {
			if (head.val == head.next.val) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		return newHead;
	}
}
