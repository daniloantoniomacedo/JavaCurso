package com.danilo.cursojava.praticas;

public class JavaPratica030 {

	public static void main(String[] args) {
		/*Elabore uma solu��o para construir uma sequencia de valores inteiros positivos que 
		sejam ao mesmo tempo pares e divis�veis por 5, na qual o �ltimo valor n�o pode 
		ser maior que 100. (while)*/

		int i = 1;
		while (i <= 100) {
			if (i%2 == 0  && i%5 == 0) {
			System.out.printf("%d ", i++);	
			}
			i++;
		}
	}

}
