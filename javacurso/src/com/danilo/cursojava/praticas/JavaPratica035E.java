package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica035E {

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
e) Identifique a quantidade de n�meros �mpares existentes na sequencia
f) Identifique a quantidade de n�meros �mpares divis�veis por 3 existentes na sequencia.
g) Calcule a soma de todos os elementos da sequencia.
h) Calcule a m�dia ponderada do 4� e do 10� numero da sequencia, considerando os pesos 4 e 6 respectivamente,
quando for poss�vel. Caso a sequencia n�o apresente um desses elementos, o mesmo dever� ser informado.
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
			System.out.println("Qual o valor limite da sequ�ncia?");
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
		System.out.print("A sequ�ncia �: \n");
		for (int i=0; i < lista.length; i++) {
			System.out.printf("%.0f ", lista[i]);
		}
		System.out.println();
		System.out.print("-----------------------------------------------\n");
		// b) Calcule a quantidade de elementos da sequencia.
		System.out.printf("A sequ�ncia possui %d elementos. \n", lista.length);
		
		System.out.print("-----------------------------------------------\n");
		// c) Calcule a m�dia aritm�tica do primeiro e �ltimo valor da sequ�ncia.
		media = (lista[0]+lista[countsize-1])/2;
		System.out.printf("O primeiro termo da sequ�ncia � %.0f, o �ltimo � %.0f e a m�dia aritm�tica deles � %.2f. \n", lista[0], lista[countsize-1], media);
		
		System.out.print("-----------------------------------------------\n");
		//d) Identifique a quantidade de n�meros pares existentes na sequ�ncia.
		for (int i=0; i < lista.length; i++) {
			if (lista[i]%2 == 0) {
				countpares++;
			}
		}
		System.out.printf("A quantidade de n�meros pares � %d. \n", countpares);
		
		System.out.print("-----------------------------------------------\n");
		// e) Identifique a quantidade de n�meros �mpares existentes na sequencia.
		for (int i=0; i < lista.length; i++) {
			if (lista[i]%2 != 0) {
				countimpares++;
			}
		}
		System.out.printf("A quantidade de n�meros �mpares � %d. \n", countimpares);
		
		System.out.print("-----------------------------------------------\n");
		//f) Identifique a quantidade de n�meros �mpares divis�veis por 3 existentes na sequencia.
		for (int i=0; i < lista.length; i++) {
			if (lista[i]%3 == 0) {
				countimpares3++;
			}
		}
		System.out.printf("A quantidade de n�mero �mpares divis�veis por 3 � %d. \n", countimpares3);
		
		System.out.print("-----------------------------------------------\n");
		//g) Calcule a soma de todos os elementos da sequ�ncia.
		for (int i=0; i < lista.length; i++) {
			soma = soma + lista[i];
		}
		System.out.printf("A soma de todos os termos da sequ�ncia � %.0f. \n", soma);
		
		System.out.print("-----------------------------------------------\n");
		/*h) Calcule a m�dia ponderada do 4� e do 10� numero da sequencia, considerando os pesos 4 e 6 respectivamente,
		quando for poss�vel. Caso a sequencia n�o apresente um desses elementos, o mesmo dever� ser informado.*/
		if (lista.length >=4 && lista.length >= 10) {
			
			mediaponderada = (lista[3]*PESON4+lista[9]*PESON6)/(PESON4+PESON6);
			System.out.printf("A m�dia ponderada entre o 4� e 10� elementos da sequ�ncia,"
					+ " considerando os pesos %d e %d respectivamente, � %.2f. \n", PESON4, PESON6, mediaponderada);
			
		}else{
			System.out.print("A sequ�ncia n�o apresenta elementos na 4� ou na 10� posi��o.");
		}
	}
}



