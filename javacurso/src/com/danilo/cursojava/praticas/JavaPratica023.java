package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica023 {

	public static void main(String[] args) {
		/*Utilize o switch / case para formular a questão.

		Questão 01: Indique, uma das alternativas abaixo que represente um animal considerado invertebrado:
		(a) lesmas
		(b) moluscos
		(c) cachorro
		(d) gato

		Caso o usuário escolha uma das opções "a" ou "b" o retorno deverá "Verdadeiro", caso contrário "Falso".*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Indique qual das alternativas abaixo contem um anumal considerado invertebrado: \n"
				+ "(a) Lesmas; \n"
				+ "(b) Moluscos; \n"
				+ "(c) Cachorro; \n"
				+ "(d) Gato; \n");
		String nome = teclado.next();
		switch (nome) {
		case "a": System.out.print("CORRETO. Lesma é um animal invertebrado; \n"); break;
		case "b": System.out.print("CORRETO. Moluscos são animais invertebrados. \n"); break;
		case "c": System.out.print("ERRADO. Cachorro não é um animal invertebrado. \n"); break;
		case "d": System.out.print("ERRADO. Gato não é um animal invertebrado. \n"); break;
		default: System.out.print("Opção digitada não existe."); break;
		}

	}

}
