package cn.edu.zju.Algorithm.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {
	static int a[]= {5,6,7,1,4,9,2,8,3};
	static int a1[]={9,8,7,6,5,4,3,2,1};
	static int a3[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	@Test
	public void test() {
//		ShellSort.ShellSort(a );
		BinaryInsertSort.BinaryInsertSort(a);
		for(int i=0;i<a.length;i++)
				System.out.print (a[i]+" ");
	}

}
