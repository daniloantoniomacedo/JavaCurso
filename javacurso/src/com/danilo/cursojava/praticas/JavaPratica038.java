package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica038 {

	public static void main(String[] args) {
		/* Problema: Elabore uma solução em JAVA para, a partir de 03 valores inteiros 
		   informados pelo usuário em um intervalo fechado de 10 a 90, apresente qual o maior e qual o 
		   menor dos três valores informados em qualquer ordem.
		   Para isso, considere que:
		   a) Os valores digitados não podem ser repetidos;
		   b) O resultado deve ser "os valores não atendem ao problema 
		   apresentado caso a regra acima não sejam atendidas. */
		
		int MAX = 90;
		int MIN = 10;
		int contador = 1;
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Qual o %d° valor? \n", contador);
		int valor1 = teclado.nextInt();
		contador++;
		System.out.printf("Qual o %dº valor? \n", contador);
		int valor2 = teclado.nextInt();
		contador++;
		System.out.printf("Qual o %dº valor? \n", contador);
		int valor3 = teclado.nextInt();
		if ((valor1 >= MIN) && (valor1 <= MAX)
		   && (valor2 >= MIN) && (valor2 <= MAX)
		   && (valor3 >= MIN) && (valor3 <= MAX)) {
			if ((valor1 != valor2) &&
				(valor2 != valor3) &&
				(valor1 != valor3)) {
				if ((valor1 > valor2) &&
				   (valor1 > valor3)){
					System.out.printf("%d é o maior valor. \n", valor1);
				}else if ((valor2 > valor1) &&
						 (valor2 > valor3)){
					System.out.printf("%d é o maior valor. \n", valor2);
				}else{
					System.out.printf("%d é o maior valor. \n", valor3);
				if ((valor1 < valor2) &&
					(valor1 < valor3)){
						System.out.printf("%d é o menor valor. \n", valor1);
				}else if ((valor2 < valor1) &&
						  (valor2 < valor3)){
						System.out.printf("%d é o menor valor. \n", valor2);
				}else{ 
						System.out.printf("%d é o menor valor. \n", valor3);
				}
				}
			}else{
				System.out.print("Os valores não atendem ao problema apresentado");
			}
		}else{
			System.out.print("Os valores não atendem ao problema apresentado");
		}
		

	}

}
