package cn.edu.zju.Algorithm.sort;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class A extends B  {

	public final static int a =0;
	
	public A() {
		System.out.println("A");
	}
	public int d(int i , int j){
		if(i==0) return 0;
		if(j==0) return 0;
		if(i==1&&j==1) return 1;
		return d(i-1,j)+d(i,j-1);
	}
	public static void main(String[] args) {
		
			A a =new A();
			
		System.out.println(a.d(7, 4));
		System.out.println(a.d(2, 4));
		
	}
}
class B extends C{
	public B() {
		// TODO Auto-generated constructor stub
	}
}

class C  {
	public C(){
		System.out.println("C");
	}
}