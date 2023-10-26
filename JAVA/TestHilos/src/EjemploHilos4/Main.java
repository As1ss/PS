package EjemploHilos4;

public class Main {

	public static void main(String[] args) {
		
		Thilo hiloTrhead = new Thilo(1);
		Thread hiloConRunnable = new Thread(new Rhilo(2));
		
		hiloTrhead.start();
		
		hiloConRunnable.start();
		
		

	}

}
