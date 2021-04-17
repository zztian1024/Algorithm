package topic.linkedlist;

import base.ListNode;

public class LC445_两数相加II {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode r1 = reverse(l1);
        ListNode r2 = reverse(l2);
        ListNode newHead = new ListNode(-1);
        ListNode prev = newHead;
        int upper = 0;
        while (r1 != null || r2 != null || upper > 0) {
            int v1 = r1 == null ? 0 : r1.val;
            int v2 = r2 == null ? 0 : r2.val;
            int sum = v1 + v2 + upper;
            upper = sum / 10;
            sum = sum % 10;
            prev.next = new ListNode(sum);

            prev = prev.next;
            r1 = r1 == null ? null : r1.next;
            r2 = r2 == null ? null : r2.next;
        }
        return reverse(newHead.next);
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
