package samples.ada.contabancaria;

public class ContaNaoEncontradaException extends RuntimeException {
	public ContaNaoEncontradaException(String numeroConta) {
		super(String.format("Conta %s não encontrada", numeroConta));
	}
}
