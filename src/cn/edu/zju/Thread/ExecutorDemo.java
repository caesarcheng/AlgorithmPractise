package cn.edu.zju.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args) {
//		ExecutorService  executorService =  Executors.newFixedThreadPool(1);
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute( new  printChar("cjx",3));
		executorService.execute( new  printChar("yu",4));
		executorService .execute(new  printChar("a",5));
		executorService.shutdown();
	}
}
class printChar implements Runnable{
String str = null;
 int n = 0;
 static int  j =0;
public printChar(String st,int a) {
	this.str = st;
	this.n = a;
}
	@Override
	public  void run() {
		for(int i =0;i<n ;i++ ){
			if((j+1)%10==0)System.out.println(str+" ");
			else System.out.print(str+" ");
			 
		}
		
		System.out.println();
	}
	
}