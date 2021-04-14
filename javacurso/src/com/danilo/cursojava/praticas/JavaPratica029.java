package com.danilo.cursojava.praticas;

public class JavaPratica029 {

	public static void main(String[] args) {
		/*Elabore uma solução para construir uma sequencia de
		valores inteiros positivos, impares na qual o último valor não seja maior que 50. (while)*/
		
		int i = 0;
		while (i < 50) {
			if (i%2 == 0) {
				System.out.printf("%d ", ++i);
			}
			i++;			
		}
		
	}

}
