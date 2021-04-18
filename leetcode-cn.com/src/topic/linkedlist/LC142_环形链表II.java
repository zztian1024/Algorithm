package topic.linkedlist;

import base.ListNode;

public class LC142_环形链表II {
	public ListNode detectCycle(ListNode head) {
		// 快慢指针，简化一下
		ListNode fast = head, slow = head;
		while (true) {
			if (fast == null || fast.next == null)
				return null;
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
				break; // 一定要停止，否则不会退出
		}
		fast = head;
		while (fast != slow) {
			fast = fast.next;
			slow = slow.next;
		}
		return fast;
	}

	// 精简步骤
	public ListNode detectCycle1(ListNode head) {
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				fast = head;
				while (fast != slow) {
					fast = fast.next;
					slow = slow.next;
				}
				return fast;
			}
		}
		return null;
	}
}
