package javaOO;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculoSalario {
	public static void main(String[] args) {
		/**
		 *Um algoritmo que teria o objetivo de calcular o
		 * valor diário de um salário. Seguindo uma lógica simples,
		 * teríamos que dividir o valor do salário mínimo (ex: sabemos ser
		 * equivalente a R$ 360,00) e dividir esse total de dias do mês atual
		 *
		 */
		Scanner leitor = new Scanner(System.in);
		LocalDate localDate = LocalDate.now();
		int dias = localDate.lengthOfMonth();
		System.out.println("Qual o valor do salario mensal");
		double salario = leitor.nextDouble();
		double salarioMensal = salario/dias;
		System.out.println(String.format("Salario de %.2f terá valor diario de %.2f", salario , salarioMensal));

	}
}
