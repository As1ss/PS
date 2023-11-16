package ProductorConsumidor;

public class MainProductorConsumidor {

	public static void main(String[] args) {
		Cola cola = new Cola();

		Productor pr = new Productor(cola,"PONG");
		Consumidor cs = new Consumidor(cola);
		
		pr.start();
		cs.start();

	}

}
