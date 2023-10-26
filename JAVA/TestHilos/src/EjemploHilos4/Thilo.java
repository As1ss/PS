package EjemploHilos4;

public class Thilo extends Thread {
	int id;
	int contador;

	public Thilo(int newId) {
		this.id = newId;

	}

	@Override
	public void run() {
		for (contador = 0; contador < 100; contador++) {
			try {
				Thread.sleep(1000);
				System.out.println("[T]Estamos en el hilo -->: " + this.id + "," + "Contador: " + contador);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
