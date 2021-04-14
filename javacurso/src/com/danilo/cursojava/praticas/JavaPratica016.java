package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica016 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		String nome = teclado.next();
		
		System.out.println("Digite o primeiro valor:");
		int n1 = teclado.nextInt();
		
		System.out.println("Digite o segundo valor:");
		int n2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		int n3 = teclado.nextInt();
		
		System.out.printf("Seu nome é %s e o resultado da operação é %d", nome, (n1+n2)*n3);
		
		

	}

}
