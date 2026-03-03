package samples.ada.contabancaria.tela;

import samples.ada.contabancaria.Banco;
import samples.ada.contabancaria.Conta;

import java.util.Scanner;

public class TelaOperacaoConsultarSaldo implements TelaOperacao{
	@Override
	public void execute(Scanner scanner, Banco banco) {
		System.out.println("Informe o número da conta");
		String numeroConta = scanner.next();

		Conta conta = banco.agencias().getFirst().getConta(numeroConta);
		System.out.println("Saldo da conta");
		System.out.printf("Cliente %s tem saldo %.2f %n", conta.getCliente().getNome(),
				conta.getSaldo());
	}
}
