package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica035 {

	public static void main(String[] args) {
		/* Utilize a estrutura do / while pelo menos uma vez para elaborar uma Progress�o Aritm�tica de valores inteiros, 
		positivos iniciada com o valor 10 e raz�o 6, na qual o valor limite da sequencia ser� informado pelo usu�rio (executor),
		obedecendo aos seguintes crit�rios:
		(1) O valor limite deve ser informado pelo usu�rio em um intervalo fechado de 50 e 100.
		(2) Se o usu�rio informar qualquer valor fora desse intervalo, o algoritmo dever� permanecer
		solicitando o valor, at� que seja informado dentro do intervalo. A sequencia s� ser� constru�da quando
		o usu�rio informar o valor dentro do intervalo.

		Com base no texto acima:
		a) Apresente a sequencia.
		b) Calcule a quantidade de elementos da sequencia.
		c) Calcule a m�dia aritm�tica do primeiro e �ltimo valor da sequencia.
		d) Identifique a quantidade de n�meros pares existentes na sequencia.
		e) Identifique a quantidade de n�meros �mpares existentes na sequencia.
		f) Identifique a quantidade de n�meros �mpares divis�veis por 3 existentes na sequencia.
		g) Calcule a soma de todos os elementos da sequencia.
		h) Calcule a m�dia ponderada do 4� e do 10� numero da sequencia, considerando os pesos 4 e 6 respectivamente,
		quando for poss�vel. Caso a sequencia n�o apresente um desses elementos, o mesmo dever� ser informado.
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
		
		
		System.out.println("Qual o limite da sequ�ncia?");
		limite = teclado.nextInt();
		
		while (limite>MAX || limite<MIN) {
			System.out.println("Valor inserido fora do intervalo v�lido.");
			System.out.println("Qual o limite da sequ�ncia?");
			limite = teclado.nextInt();			
			}
		//a) Apresente a sequencia.
		System.out.print("A sequ�ncia �: \n");
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
			System.out.printf("O n�mero de elementos �: %d \n", count+1);
			
		//c) Calcule a m�dia aritm�tica do primeiro e �ltimo valor da sequencia.
			media = ((10+RAZAO*count)/2);
			System.out.printf("A m�dia de 10 e %d � %.2f. \n", 10+(RAZAO*count), media);
			
		//d) Identifique a quantidade de n�meros pares existentes na sequencia.
			System.out.printf("A quantidade de n�meros pares �: %d. \n", countpares);
			
		//e) Identifique a quantidade de n�meros �mpares existentes na sequencia.
			System.out.printf("A quantidade de n�meros �mpares �: %d. \n", countimpares);
			
		//f) Identifique a quantidade de n�meros �mpares divis�veis por 3 existentes na sequencia.
			System.out.printf("A quantidade de n�meros �mpares divis�veis por 3 �: %d. \n", countimpares3);
			
		//g) Calcule a soma de todos os elementos da sequencia.
			System.out.printf("A soma de todos os elementos da sequ�ncia �: %d. \n", soma);
			
		//h) Calcule a m�dia ponderada do 4� e do 10� numero da sequencia, considerando os pesos 4 e 6 respectivamente,
		//quando for poss�vel. Caso a sequencia n�o apresente um desses elementos, o mesmo dever� ser informado.
			if (count<4 || count<10) {
				System.out.println("A sequ�ncia n�o possui o 4� ou 10� elementos. \n");
			}else{
				mediap = (((10+RAZAO*3)*PESO4)+(10+RAZAO*9)*PESO10)/(PESO4+PESO10);
				System.out.printf("A m�dia entre o 4� e o 10� elemento, considerando os pesos %d e %d respectivamente, �: %.2f.", PESO4, PESO10, mediap);
			}		
	}

}
