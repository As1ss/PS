package Practica2;

public class CuentaBancaria {

	private int saldoInicial;
	private int saldoMaximo;

	public CuentaBancaria(int saldoInicial, int saldoMaximo) {
		this.saldoInicial = saldoInicial;
		this.saldoMaximo = saldoMaximo;
	}

	public synchronized boolean ingresoDinero(int cantidad) {
		boolean ingresoSatisfactorio; // Esta variable sera la que decida si se ha realizado con exito la operacion o
										// no
		if (cantidad > 0 && cantidad < saldoMaximo) {// Comprobamso que cantidad sea un numero válido para el ingreso
			double saldoTemp = saldoInicial; // Simplemente una variable para mostrar el saldo anterior a la operación
			saldoInicial += cantidad; 
			System.out.println(
					"El usuario " + Thread.currentThread().getName() + " ha ingresado " + cantidad + " a " + saldoTemp);
			System.out.println("Saldo actual: " + saldoInicial);
			ingresoSatisfactorio = true; //Establecemos a true la variable de infresoSatisfactorio
		} else {
			System.err.println(
					"El usuario " + Thread.currentThread().getName() + " no  puede realizar el ingreso por que "
							+ cantidad + " supera al saldo máximo permitido: " + saldoMaximo);
			ingresoSatisfactorio = false; //Establecemos a false la variable de infresoSatisfactorio
		}

		return ingresoSatisfactorio; //retornamos la variable booleana

	}

	//Misma metodología que el método de ingreso
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
			System.err
					.println("El usuario " + Thread.currentThread().getName() + " no  puede realizar el retiro por que "
							+ cantidad + " supera al saldo actual de la cuenta: " + saldoInicial);
			retiroSatisfactorio = false;
		}
		return retiroSatisfactorio;
	}
}
