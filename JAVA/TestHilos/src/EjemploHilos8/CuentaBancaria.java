package EjemploHilos8;

public class CuentaBancaria {
	private int saldoInicial;

	public CuentaBancaria() {
		saldoInicial = 1000;

	}

	public synchronized void retirarDinero(int cantidad) {
		if (cantidad > saldoInicial) {
			System.out.println("No se puede realizar el retiro, ya que supera la cantidad que posees: " + saldoInicial+"€");
		}
		else {
			saldoInicial -= cantidad;
			System.out.println("Se ha retirado " + cantidad + " Saldo restante: " + this.getSaldoActual());
		}
		
	}
	public synchronized void ingresarDinero(int cantidad) {
		if (cantidad > saldoInicial) {
			System.out.println("No se puede realizar el ingreso, ya que supera la cantidad que posees: " + saldoInicial+"€");
		}
		else {
			saldoInicial += cantidad;
			System.out.println("Se ha ingresado " + cantidad + " Saldo restante: " + this.getSaldoActual());
		}
	}

	public int getSaldoActual() {
		return saldoInicial;
	}
}
