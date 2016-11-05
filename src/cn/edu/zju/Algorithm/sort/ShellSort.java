package cn.edu.zju.Algorithm.sort;

public class ShellSort {
	public static void ShellSort(int[] a){
		int len = a.length;
		for(int dk = len/2;dk>0;dk/=2){
			for(int i =dk;i<len;i++){
				if(a[i]<a[i-dk]){
					int temp = a[i],j=0;
					for(j = i-dk;j>=0&&a[j]>temp;j-=dk){
						a[j+dk]=a[j];
					}
					a[j+dk]=temp;
				}
			}
		}
	}

}
