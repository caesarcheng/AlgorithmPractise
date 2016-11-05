package cn.edu.zju.Algorithm.sort;
/**
 * 
 * @author Administrator
 *
 */
public class BinaryInsertSort {
	public static  void BinaryInsertSort(int[] a) {
		for(int i =1 ;i<a.length;i++){
			int t = a[i] ,low = 0,high= i-1,mid=0;
			 while(low<=high){
				 mid=(low+high)/2;
				 if(a[i]<a[mid]) high=mid-1;
				 if(a[i]>a[mid]) low = mid+1;
			 }
			 for (int k = i -1 ; k > high ; k--) {
				a[k+1] =a[k];
			}
			 a[high +1] = t;
		}
		
	}

}
