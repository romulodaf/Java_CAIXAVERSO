package javaOO;

import java.util.Scanner;

public class CustoVendaEstruturaDecisao {

	/***
	 * Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se
	 * o valor da compra for menor que R$ 20,00; Caso contrário, o lucro será de 30%.
	 * O algoritmo deve receber o valor do
	 * produto e imprimir o valor da venda
	 *
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valorBruto;
		do {
			System.out.println("Informe o valor do produto");
			valorBruto = leitor.nextDouble();

			System.out.printf("O valor do produto final é %.2f %n",
					(valorBruto < 20 ? valorBruto * 1.45 : valorBruto * 1.3));



		}while(valorBruto > 0);
	}
}
