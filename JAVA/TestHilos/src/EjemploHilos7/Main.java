package EjemploHilos7;

public class Main {

	public static void main(String[] args) {
		Hilo hilo1 = new Hilo();
		hilo1.setName("hilo1");
		
		Hilo hilo2 = new Hilo();
		hilo2.setName("hilo2");
		
		Hilo hilo3 = new Hilo();
		hilo3.setName("hilo3");

		hilo2.setPriority(10);
		hilo3.setPriority(5);
		hilo1.setPriority(1);
		
		
		hilo1.start();
		hilo2.start();
		hilo3.start();

	}

}
