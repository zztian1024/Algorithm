package topic.linkedlist;

import base.ListNode;

public class LC021_合并两个有序链表 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// 创建虚拟头结点
		ListNode newHead = new ListNode(0);
		ListNode prev = newHead;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				prev.next = l1;
				l1 = l1.next;
			} else {
				prev.next = l2;
				l2 = l2.next;
			}
			prev = prev.next;
		}
		// 拼接剩余的链表
		prev.next = l1 == null ? l2 : l1;

		return newHead.next;
	}
}
