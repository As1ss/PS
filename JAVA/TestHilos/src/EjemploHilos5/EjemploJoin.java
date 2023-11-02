package EjemploHilos5;

public class EjemploJoin {

	public static void main(String[] args)  {
		/*
		 * 
		 * Crearemos un hilo que extienda de Thread donde se le pasará como parámetros
		 * el nombre y un número (límite del contador).
		 */
		Hilito hilo1 = new Hilito("Mi hilito", 20);
		Hilito hilo2 = new Hilito("Mi hilito 2", 20);
		Hilito hilo3 = new Hilito("Mi hilito 3", 20);

		/*
		 * El hilo sacará por pantalla tantas veces como el límite del contador, un
		 * mensaje con su nombre y el contador.
		 */

		hilo1.start();
		hilo2.start();
		hilo3.start();
		System.out.println("HIlos principales han finalizado");

		/*
		 * Por otro lado, tendremos el programa principal que hace uso de este hilo
		 * HiloJoin, el cual creará tres objetos de HiloJoin pasando como parámetros el
		 * nombre del hilo y el límite del contador.
		 */

		try {
			System.out.println("HILOS JOIN HAN EMPEZADO");
			hilo1.join();
			System.out.println("HILO 1 JOIN HA FINALIZADO");
			hilo2.join();
			System.out.println("HILO 2 JOIN HA FINALIZADO");
			hilo3.join();
			System.out.println("HILO 3 JOIN HA FINALIZADO");
			
			System.out.println("Hilos han finalizado");
		} catch (Exception e) {
			System.out.println("Error haber ocurrido");
		}
		

		/*
		 * Se inicializarán y posteriormente se utilizará el método join aplicado a cada
		 * hilo creado. Después de esto imprimirá por pantalla el
		 * mensaje "Final del programa".
		 * 
		 */

	}

}
