package Practica2;

public class CajeroAutomatico {

	public static void main(String[] args) {
		CuentaBancaria cb = new CuentaBancaria(200,300);
		Persona Joado = new Persona("Joado",cb);
		Persona Pablito = new Persona("Pablito",cb);
		Persona Pepe = new Persona("Pepe",cb);
		
		Joado.start();
		Pablito.start();
		Pepe.start();
		
	
		try {
			Joado.join();
			Pablito.join();
			Pepe.join();
		} catch (Exception e) {
		
		}

	}

}
