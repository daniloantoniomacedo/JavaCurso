package com.danilo.cursojava.praticas;

public class JavaPratica031 {

	public static void main(String[] args) {
		/*Elabore uma progress�o aritm�tica de raz�o 3,
		 *na qual o primeiro termo � 1 e o ultimo n�o pode ultrapassar o valor 50 (do / while)
		 */
		int a = 0;
		int MAX = 50;
		do {
			System.out.printf("%d ", a);
			a = a + 3;
		} while (a<=MAX);
	}
}
