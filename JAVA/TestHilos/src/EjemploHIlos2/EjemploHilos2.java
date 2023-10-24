package EjemploHIlos2;

public class EjemploHilos2 {

	public static void main(String[] args) {
		
		


		new Hilo(1).run();
		new Hilo(2).run();
		new Hilo(3).run();
		
		
		System.out.println("TRES HILOS CREADOS");

	}
}
