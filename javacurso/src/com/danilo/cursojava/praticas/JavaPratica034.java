package com.danilo.cursojava.praticas;

public class JavaPratica034 {

	public static void main(String[] args) {
		/* Elabore uma solução para construir uma sequencia de valores inteiros positivos 
		que sejam ao mesmo tempo pares e divisíveis por 5, 
		na qual o último valor não pode ser maior que 100. (do / while) */

		int n = 0;
		int MAX = 100;
		do {
			n = n + 5;
			if (n%2 == 0) {
				System.out.printf("%d ", n);
			}
		} while (n<=100);
	}
}
