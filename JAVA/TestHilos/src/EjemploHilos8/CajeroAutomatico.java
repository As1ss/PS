package EjemploHilos8;

public class CajeroAutomatico implements Runnable {
	CuentaBancaria cb;
	String nombre;
	int cantidad;

	public CajeroAutomatico(CuentaBancaria cb, String nombre, int cantidad) {

		this.cb = cb;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	@Override
	public void run() {
		
		for (int i=0;i<5;i++) {
			cb.retirarDinero(cantidad);
			System.err.println("Persona: "+this.nombre+ " está intentando retirar dinero.");
		}
		

		
	}
}
