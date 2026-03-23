package javaOO.contabancaria.tela;

import javaOO.contabancaria.Operacao;

public class EscolhaTelaOperacao {

	public static TelaOperacao obterTelaOperacao(Operacao operacao){
		return switch (operacao){
			case CRIAR_CONTA ->  new TelaOperacaoCriarConta();
			case CONSULTAR_SALDO -> new TelaOperacaoConsultarSaldo();
			case FAZER_SAQUE -> new TelaOperacaoFazerSaque();
			case FAZER_DEPOSITO -> new TelaOperacaoFazerDeposito();
			case FAZER_TRANSFERENCIA -> new TelaOperacaoFazerTransferencia();
			default -> (scanner, banco) -> System.out.println("Opcao invalida");
		};
	}
}
