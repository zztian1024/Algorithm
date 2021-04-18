package topic.linkedlist;

import base.ListNode;

public class LC061_旋转链表 {
	// 遍历链表，获取length，及尾结点
	// 将其构造成循环链表，计算出旋转变动次数
	// 旋转链表，构造环，移动k 步，
	// 然后再断开,将其改成单链表
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null || k == 0) {
			return head;
		}
		ListNode last = null;
		ListNode first = head;
		int len = 1;
		while (head.next != null) {
			head = head.next;
			len++;
		}
		last = head;
		head.next = first;
		int step = len - (k % len); // 注意这个地方的步数计算，右移
		while (step > 0) {
			first = first.next;
			last = last.next;
			step--;
		}
		last.next = null;
		return first;
	}
}
