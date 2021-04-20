package problemset.offer;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Offer40_最小的k个数 {
	// 排序 O(logn)
	public int[] getLeastNumbers(int[] arr, int k) {
		int[] vec = new int[k];
		Arrays.sort(arr);
		for (int i = 0; i < k; ++i) {
			vec[i] = arr[i];
		}
		return vec;
	}
	
	// 小根堆
	public int[] getLeastNumbers1(int[] arr, int k) {
		if (k == 0 || arr.length == 0) {
			return new int[0];
		}
		// 默认是小根堆，实现大根堆需要重写一下比较器。
		Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
		for (int num : arr) {
			if (pq.size() < k) {
				pq.offer(num);
			} else if (num < pq.peek()) {
				pq.poll();
				pq.offer(num);
			}
		}
		// 返回堆中的元素
		int[] res = new int[pq.size()];
		int idx = 0;
		for (int num : pq) {
			res[idx++] = num;
		}
		return res;
	}
}
