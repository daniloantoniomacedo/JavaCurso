package com.danilo.cursojava.praticas;

import java.util.Scanner; 

public class JavaPratica018 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int valor1, valor2, media;
		int MIN = 0;
		int MAX = 10;
		int PESO4 = 4;
		int PESO6 = 6;
		int MEDIA = 6;

		System.out.println("Informe 2 notas entre 0 e 10");
		valor1 = teclado.nextInt();
		valor2 = teclado.nextInt();
		if (valor1 < MIN && valor1 > MAX && valor2 < MIN && valor2 > MAX) {
			System.out.println("Valor incorreto");
		} else {
			media = ((valor1 * PESO4) + (valor2 * PESO6)) / (PESO4+PESO6);
			if (media < MEDIA) {
				System.out.println("Reprovado");
			} else {
				System.out.println("Aprovado");
			}
		}

	}

}