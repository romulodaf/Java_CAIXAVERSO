package samples.ada.contabancaria;

public enum Operacao {
CRIAR_CONTA(1, "Criar Conta"),
FAZER_SAQUE(2, "Fazer saque"),
FAZER_DEPOSITO(3, "Realizar deposito"),
FAZER_TRANSFERENCIA(4, "Realizar Transferencia");

	private int numeroOperacao;
	private String descricao;

	Operacao(int numeroOperacao, String descricao){
		this.numeroOperacao = numeroOperacao;
		this.descricao = descricao;
	}

	public static Operacao obterDoNumeroDeOperacao(int operacao) {
		throw new OperacaoInvalidaException(operacao);
	}

	public int getNumeroOperacao() {
		return numeroOperacao;
	}

	public String getDescricao() {
		return descricao;
	}
}
