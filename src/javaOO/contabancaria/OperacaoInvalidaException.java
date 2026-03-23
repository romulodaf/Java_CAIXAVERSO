package javaOO.contabancaria;

public class OperacaoInvalidaException extends RuntimeException {
	public OperacaoInvalidaException(int operacao) {
		super(String.format("A operação %d é invalida. Escolha outra opção %n",operacao));
	}
}
