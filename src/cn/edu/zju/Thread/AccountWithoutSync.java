package cn.edu.zju.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync {
	private static Account account = new Account();

	public static void main(String[] args) {
//		ExecutorService executor = Executors.newCachedThreadPool();
		ExecutorService executor= Executors.newFixedThreadPool(100);
		for (int i = 0; i < 100; i++) {
			executor.execute(new AddPennyTask());
		}
		
		System.out.println();
		executor.shutdown();
	 
		while (!executor.isTerminated()) {
//			System.out.println("please wait ex/ector finished ");
		}
		System.out.println("what is balance ? " + account.getBalance());
	}

	private static class AddPennyTask implements Runnable {

		@Override
		public void run() {
			account.deposit(1);
		}
	}

	private static class Account {
		private int balance = 0;

		public int getBalance() {
			return balance;
		}

		public void deposit(int i) {
			int newBalance = balance + i;
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			balance = newBalance;
		}
	}
}