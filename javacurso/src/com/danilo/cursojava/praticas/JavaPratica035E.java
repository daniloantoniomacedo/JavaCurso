package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica035E {

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
e) Identifique a quantidade de números ímpares existentes na sequencia
f) Identifique a quantidade de números ímpares divisíveis por 3 existentes na sequencia.
g) Calcule a soma de todos os elementos da sequencia.
h) Calcule a média ponderada do 4º e do 10º numero da sequencia, considerando os pesos 4 e 6 respectivamente,
quando for possível. Caso a sequencia não apresente um desses elementos, o mesmo deverá ser informado.
*/

		int MAX = 100;
		int MIN = 50;
		int N1 = 10;
		int RAZAO = 6;
		int PESON4 = 4;
		int PESON6 = 6;
		
		int n, limite;
		int countpares = 0;
		int countimpares = 0;
		int countimpares3 = 0;
		int countsize = 0;
		
		double media, mediaponderada;
		double soma=0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Qual o valor limite da sequência?");
			limite = teclado.nextInt();
			if (limite < MIN || limite > MAX) {
				System.out.println("O valor limite deve estar entre 50 e 100, tente novamente.");
			}
			
		} while (limite < MIN || limite > MAX);
		
		
		for (int i=0; i < limite; i++) {
			if (i==0) {
				i=10;
				countsize++;
			}
			i = i + RAZAO;
			countsize++;
		}
		
		double[] lista = new double[countsize];
		lista[0] = 10;
			
		n = N1;
		for (int i=1; n < limite-RAZAO; i++) {
			n = n + RAZAO;
			lista[i] = n;
		}
		// a) Apresente a sequencia.
		System.out.print("A sequência é: \n");
		for (int i=0; i < lista.length; i++) {
			System.out.printf("%.0f ", lista[i]);
		}
		System.out.println();
		System.out.print("-----------------------------------------------\n");
		// b) Calcule a quantidade de elementos da sequencia.
		System.out.printf("A sequência possui %d elementos. \n", lista.length);
		
		System.out.print("-----------------------------------------------\n");
		// c) Calcule a média aritmética do primeiro e último valor da sequência.
		media = (lista[0]+lista[countsize-1])/2;
		System.out.printf("O primeiro termo da sequência é %.0f, o último é %.0f e a média aritmética deles é %.2f. \n", lista[0], lista[countsize-1], media);
		
		System.out.print("-----------------------------------------------\n");
		//d) Identifique a quantidade de números pares existentes na sequência.
		for (int i=0; i < lista.length; i++) {
			if (lista[i]%2 == 0) {
				countpares++;
			}
		}
		System.out.printf("A quantidade de números pares é %d. \n", countpares);
		
		System.out.print("-----------------------------------------------\n");
		// e) Identifique a quantidade de números ímpares existentes na sequencia.
		for (int i=0; i < lista.length; i++) {
			if (lista[i]%2 != 0) {
				countimpares++;
			}
		}
		System.out.printf("A quantidade de números ímpares é %d. \n", countimpares);
		
		System.out.print("-----------------------------------------------\n");
		//f) Identifique a quantidade de números ímpares divisíveis por 3 existentes na sequencia.
		for (int i=0; i < lista.length; i++) {
			if (lista[i]%3 == 0) {
				countimpares3++;
			}
		}
		System.out.printf("A quantidade de número ímpares divisíveis por 3 é %d. \n", countimpares3);
		
		System.out.print("-----------------------------------------------\n");
		//g) Calcule a soma de todos os elementos da sequência.
		for (int i=0; i < lista.length; i++) {
			soma = soma + lista[i];
		}
		System.out.printf("A soma de todos os termos da sequência é %.0f. \n", soma);
		
		System.out.print("-----------------------------------------------\n");
		/*h) Calcule a média ponderada do 4º e do 10º numero da sequencia, considerando os pesos 4 e 6 respectivamente,
		quando for possível. Caso a sequencia não apresente um desses elementos, o mesmo deverá ser informado.*/
		if (lista.length >=4 && lista.length >= 10) {
			
			mediaponderada = (lista[3]*PESON4+lista[9]*PESON6)/(PESON4+PESON6);
			System.out.printf("A média ponderada entre o 4º e 10º elementos da sequência,"
					+ " considerando os pesos %d e %d respectivamente, é %.2f. \n", PESON4, PESON6, mediaponderada);
			
		}else{
			System.out.print("A sequência não apresenta elementos na 4º ou na 10º posição.");
		}
	}
}



