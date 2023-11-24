package Practica2;

public class Persona extends Thread {
	private String nombre;
	private CuentaBancaria cb;
	private int contIngresos;
	private int contRetiros;
	private int contFallos;

	public Persona(String nombre, CuentaBancaria cb) {
		this.nombre = nombre;
		this.cb = cb;
		this.setName(nombre);
		contIngresos = 0;
		contRetiros = 0;
		contFallos = 0;

	}

	@Override
	public void run() {

		while (!isInterrupted()) { //
			int aleatorio = (int) (Math.random() * 500 + 1); // Generamos ingreso o retiro aleatorio
			if (cb.ingresoDinero(aleatorio)) { // Si se cumple el ingreso sumamos 1 al contador de ingresos
				contIngresos++;
			} else {
				contFallos++; // Si no sumamos 1 al contador de fallos
				synchronized (this) { // Sincronizamos el bloque para poder utilizar el método wait()
					try {
						System.err.println("El usuario " + nombre + " ha fallado en la operación"
								+ "de ingreso. Intentos restantes: " + contFallos + "/3");
						wait(5000); // si no se puede realizar la operación hacemos esperar al hilo 5 segundos
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(3000); // Tiempo en milisegundos para alternar entre las operaciones de ingreso o
									// retiro
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			// Misma metodología para los retiros
			if (cb.retiroDinero(aleatorio)) {
				contRetiros++;
			} else {
				contFallos++;
				synchronized (this) {
					try {
						System.err.println("El usuario " + nombre + " ha fallado en la operación"
								+ "de ingreso. Intentos restantes: " + contFallos + "/3");
						wait(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if (contIngresos == 2 && contRetiros == 2) { // Si llega el contador de ingresos a 2 y retiros a 2 se
															// interrumpe el hilo
				interrupt();
			} else if (contFallos >= 3) { // si llega el contador de fallos a 2 , se interrumpe el hilo
				System.err.println("El usuario " + nombre + " ha superado el límite de intentos de operaciónes. "
						+ "Intentélo de nuevo mas tarde.");
				interrupt();
			}
		}
	}

}
