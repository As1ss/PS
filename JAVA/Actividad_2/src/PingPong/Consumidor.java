package PingPong;

public class Consumidor extends Thread{
	private Cola cola;
	private String cadena;

	public Consumidor(Cola c, String cadena) {
		this.cola=c;
		this.cadena=cadena;
	}
	
	@Override
	public void run() {
		String cadena="";
		for (int i = 0;i<10;i++) {
			cadena=cola.get();
			System.out.println(cadena);
		}
	}

}
