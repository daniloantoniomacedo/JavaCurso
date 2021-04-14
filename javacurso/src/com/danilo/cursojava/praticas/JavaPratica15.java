package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica15 {

	public static void main(String[] args) {
		/*Elabore uma solu��o em JAVA para ler o nome e o seu endere�o completo (separados por tipo: rua, numero, bairro, cep, cidade, estado) informados pelo usu�rio. A solu��o deve retornar para o usu�rio uma impress�o de sa�da contendo o nome e o endere�o completo informado. Para essa solu��o, cada elemento informado deve ser inserido em uma vari�vel espec�fica. O t�tulo da
		solu��o implementada deve ser CADASTRO DE USUARIO DO SISTEMA DE CONTROLE ALUNOS, inserido em uma constante.
		Obs: use o n� com o tipo int*/

		Scanner teclado = new Scanner(System.in);
		System.out.println("---CADASTRO DE USU�RIO---");
		System.out.println("Qual seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Qual sua rua?");
		String rua = teclado.nextLine();
		System.out.println("Qual seu n�mero?");
		int numero = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Qual seu bairro?");
		String bairro = teclado.nextLine();
		System.out.println("Qual seu cep? Digite sem pontos ou tra�os");
		int cep = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Qual sua cidade?");
		String cidade = teclado.nextLine();
		System.out.println("Qual seu estado?");
		String estado = teclado.nextLine();
		System.out.format("%s, seu endere�o �: \n"
				+ "Rua: %s. \n"
				+ "Seu n�mero �: %d \n"
				+ "Seu bairro �: %s \n"
				+ "Seu cep �: %s \n"
				+ "Sua cidade �: %s \n"
				+ "Seu estado �: %s \n", nome, rua, numero, bairro, cep, cidade, estado);
		
	}

}
