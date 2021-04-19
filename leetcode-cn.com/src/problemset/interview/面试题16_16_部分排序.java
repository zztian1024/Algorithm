package problemset.interview;

public class 面试题16_16_部分排序 {
	public int[] subSort(int[] array) {
		if (array.length == 0)
			return new int[] { -1, -1 };
		int max = array[0], r = -1;
		for (int i = 0; i < array.length; i++) {
			int v = array[i];
			if (v >= max) {
				max = v;
			} else {
				r = i;
			}
		}

		int min = array[array.length - 1], l = -1;
		for (int j = array.length - 1; j >= 0; j--) {
			int v = array[j];
			if (v <= min) {
				min = v;
			} else {
				l = j;
			}
		}
		return new int[] { l, r };
	}
}
