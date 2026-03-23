package javaOO;

import java.util.Scanner;

public class CustoVenda {
	public static void main(String[] args) {
		/*
			Um algoritmo que receba o preço de custo de
			um produto e mostre o valor de venda. Sabe-se que o preço de custo
			receberá um acréscimo de acordo com um percentual informado pelo
			usuário

		 */
		Scanner leitor = new Scanner(System.in);
		System.out.println("Nome do produto");
		// produto
		String nomeProduto = leitor.next();
		System.out.println("Informe o preco de custo");
		//preco de custo
		double precoCusto = leitor.nextDouble();
		System.out.println("Percentual de lucro");
		// valor percentual
		double percentual = leitor.nextDouble();
		double porcentagemCalculada = percentual/100 + 1;
		double valorFinal = precoCusto*porcentagemCalculada;

		// O valor final do produto xx de custo yy é zz

		System.out.printf("O valor final do produto %s de custo %.2f é %.2f %n", nomeProduto, precoCusto,valorFinal);
	}
}
