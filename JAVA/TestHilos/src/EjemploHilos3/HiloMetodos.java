package EjemploHilos3;

public class HiloMetodos extends Thread{

	@Override
	public void run() {
		super.run();
		try {
			Thread.sleep(1000);
			System.out.println("Hilo ejecutándose: ..."+this.getName());
			System.out.println("Prioridad: "+this.getPriority());
			System.out.println("Id: "+this.getId());
			System.out.println();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
