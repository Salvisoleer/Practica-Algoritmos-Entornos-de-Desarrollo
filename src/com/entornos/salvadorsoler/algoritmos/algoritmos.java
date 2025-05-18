package com.entornos.salvadorsoler.algoritmos;

public abstract class algoritmos {
	public int fibonacci(int numero){
	    if(numero<0){
	        throw new IllegalArgumentException("no puede ser negativo");
	    }
	    if(numero==0){
	        return 0;
	    }
	    if(numero==1){
	        return 1;
	    }
	    int a = 0;
	    int b = 1;
	    int c = 0;
	    
	    for(int i=2;i<numero;i++){
	        c = a + b;
	        a = b;
	        b = c;
	    }
	    return c;
	}
	
	
	public int factorial(int numero){
	    if(numero<0){
	        throw new IllegalArgumentException("no puede ser negativo");
	    }

	    int resultado = 1;
	    for(int i = 1; i <= numero; i++){
	        resultado = resultado * i;
	    }

	    return resultado;
	}
	
	public boolean primo(int numero){
	    if(numero<2){
	        throw new IllegalArgumentException("el número debe ser 2 o mayor");
	    }

	    for(int i = 2; i < numero; i++){
	        if(numero % i == 0){
	            return false;
	        }
	    }

	    return true;
	}



}
