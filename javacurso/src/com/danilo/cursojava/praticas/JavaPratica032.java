package com.danilo.cursojava.praticas;

public class JavaPratica032 {

	public static void main(String[] args) {
		// Elabore uma progressão geométrica de razão 4 contendo 10 elementos, cujo primeiro termo é 1.
		
		int i = 1;
		int n =1;
		int MAX = 10;
		do {
		i++;
		n = n*4; 
		System.out.printf("%d, ", n);
		} while (i<=MAX);

	}

}
