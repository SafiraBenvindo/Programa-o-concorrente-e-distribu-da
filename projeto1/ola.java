package projeto1;

public class ola extends Thread {
	private String nome;
	
	public ola(String nome) {
		this.nome = nome;
	}
	public void run() {
		System.out.println("Olá, " +this.nome+"!");
	}

}
