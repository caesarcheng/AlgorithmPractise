package cn.edu.zju.Algorithm.sort;


public class QuickSort {
	static void  QuickSort(int[] elem,int left, int right){
		if(left<right){
			int q=Partition(elem,left,right);
			QuickSort(elem,left,q-1);
			QuickSort(elem,q+1,right);
		}
	}

	private static int Partition(int[] elem, int left, int right) {
		int pivot=elem[left];
		while(left<right){
			while(left<right&&pivot<elem[right]){
				right--;
			}
			elem[left]= elem[right];
			while(left<right&&pivot>elem[left]){
				left++;
			}
			elem[right]=elem[left];
		}
		elem[left]=pivot;
		return left;
	}

}
