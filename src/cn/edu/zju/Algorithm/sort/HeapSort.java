package cn.edu.zju.Algorithm.sort;

public class HeapSort {
	public static void HeapSort(int[] a ) {
		int len = a.length;
		BuildMaxHeap(a, len);
		for (int i = len - 1; i > 0; i--) {
			swap(a, i, 0);
			AdjustDown (a, 0, i - 1);
		}
	}
	
	static void BuildMaxHeap(int[] A, int len) {
		for (int i = len / 2 - 1; i >= 0; i--) {
			AdjustDown (A, i, len);
		}
	}
	/**
	 * 
	 * @param a
	 * @param k
	 *            is the location
	 * @param len
	 *            a's size
	 */
	private static void AdjustDown (int[] a, int k, int len) {
		int temp = a[k];
		for (int i = 2 * k+1; i < len; i = 2*i+1) {
			if (i < len && a[i] < a[i + 1]) {
				i++;
			}
			if (temp <a[i]) {
				a[k] = a[i];
				k = i;
			} else {
				break;
			}
		}
		a[k] = temp;
	}

	

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}
