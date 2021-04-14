package com.danilo.cursojava.praticas;

public class JavaPratica041 {

	public static void main(String[] args) {
		/*
		 * Elabore uma solução em java para calcular 
		 * a quantidade de numeros bissextos ocorridos entre o ano de 1900 e 2020.*/
		
		int MAX = 2020;
		int MIN = 1900;
		int ano = 1900;
		int countano = 0;
		
		while(ano<MAX && ano>=MIN) {
			if ((ano%4 == 0 && ano%100 != 0) || (ano%400 == 0)) {
				countano++;
				ano++;
			}
			ano++;
		}
		System.out.printf("entre 1900 e 2020 existem %d anos bissextos, dos 120 anos desse passados nesse período.", countano);
	}

}
