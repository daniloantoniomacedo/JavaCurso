package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica035 {

	public static void main(String[] args) {
		/* Utilize a estrutura do / while pelo menos uma vez para elaborar uma Progressão Aritmética de valores inteiros, 
		positivos iniciada com o valor 10 e razão 6, na qual o valor limite da sequencia será informado pelo usuário (executor),
		obedecendo aos seguintes critérios:
		(1) O valor limite deve ser informado pelo usuário em um intervalo fechado de 50 e 100.
		(2) Se o usuário informar qualquer valor fora desse intervalo, o algoritmo deverá permanecer
		solicitando o valor, até que seja informado dentro do intervalo. A sequencia só será construída quando
		o usuário informar o valor dentro do intervalo.

		Com base no texto acima:
		a) Apresente a sequencia.
		b) Calcule a quantidade de elementos da sequencia.
		c) Calcule a média aritmética do primeiro e último valor da sequencia.
		d) Identifique a quantidade de números pares existentes na sequencia.
		e) Identifique a quantidade de números ímpares existentes na sequencia.
		f) Identifique a quantidade de números ímpares divisíveis por 3 existentes na sequencia.
		g) Calcule a soma de todos os elementos da sequencia.
		h) Calcule a média ponderada do 4º e do 10º numero da sequencia, considerando os pesos 4 e 6 respectivamente,
		quando for possível. Caso a sequencia não apresente um desses elementos, o mesmo deverá ser informado.
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		int RAZAO = 6;
		int MAX = 100;
		int MIN = 50;
		int PESO4 = 4;
		int PESO10 = 6;
				
		int i = 10;
		int count = 0;
		int soma = 0;
		int somap = 0;
		int countpares = 0;
		int countimpares = 0;
		int countimpares3 = 0;
		
		int limite;
		int ultimo;
		
		double media;
		double mediap;
		
		
		System.out.println("Qual o limite da sequência?");
		limite = teclado.nextInt();
		
		while (limite>MAX || limite<MIN) {
			System.out.println("Valor inserido fora do intervalo válido.");
			System.out.println("Qual o limite da sequência?");
			limite = teclado.nextInt();			
			}
		//a) Apresente a sequencia.
		System.out.print("A sequência é: \n");
		System.out.print("10 ");
		while (i<limite-RAZAO) {
			i = i + RAZAO;
			count++;
			soma = soma + i;
			System.out.printf("%d ", i);
			if (i%2 == 0) {
				countpares++;
			}
			if (i%2 != 0) {
				countimpares++;
			}
			if (i%2 != 0 && i%3 == 0) {
				countimpares3++;
			}
		}
		System.out.println("");
			
		//b) Calcule a quantidade de elementos da sequencia.
			System.out.printf("O número de elementos é: %d \n", count+1);
			
		//c) Calcule a média aritmética do primeiro e último valor da sequencia.
			media = ((10+RAZAO*count)/2);
			System.out.printf("A média de 10 e %d é %.2f. \n", 10+(RAZAO*count), media);
			
		//d) Identifique a quantidade de números pares existentes na sequencia.
			System.out.printf("A quantidade de números pares é: %d. \n", countpares);
			
		//e) Identifique a quantidade de números ímpares existentes na sequencia.
			System.out.printf("A quantidade de números ímpares é: %d. \n", countimpares);
			
		//f) Identifique a quantidade de números ímpares divisíveis por 3 existentes na sequencia.
			System.out.printf("A quantidade de números ímpares divisíveis por 3 é: %d. \n", countimpares3);
			
		//g) Calcule a soma de todos os elementos da sequencia.
			System.out.printf("A soma de todos os elementos da sequência é: %d. \n", soma);
			
		//h) Calcule a média ponderada do 4º e do 10º numero da sequencia, considerando os pesos 4 e 6 respectivamente,
		//quando for possível. Caso a sequencia não apresente um desses elementos, o mesmo deverá ser informado.
			if (count<4 || count<10) {
				System.out.println("A sequência não possui o 4º ou 10º elementos. \n");
			}else{
				mediap = (((10+RAZAO*3)*PESO4)+(10+RAZAO*9)*PESO10)/(PESO4+PESO10);
				System.out.printf("A média entre o 4º e o 10º elemento, considerando os pesos %d e %d respectivamente, é: %.2f.", PESO4, PESO10, mediap);
			}		
	}

}
