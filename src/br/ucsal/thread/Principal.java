package br.ucsal.thread;

public class Principal {

	public static void main(String[] args) {
		
		Runnable a = new RunnableQ1("hello", 1000);
		Runnable b = new RunnableQ1("world", 500);
		Runnable c = new RunnableQ1("doidao", 2000);
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
