package ProductorConsumidor;

public class Productor extends Thread {

	Cola cola;
	String mensaje;

	public Productor(Cola newCola, String newMensaje) {
		this.cola = newCola;
		this.mensaje = newMensaje;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(mensaje=="PING") {
				mensaje="PONG";
			}
			else {
				mensaje="PING";
			}
			cola.put(mensaje);
		}
	}
}
