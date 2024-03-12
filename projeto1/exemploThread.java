package projeto1;

public class exemploThread {
	public static void main(String[] agr) {
		System.out.println("Dentro da Main");
		ola ola=new ola("Safira");
		ola ola2=new ola("Ana");
		
		tchau tchau =new tchau("Safira");
		tchau tchau2 =new tchau("Ana");
		tchau tchau3 =new tchau("Safira");

		
		ola.start();
		ola2.start();

		tchau.start();
		tchau2.start();
		tchau3.start();

	}

}
