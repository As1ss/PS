package EjemploHIlos2;

public class Hilo extends Thread {
	int i;
	public Hilo(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		int contador = 0;

		System.out.println("CREACION DE HILO: " + i);

		while (contador <= 5) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("HILO " + i + " :CONTADOR: " + contador++);

		}

	}

}
