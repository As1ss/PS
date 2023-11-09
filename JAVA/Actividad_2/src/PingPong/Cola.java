package PingPong;

public class Cola {
	private String cadena;
	private boolean disponible = false; //Inicialmente la colta está vacía
	
	
	public synchronized String get() {
		while(disponible==false) {
			try {
				wait();
				
			}catch (InterruptedException e) {
				
			}
			
			
		}
		disponible=false;
		notifyAll();
		return cadena;
		
		
	}
	public synchronized void put(String valor) {
		while (disponible==true) {
			try {
				wait();
			} catch (Exception e) {
				
			}
		}
		cadena = valor;
		disponible = true;
		notifyAll();
	}
}
