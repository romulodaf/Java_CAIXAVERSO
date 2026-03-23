package javaOO;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculaIdade {
	public static void main(String[] args) {
		/**
		 * Faça um algoritmo que receba nome,  data de nascimento
		 * e mostre a mensagem:
		 * "'Nome_da_pessoa' tem 'idade' anos"
		 */
		LocalDate dataAtual = LocalDate.now();
		//int anoAtual = 2026;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o nome");
		String nome = leitor.next();
		System.out.println("Informe data de nascimento no formato dd/MM/yyyy");
		String dataNascimentoStr = leitor.next();
		LocalDate dataNascimento = LocalDate
				.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		//int anoNascimento = leitor.nextInt();
		long idade = Period.between(dataNascimento, dataAtual).get(ChronoUnit.YEARS);
		//int idade = anoAtual - anoNascimento;

		String resultado= String.format("%s tem %d anos", nome, idade );// nome +" tem "+idade+" anos";

		System.out.println(resultado);
	}
}
