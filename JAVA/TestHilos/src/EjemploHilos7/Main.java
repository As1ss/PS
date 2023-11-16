package EjemploHilos7;

public class Main {

	public static void main(String[] args) {
		Hilo hilo1 = new Hilo();
		hilo1.setName("hilo1");
		
		Hilo hilo2 = new Hilo();
		hilo2.setName("hilo2");
		
		Hilo hilo3 = new Hilo();
		hilo3.setName("hilo3");

		hilo1.setPriority(Thread.MIN_PRIORITY);
		hilo2.setPriority(Thread.MAX_PRIORITY);
		hilo3.setPriority(Thread.NORM_PRIORITY);
	
		
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		hilo1.pararHilo();
		hilo2.pararHilo();
		hilo3.pararHilo();
		
		System.out.println("Hilo 2 (Prioridad Máxima) : "+hilo2.getContador());
		System.out.println("Hilo 3 (Prioridad Normal) : "+hilo3.getContador());
		System.out.println("Hilo 1 (Prioridad Mínima) : "+hilo1.getContador());

	}

}
