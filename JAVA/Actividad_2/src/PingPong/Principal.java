package PingPong;

public class Principal {

	public static void main(String[] args) {
		Cola cola = new Cola();
		
		Productor p = new Productor(cola,"PING");
		Consumidor c = new Consumidor(cola);
		
		
		c.start();
		p.start();
	

	}

}
