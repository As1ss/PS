package EjemploHilos7;

public class Hilo extends Thread {

	private int contador;
	private boolean stopHilo;

	public Hilo() {
		contador = 0;
		stopHilo = false;

	}

	@Override
	public void run() {
		super.run();
		while(!stopHilo) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.contador++;
			System.out.println(Thread.currentThread().getName()+ " Contador: "+contador +" Prioridad: "+Thread.currentThread().getPriority());
			
			if (contador==10) {
				pararHilo();
			}
		}
			
		
		
	}

	public void pararHilo() {
	
			this.stopHilo = true;
			System.out.println(Thread.currentThread().getName()+" parado.");
		
		

	}

	public int getContador() {

		return this.contador;
	}
}
