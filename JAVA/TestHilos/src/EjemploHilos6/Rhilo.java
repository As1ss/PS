package EjemploHilos6;

import java.util.Random;

public class Rhilo implements Runnable {
	int numeroAleatorio;

	@Override
	public void run() {
		// Crea una instancia de la clase Random
		Random random = new Random();
		// Genera un número aleatorio entre 1 y 10 (ambos inclusive)
		int numeroAleatorio = random.nextInt(10) + 1;

		for (int i = 0; i < numeroAleatorio; i++) {
			if (numeroAleatorio != 2) {
				System.out.println(
						"Nombre: " + Thread.currentThread().getName() + " Número Aleatorio: " + numeroAleatorio);
			}
			else {
				System.out.println(Thread.currentThread().getName()+" ha sacado 2");
				break;
			}
		}
	
		System.out.println(Thread.currentThread().getName() + " Fin del hilo");

	}

}
