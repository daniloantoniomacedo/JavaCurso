package com.danilo.cursojava.praticas;

import java.util.Scanner;

public class JavaPratica15 {

	public static void main(String[] args) {
		/*Elabore uma solução em JAVA para ler o nome e o seu endereço completo (separados por tipo: rua, numero, bairro, cep, cidade, estado) informados pelo usuário. A solução deve retornar para o usuário uma impressão de saída contendo o nome e o endereço completo informado. Para essa solução, cada elemento informado deve ser inserido em uma variável específica. O título da
		solução implementada deve ser CADASTRO DE USUARIO DO SISTEMA DE CONTROLE ALUNOS, inserido em uma constante.
		Obs: use o nº com o tipo int*/

		Scanner teclado = new Scanner(System.in);
		System.out.println("---CADASTRO DE USUÁRIO---");
		System.out.println("Qual seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Qual sua rua?");
		String rua = teclado.nextLine();
		System.out.println("Qual seu número?");
		int numero = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Qual seu bairro?");
		String bairro = teclado.nextLine();
		System.out.println("Qual seu cep? Digite sem pontos ou traços");
		int cep = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Qual sua cidade?");
		String cidade = teclado.nextLine();
		System.out.println("Qual seu estado?");
		String estado = teclado.nextLine();
		System.out.format("%s, seu endereço é: \n"
				+ "Rua: %s. \n"
				+ "Seu número é: %d \n"
				+ "Seu bairro é: %s \n"
				+ "Seu cep é: %s \n"
				+ "Sua cidade é: %s \n"
				+ "Seu estado é: %s \n", nome, rua, numero, bairro, cep, cidade, estado);
		
	}

}
