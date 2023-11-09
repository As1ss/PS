package EjemploHilos8;

public class CajeroAutomatico implements Runnable {

	int saldoInicial;
	private int saldoActual;
	
	public CajeroAutomatico() {
		saldoInicial = 1000;
		saldoActual = saldoInicial;
	}

	@Override
	public void run() {
		

	}

	public int getSaldoActual() {
		return saldoActual;
	}

	public void ingresarSaldo(int suma) {
		saldoActual += suma;
	}

}
