package com.entornos.salvadorsoler.algoritmos;
public class Principal {
	public static void main(String[] args) {

		algoritmos a = new algoritmos() {}; 

		int[] numeros = new int[3];
		int i = 0;

		while (i < 3) {
			int n = (int)(Math.random() * 10) + 1;
			boolean rep = false;

			for (int j = 0; j < i; j++) {
				if (numeros[j] == n) {
					rep = true;
				}
			}

			if (!rep) {
				numeros[i] = n;
				i++;
			}
		}

		int[] fibo = new int[3];
		int[] fact = new int[3];
		boolean[] prim = new boolean[3];

		for (int j = 0; j < 3; j++) {
			fibo[j] = a.fibonacci(numeros[j]);
			fact[j] = a.factorial(numeros[j]);
			prim[j] = a.primo(numeros[j]);
		}

	}
}


