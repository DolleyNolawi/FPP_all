package org.meron.thread;

class Test {

	synchronized static void printable(int n) {
		for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		       Thread.sleep(400);  
		     }catch(Exception e){}  
		   } 
	}
}

class Mythreadone extends Thread{
	public void run(){  
		Test.printable(1);  
		} 
}
class Mythreadtwo extends Thread{
	public void run(){  
		Test.printable(10);  
		} 
}
class Mythreadthree extends Thread{
	public void run(){  
		Test.printable(100);  
		} 
}

public class Thread_Static_methods{
	public static void main(String t[]){  
		Mythreadone t1=new Mythreadone();  
		Mythreadtwo t2 = new Mythreadtwo();
		Mythreadthree t3 = new Mythreadthree();
		t1.start();
		t2.start();
		t3.start();
	}
}