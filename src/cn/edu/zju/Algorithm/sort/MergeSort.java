package cn.edu.zju.Algorithm.sort;

public class MergeSort {
	
	public static int[] MergeSort(int[] a, int left,int right ,int[] b) {
		if(left<right){
			int mid=(left+right)/2; 
			MergeSort(a, left, mid,b);
			MergeSort(a, mid+1, right,b);
			Merge (a, left,mid, right,b);
		}
		return a;
	}
	public static void Merge(int[] a, int left, int mid, int right,int[] b) {
	int j=0,k=0,i=0; 
		for(  i =left ;i<=right;i++){
			b[i]=a[i];
		}
		for(i=j=left,k=mid+1;j<=mid&&k<=right; ){
			if(b[j]>b[k]){
				a[i++]=b[k++];
			}else{
				a[i++]=b[j++];
			}
		}
		while(j<=mid){
			a[i++]=b[j++];
		}
		while(k<=right){
			a[i++]=b[k++];
		}
	}
}
