package EjemploHilos3;

public class Main {

	public static void main(String[] args) {
		HiloMetodos hilo = new HiloMetodos();
		hilo.setName("Hilo 1");
		
		HiloMetodos hilo2 = new HiloMetodos();
		hilo2.setName("Hilo 2");
		
		HiloMetodos hilo3 = new HiloMetodos();
		hilo3.setName("Hilo 3");
		
		
		hilo.start();
		hilo2.start();
		hilo3.start();

	}

}
