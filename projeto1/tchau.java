package projeto1;

public class tchau extends Thread {
	private String nome;
	
	public tchau(String nome) {
		this.nome = nome;
	}
	public void run() {
		System.out.println("tchau, " + this.nome +"!");
	}

} 