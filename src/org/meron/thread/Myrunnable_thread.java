package org.meron.thread;

public class Myrunnable_thread implements Runnable {
	static boolean  flag = true;
	
	@Override
	public void run() {
		System.out.println("hello from run");
	}

	public static void main(String[] args) throws InterruptedException {
		Myrunnable_thread myrun = new Myrunnable_thread();
		Thread t = new Thread(myrun);
		t.start();
		while(flag){
			flag = false;
			Thread.sleep(10);		
			System.out.println("x");
		}
	}

}
