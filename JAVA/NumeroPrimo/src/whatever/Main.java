package whatever;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroPrimo;
		int contador = 0;

		System.out.println("Introduce un numero");
		numeroPrimo = sc.nextInt();
		for (int i = 1; i <= numeroPrimo; i++) {

			if (numeroPrimo % i == 0) {
				contador++;
			}

		}
		if (contador==2) {
			System.out.println(numeroPrimo+": es primo");
		}
		else {
			System.out.println(numeroPrimo+": no es primo");
		}

	}

}
