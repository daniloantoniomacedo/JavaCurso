package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica019 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int MIN = 10;
		int MAX = 30;
		int MARCADOR = 1;
		while (MARCADOR == 1) {
			System.out.println("Qual o valor da primeira reta?");
			int reta1 = teclado.nextInt();
			System.out.println("Qual o valor da segunda reta?");
			int reta2 = teclado.nextInt();
			System.out.println("Qual o valaor da terceira reta?");
			int reta3 = teclado.nextInt();
			if ((MIN <= reta1) && (MIN <= reta2) && (MIN <= reta3) && (MAX >= reta1) && (MAX >= reta2) && (MAX >= reta3)){
				if ((Math.abs(reta1 - reta2) < reta3) && (reta3 < (reta1 + reta2))
				|| (Math.abs(reta1 - reta3) < reta2) && (reta2 < (reta1 + reta3)) 
				|| (Math.abs(reta2 - reta3) < reta3) && (reta3 < (reta2 + reta3))){
					if ((reta1 != reta2) &&
						(reta1 != reta3) &&
						reta2 != reta3) {
						System.out.println("O triângulo é escaleno.");
						MARCADOR = 0;
					}else if ((reta1 == reta2) &&
							  (reta1 == reta2) &&
							  (reta2 == reta3)){
						System.out.println("O triângulo é equilátero.");
						MARCADOR = 0;
					}else{
						System.out.println("O triângulo é isoceles");
						MARCADOR = 0;
					}
			}else{
				System.out.println("Esse programa aceita somente dados de 10 a 30.");
				MARCADOR = 1;
			}
		}
	  }
   }
}
