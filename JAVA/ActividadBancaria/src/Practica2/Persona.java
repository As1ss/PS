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

		while (!isInterrupted()) {
			int aleatorio = (int) (Math.random() * 500 + 1);
			if (cb.ingresoDinero(aleatorio)) {
				contIngresos++;
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
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
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
			if (contIngresos == 2 && contRetiros == 2) {
				interrupt();
			} else if (contFallos > 2) {
				System.err.println("El usuario " + nombre + " ha superado el límite de intentos de operaciónes. "
						+ "Intentélo de nuevo mas tarde.");
				interrupt();
			}
		}
	}

}
