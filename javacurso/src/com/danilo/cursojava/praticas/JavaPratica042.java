package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica042 {

	public static void main(String[] args) {
		/*Elabore uma solução na qual o usuário deve informar 10 valores inteiros positivos 
		 * dentro de um intervalo fechado de 20 a 50. A cada valor informado, o algoritmo deve somar 
		 * e acumular o resultado em uma variável. Quando o valor informado estiver fora do intervalo 
		 * o algoritmo deve desconsiderar o valor (não soma) e solicitar que o usuário informe novamente.
		 * O valor acumulado da soma deve ser multiplicado pela quantidade de valores pares, divisíveis por 
		 * 5 informados pelo usuário. O algoritmo deve apresentar o resultado final da operação.*/

		int VALORES = 10;
		int MAX = 50;
		int MIN = 20;
		
		int numero=0;
		int soma = 0;
		int count = 0;
		
		int[] list = new int[VALORES];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i<VALORES; i++) {
			System.out.printf("Digite o %dº valor: \n", i+1);
			numero = teclado.nextInt();
			if (numero<=MAX && numero>=MIN) {
				list[i]=numero;
			}else{
				System.out.println("Valor inserido fora do intervalo válido. Tente novamente.");
				i--;
			}
		}
		for (int i=0; i<VALORES; i++) {
			soma = soma + list[i];
		}
		
		for (int i=0; i<VALORES; i++) {
			if (list[i]%2==0 && list[i]%5==0) {
				count++;
			}
		}
		System.out.println("A sequência é:");
		for (int i=0; i<VALORES; i++) {
			System.out.printf("%d ", list[i]);
		}
		
		System.out.print("\n");
		System.out.printf("O resultado final da operação é: %d.", soma*count);
		
	}

}
