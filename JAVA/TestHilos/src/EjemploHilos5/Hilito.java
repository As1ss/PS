package EjemploHilos5;

public class Hilito extends Thread {
	String nombre;
	int contador;

	public Hilito(String nombre, int contador) {
		this.nombre = nombre;
		this.contador = contador;
	}

	@Override
	public void run() {
		for (int i = 0; i < contador; i++) {

			System.out.println("Nombre: " + nombre + 
					" Contador: " + i);
		}
		System.out.println("Hilo "+Thread.currentThread().getName()+" finalizado");
	}
	
}
