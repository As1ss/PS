package EjemploHilos8;

public class CuentaBancaria {
	private int saldoInicial;

	public CuentaBancaria() {
		saldoInicial = 1000;

	}

	public synchronized void retirarDinero(int cantidad) {
		saldoInicial -= cantidad;
		System.out.println("Se ha retirado "+cantidad+" Saldo restante: "+this.getSaldoActual());
	}

	public int getSaldoActual() {
		return saldoInicial;
	}
}
