package ProductorConsumidor;

public class Consumidor extends Thread {

	Cola cola;

	public Consumidor(Cola newCola) {
		this.cola = newCola;

	}

	@Override
	public void run() {
		for (int i = 0;i<10;i++) {
			System.out.println(cola.get());
		}
		
	}
}
