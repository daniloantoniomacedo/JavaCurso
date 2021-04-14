package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica024 {

	public static void main(String[] args) {
		/*Elabore uma solu��o para, a partir de valores correspondentes ao m�s e ano informado pelo usu�rio, 
		 *seja apresentado a quantidade de dias do m�s.
		 *Considere que para identificar os dias de fevereiro � necess�rio verificar se o ano � bissexto.*/
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o ano: ");
		int ano = teclado.nextInt();
		System.out.print("Digite o m�s: ");
		String mes = teclado.next();
		String verifica��o = mes.toLowerCase();
		switch (verifica��o) {
		case "janeiro": System.out.println("Janeiro possui 31 dias"); break;
		case "fevereiro":
			if ((ano%4 == 0 && ano%100 != 0) || (ano%400 == 0)) {
				System.out.printf("%d � bissexto, logo Fevereiro tem 29 dias", ano);
			}else{
				System.out.printf("%d n�o � bissexto, logo Fevereiro tem 28 dias", ano);
			}
			break;
		case "mar�o": System.out.println("Mar�o possui 31 dias"); break;
		case "abril": System.out.println("Abril possui 30 dias"); break;	
		case "maio": System.out.println("Maio possui 31 dias"); break;
		case "junho": System.out.println("Junho possui 30 dias"); break;
		case "julho": System.out.println("Julho possui 31 dias"); break;
		case "agosto": System.out.println("Agosto possui 31 dias"); break;
		case "setembro": System.out.println("Setembro possui 30 dias"); break;
		case "outubro": System.out.println("Outubro possui 31 dias"); break;
		case "novembro": System.out.println("Novembro possui 30 diias"); break;
		case "dezembro": System.out.println("Dezembro possui 31 dias"); break;
		default: System.out.println("O m�s digitado n�o existe");
		}

	}

}
