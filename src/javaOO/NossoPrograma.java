package javaOO;

import java.math.BigDecimal;
import java.util.Scanner;

public class NossoPrograma {

	public static void main(String[] args) {
		//TODO montar calculo para acrescimo de 20% de salario

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o nome do funcionario");
		String nomeFuncionario = leitor.next();
		System.out.println("Informe o valor do salário");
		double salario = leitor.nextDouble();
		double porcentagemAumento=1.2;
		double novoSalario = salario * porcentagemAumento;

		BigDecimal salarioBigdecimal = BigDecimal.valueOf(salario);
		BigDecimal porcentagemAumentoBigdecimal = BigDecimal.valueOf(1.2);
		BigDecimal novoSalarioBigdecimal = salarioBigdecimal.multiply(porcentagemAumentoBigdecimal);
		System.out.printf("Valor do novo salario do funcionario %s é  %.2f",nomeFuncionario,novoSalario);
	}
}