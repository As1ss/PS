package EjemploHilos4;

public class Rhilo implements Runnable {

	int id;
	int contador;
	int sleepTime;

	public Rhilo(int newID, int sleepTime) {
		this.id = newID;
		this.sleepTime = sleepTime;

	}

	@Override
	public void run() {
		for (contador = 0; contador < 100; contador++) {
			try {
				Thread.sleep(sleepTime);
				System.err.println("[R]Estamos en el hilo -->: " + this.id + "," + "Contador: " + contador+" Tiempo sleep: "+sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
