package javaOO.contabancaria.tela;

import javaOO.contabancaria.Banco;
import javaOO.contabancaria.Conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class TelaOperacaoFazerSaque implements TelaOperacao {

	@Override
	public void execute(Scanner scanner, Banco banco) {
		System.out.println("Numero da conta");
		String numeroConta = scanner.next();
		Conta conta = banco.agencias().getFirst().getConta(numeroConta);
		System.out.println("Informe o valor do saque");
		double valor = scanner.nextDouble();
		if(conta.sacar(BigDecimal.valueOf(valor))) {
			System.out.println("Saque realizado com sucesso");
		}
	}
}
