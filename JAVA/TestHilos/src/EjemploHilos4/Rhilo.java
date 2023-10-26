package EjemploHilos4;

public class Rhilo implements Runnable {

	int id;
	int contador;

	public Rhilo(int newID) {
		this.id = newID;
		
	}

	@Override
	public void run() {
		for (contador=0;contador<100;contador++) {
			try {
				Thread.sleep(1000);
				System.err.println("[R]Estamos en el hilo -->: "+this.id+","+"Contador: "+contador);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
