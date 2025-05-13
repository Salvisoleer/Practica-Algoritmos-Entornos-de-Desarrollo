package com.entornos.salvadorsoler.algoritmos;

public abstract class algoritmos {
	//primer método
	public int fibonacci(int num) {
		if(num < 0) {
			throw new IllegalArgumentException("El número no puede ser negativo");
		}
		
		if(num == 0) return 0;
		if(num == 1) return 1;
		
		int a = 0;
		int b = 1;
		int resultado = 0;
		
		for (int i = 2; i<num; i++) {
			resultado = a+b;
			a = b;
			b = resultado;
			
			
		}
		
		return resultado;
	}
	
	
	//Segundo método
	public int factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("El número no puede ser negativo");
		}
		
		if(n == 0) {
			return 1;
		}
		
		int result = 1;
		for(int i=1; i<=n; i++) {
			result = result*i;
		}
		
		return result; 
	}
}
