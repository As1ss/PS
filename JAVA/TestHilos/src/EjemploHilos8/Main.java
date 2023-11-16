package EjemploHilos8;

public class Main {

	public static void main(String[] args) {
		CuentaBancaria cb = new CuentaBancaria();
		CajeroAutomatico maria = new CajeroAutomatico(cb,"Maria",20);
		CajeroAutomatico pepe = new CajeroAutomatico(cb,"Pepe",20);
		
		Thread hilo = new Thread(maria);
		Thread hilo2 = new Thread(pepe);
		
		hilo.start();
		hilo2.start();
		
		
		try {
			hilo.join();
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Saldo final de la cuenta: "+cb.getSaldoActual());
		

	}

}
