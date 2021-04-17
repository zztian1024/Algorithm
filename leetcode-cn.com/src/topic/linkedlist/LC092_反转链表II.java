package topic.linkedlist;

import base.ListNode;

public class LC092_反转链表II {
	public ListNode reverseBetween(ListNode head, int left, int right) {

		ListNode dummyNode = new ListNode(0);
		dummyNode.next = head;
		ListNode prev = dummyNode;
		ListNode end = prev.next;
		// 向前走到要反转的前一个节点，prev 此时就指向它
		for (int i = 0; i < left - 1; i++) {
			prev = prev.next;
			end = end.next;
		}
		// 开始头插法反转
		for (int i = 0; i < right - left; i++) {
			ListNode next = end.next; 	// 1.缓存右侧指针的下一个节点
			end.next = end.next.next; 	// 2.将右侧指针的next 指向它next的next
			next.next = prev.next; 		// 3.将步骤1中缓存的节点 next 指向 prev.next 即要反转的节点
			prev.next = next; 			// 4.将右侧节点插入到前指针的后面
		}

		return dummyNode.next;
	}
}
