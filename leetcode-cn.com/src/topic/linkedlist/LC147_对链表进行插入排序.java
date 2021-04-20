package topic.linkedlist;

import base.ListNode;

public class LC147_对链表进行插入排序 {
	public ListNode insertionSortList(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode lastSorted = head, curr = head.next;

		while (curr != null) {

			if (lastSorted.val <= curr.val) {
				lastSorted = lastSorted.next;
			} else {
				ListNode prev = newHead;
				// 不为空，则遍历到合适的位置插入
				while (prev.next.val <= curr.val) {
					prev = prev.next;
				}
				lastSorted.next = curr.next;
				curr.next = prev.next;
				prev.next = curr;
			}
			curr = lastSorted.next;
		}
		return newHead.next;
	}
}
