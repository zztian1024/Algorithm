package topic.linkedlist;

import java.util.HashSet;

import base.ListNode;

public class LC160_相交链表 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		ListNode l1 = headA, l2 = headB;
		while (l1 != l2) {
			l1 = l1 == null ? headB : l1.next;
			l2 = l2 == null ? headA : l2.next;
		}
		return l1;
	}

	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		HashSet<ListNode> set = new HashSet<>();
		ListNode l1 = headA, l2 = headB;
		while (l1 != null) {
			set.add(l1);
			l1 = l1.next;
		}
		while (l2 != null) {
			if (set.contains(l2)) {
				return l2;
			} else {
				l2 = l2.next;
			}
		}
		return null;
	}
}
