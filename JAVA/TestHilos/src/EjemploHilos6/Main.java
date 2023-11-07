package EjemploHilos6;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread hilonMusk = new Thread(new Rhilo());
		Thread hilon = new Thread(new Rhilo());
		
		
		hilonMusk.setName("HILON MUSK");
		hilon.setName("Hilon");
		
		hilonMusk.start();
		hilon.start();
		
		
		hilonMusk.join();
		hilon.join();
		
		

	}

}
