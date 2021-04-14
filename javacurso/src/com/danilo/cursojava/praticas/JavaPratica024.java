package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica024 {

	public static void main(String[] args) {
		/*Elabore uma solução para, a partir de valores correspondentes ao mês e ano informado pelo usuário, 
		 *seja apresentado a quantidade de dias do mês.
		 *Considere que para identificar os dias de fevereiro é necessário verificar se o ano é bissexto.*/
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o ano: ");
		int ano = teclado.nextInt();
		System.out.print("Digite o mês: ");
		String mes = teclado.next();
		String verificação = mes.toLowerCase();
		switch (verificação) {
		case "janeiro": System.out.println("Janeiro possui 31 dias"); break;
		case "fevereiro":
			if ((ano%4 == 0 && ano%100 != 0) || (ano%400 == 0)) {
				System.out.printf("%d é bissexto, logo Fevereiro tem 29 dias", ano);
			}else{
				System.out.printf("%d não é bissexto, logo Fevereiro tem 28 dias", ano);
			}
			break;
		case "março": System.out.println("Março possui 31 dias"); break;
		case "abril": System.out.println("Abril possui 30 dias"); break;	
		case "maio": System.out.println("Maio possui 31 dias"); break;
		case "junho": System.out.println("Junho possui 30 dias"); break;
		case "julho": System.out.println("Julho possui 31 dias"); break;
		case "agosto": System.out.println("Agosto possui 31 dias"); break;
		case "setembro": System.out.println("Setembro possui 30 dias"); break;
		case "outubro": System.out.println("Outubro possui 31 dias"); break;
		case "novembro": System.out.println("Novembro possui 30 diias"); break;
		case "dezembro": System.out.println("Dezembro possui 31 dias"); break;
		default: System.out.println("O mês digitado não existe");
		}

	}

}
