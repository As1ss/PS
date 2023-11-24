package Practica2;

public class CuentaBancaria {

	private int saldoInicial;
	private int saldoMaximo;

	public CuentaBancaria(int saldoInicial, int  saldoMaximo) {
		this.saldoInicial = saldoInicial;
		this.saldoMaximo = saldoMaximo;
	}

	public synchronized boolean ingresoDinero(int cantidad) {
		boolean ingresoSatisfactorio;
		if (cantidad > 0 && cantidad < saldoMaximo) {
			double saldoTemp = saldoInicial;
			saldoInicial += cantidad;
			System.out.println(
					"El usuario " + Thread.currentThread().getName() + " ha ingresado " + cantidad + " a " + saldoTemp);
			System.out.println("Saldo actual: " + saldoInicial);
			ingresoSatisfactorio = true;
		} else {
			System.err.println(
					"El usuario " + Thread.currentThread().getName() + " no  puede realizar el ingreso por que "
							+ cantidad + " supera al saldo máximo permitido: " + saldoMaximo);
			ingresoSatisfactorio = false;
		}

		return ingresoSatisfactorio;

	}

	public synchronized boolean retiroDinero(int cantidad) {
		boolean retiroSatisfactorio;
		if (cantidad > 0 && cantidad < saldoInicial) {
			double saldoTemp = saldoInicial;
			saldoInicial -= cantidad;
			System.out.println(
					"El usuario " + Thread.currentThread().getName() + " ha retirado " + cantidad + " a " + saldoTemp);
			System.out.println("Saldo actual: " + saldoInicial);
			retiroSatisfactorio = true;
		} else {
			System.out
					.println("El usuario " + Thread.currentThread().getName() + " no  puede realizar el retiro por que "
							+ cantidad + " supera al saldo actual de la cuenta: " + saldoInicial);
			retiroSatisfactorio = false;
		}
		return retiroSatisfactorio;
	}
}
