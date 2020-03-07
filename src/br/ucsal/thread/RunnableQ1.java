package br.ucsal.thread;

public class RunnableQ1 implements Runnable{
	
	String nome;
	long invervalo;
	
	public RunnableQ1(String nome, long intervalo){
		this.nome = nome;
		this.invervalo = intervalo;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(invervalo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(nome);
		}
	}

	
}
