package samples.ada.contabancaria.tela;

import samples.ada.contabancaria.Banco;
import samples.ada.contabancaria.Conta;

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
		conta.sacar(BigDecimal.valueOf(valor));
		System.out.println("Saque realizado com sucesso");
	}
}
