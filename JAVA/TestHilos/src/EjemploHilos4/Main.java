package EjemploHilos4;

public class Main {

	public static void main(String[] args) {
		
		Thilo hiloTrhead = new Thilo(1,2000);
		Thread hiloConRunnable = new Thread(new Rhilo(2,1000));
		
		hiloTrhead.start();
		hiloConRunnable.start();
		
		

	}

}
