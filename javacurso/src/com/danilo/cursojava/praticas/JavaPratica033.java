package com.danilo.cursojava.praticas;

public class JavaPratica033 {

	public static void main(String[] args) {
		/* sequencia Fibonacci é uma sequência de números inteiros que começa normalmente por 0 e 1 
		 e cada termo subsequente corresponde à soma dos dois anteriores. Sendo assim, elabore uma solução para imprimir 
		 uma sequencia Fibonacci contendo os 20 primeiros valores. (do / while)*/
		
		int i = 1;
		int n0 = 0;
		int n1 = 1;
		int memoria;
		int MAX = 20;
		
		System.out.print("0 ");
		do {
			memoria = n1;
			n1 = n1 + n0;
			n0 = memoria;
			i++;
			System.out.printf("%d ", n1);
			
		} while (i<=MAX);
		
	}

}
