package EjemploHilos4;

public class Thilo extends Thread {
	int id;
	int contador;
	int sleepTime;

	public Thilo(int newId,int sleepTime) {
		this.id = newId;
		this.sleepTime =sleepTime;
	}

	@Override
	public void run() {
		for (contador = 0; contador < 100; contador++) {
			try {
				Thread.sleep(sleepTime);
				System.out.println("[T]Estamos en el hilo -->: " + this.id + "," + "Contador: " + contador+" Tiempo sleep: "+sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
