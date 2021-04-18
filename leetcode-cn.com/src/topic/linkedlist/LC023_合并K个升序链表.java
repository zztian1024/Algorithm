package topic.linkedlist;

import java.util.ArrayList;

import base.ListNode;

public class LC023_合并K个升序链表 {
	// LeetCode 实现-分而治之，两两合并对，时间复杂度：O(NlogK)
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0)
			return null;
		int k = lists.length;
		while (k > 1) {
			int index = 0;
			for (int i = 0; i < k; i += 2) {
				if (i == k - 1) {
					lists[index++] = lists[i];
				} else {
					lists[index++] = merge2Lists(lists[i], lists[i + 1]);
				}
			}
			k = index;
		}
		return lists[0];
	}

	// 牛客实现，时间复杂度：O(NK)
	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		ListNode res = null;
		for (ListNode list : lists) {
			res = merge2Lists(res, list);
		}
		return res;
	}

	private ListNode merge2Lists(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode tail = dummyHead;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}
			tail = tail.next;
		}
		tail.next = l1 == null ? l2 : l1;

		return dummyHead.next;
	}
}
