package com.danilo.cursojava.praticas;

public class JavaPratica031 {

	public static void main(String[] args) {
		/*Elabore uma progressão aritmética de razão 3,
		 *na qual o primeiro termo é 1 e o ultimo não pode ultrapassar o valor 50 (do / while)
		 */
		int a = 0;
		int MAX = 50;
		do {
			System.out.printf("%d ", a);
			a = a + 3;
		} while (a<=MAX);
	}
}
