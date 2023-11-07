package EjemploHilos8;

public class CajeroAutomatico implements Runnable {

	int saldoInicial;
	private int saldoActual;

	@Override
	public void run() {
		saldoInicial = 1000;
		saldoActual = saldoInicial;

	}

	public int getSaldoActual() {
		return saldoActual;
	}

	public void ingresarSaldo(int suma) {
		saldoActual += suma;
	}

}
