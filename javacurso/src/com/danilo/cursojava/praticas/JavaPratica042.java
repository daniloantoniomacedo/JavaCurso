package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica042 {

	public static void main(String[] args) {
		/*Elabore uma solu��o na qual o usu�rio deve informar 10 valores inteiros positivos 
		 * dentro de um intervalo fechado de 20 a 50. A cada valor informado, o algoritmo deve somar 
		 * e acumular o resultado em uma vari�vel. Quando o valor informado estiver fora do intervalo 
		 * o algoritmo deve desconsiderar o valor (n�o soma) e solicitar que o usu�rio informe novamente.
		 * O valor acumulado da soma deve ser multiplicado pela quantidade de valores pares, divis�veis por 
		 * 5 informados pelo usu�rio. O algoritmo deve apresentar o resultado final da opera��o.*/

		int VALORES = 10;
		int MAX = 50;
		int MIN = 20;
		
		int numero=0;
		int soma = 0;
		int count = 0;
		
		int[] list = new int[VALORES];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i<VALORES; i++) {
			System.out.printf("Digite o %d� valor: \n", i+1);
			numero = teclado.nextInt();
			if (numero<=MAX && numero>=MIN) {
				list[i]=numero;
			}else{
				System.out.println("Valor inserido fora do intervalo v�lido. Tente novamente.");
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
		System.out.println("A sequ�ncia �:");
		for (int i=0; i<VALORES; i++) {
			System.out.printf("%d ", list[i]);
		}
		
		System.out.print("\n");
		System.out.printf("O resultado final da opera��o �: %d.", soma*count);
		
	}

}
