package PingPong;

public class Productor extends Thread {
	private Cola cola;
	private String cadenaSgte = " PING ";

	public Productor(Cola c, String cadena) {
		cola = c;
		this.cadenaSgte = cadena;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			cola.put(cadenaSgte);
			if (cadenaSgte == " PING ") {
				cadenaSgte = " PONG ";
			}
			else {
				cadenaSgte = " PING ";
			}
			try {
				sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
