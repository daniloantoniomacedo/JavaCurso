package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica020 {
	
	/*Problema: Elabore uma solução utilizando switch/case para, a partir de um valor informado 
	 no intervalo de 1 a 7, seja impresso o dia da semana por extenso. Quando os valores informados 
	 estiverem fora desse intervalo, imprimir "dia inválido". Considere o valor 1 para Domingo*/

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escolha um dia da semana conforme a lista abaixo: \n"
				+ "1 - Domingo; \n"
				+ "2 - Segunda; \n"
				+ "3 - Terça; \n"
				+ "4 - Quarta; \n"
				+ "5 - Quinta; \n"
				+ "6 - Sexta; \n"
				+ "7 - Sábado \n");
		int numero = teclado.nextInt();
		switch (numero) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Terça"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("Sábado"); break;
			default: System.out.println("Não existe dia da semana correspondente ao valor digitado.");
		}
	}
}
	
