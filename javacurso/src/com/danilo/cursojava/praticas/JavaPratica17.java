package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica17 {

	public static void main(String[] args) {
		/*Elabore um algoritmo em JAVA para que, a partir de 03 valores informados, 
		 seja calculada a média aritmética desses valores. Em seguida deve ser apresentado 
		 o resultado considerando o seguinte critério: se o valor obtido da média for menor que 6 
		 a informação final deverá ser "Reprovado", caso contrário deverá ser "Aprovado".*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o nome do aluno?");
		String nome = teclado.nextLine();
		System.out.printf("Qual o valor da primeira nota de %s? \n", nome);
		float nota1 = teclado.nextFloat();
		System.out.printf("Qual o valor da segunda nota de %s? \n", nome);
		float nota2 = teclado.nextFloat();
		if ((nota1+nota2)/2 >= 6) {
			System.out.printf("%s tirou %.2f na primira prova, tirou %.2f na segunda prova e obteve média %.2f, logo está reprovado", nome, nota1, nota2, (nota1+nota2)/2);
		}else{
			System.out.printf("%s tirou %.2f na primeira prova, tirou %.2f na segunda prova e obteve média %.2f, logo está reprovado.", nome, nota1, nota2, (nota1+nota2)/2);
		}
	}

}
