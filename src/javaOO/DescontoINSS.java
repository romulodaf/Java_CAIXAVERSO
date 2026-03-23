package javaOO;

import java.util.Scanner;

public class DescontoINSS {
	/*
	Entrar com o salário de uma pessoa e imprimir o desconto do INSS segundo a
tabela a seguir
		cenários:
		Menor ou igual a R$ 600,00 - Isento
		Maior que R$ 600,00 e menor ou igual a
1200,00 - 20%
        Maior que R$ 1200,00 e menor ou igual a
       2000,00 - 25%
       Maior que R$ 2000,00 - 30%

	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o salario");
		double salario = leitor.nextDouble();
		double deducao;
		if(salario<=600){
			deducao=0;


		}else if(salario <= 1200){
			deducao = 0.2;
		}else if(salario<=2000){
			deducao = 0.25;
		}else{
			deducao = 0.3;
		}
		System.out.println(
				String.format("Valor do salario %.2f a ser deduzido é de %.2f"
						, salario, (salario * deducao)));

	}
}
