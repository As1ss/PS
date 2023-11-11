package PingPong;

public class Consumidor extends Thread {
	private Cola cola;
	private String cadena;

	public Consumidor(Cola c) {
		this.cola = c;
		cadena = "";

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			this.cadena = cola.get();
			System.out.println(cadena);

		}

	}
}
