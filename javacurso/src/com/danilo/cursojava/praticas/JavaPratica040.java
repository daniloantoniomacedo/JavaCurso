package com.danilo.cursojava.praticas;

public class JavaPratica040 {

	public static void main(String[] args) {
		/*Elabore uma solu��o para construir uma sequencia de valores inteiros positivos que sejam pares e
		 * n�o seja divis�vel por 6. O �ltimo valor n�o pode ser maior que 250. (while).
		 * Considere a cada 10 valores o pr�ximo deve ser impresso na linha abaixo (quebra a linha). */
		
		int n = 0;
		int count = 0;
		
		while (n<250) {
			n++;
			if (n%2 == 0 && n%6 != 0) {
				count++;
				if (count%10 == 0) {
					System.out.print("\n");
				}
				System.out.printf("%d ", n);
			}
		}

	}

}
