package samples.ada.contabancaria;

import java.math.BigDecimal;

public abstract sealed class Conta implements OperacoesBancarias permits ContaPoupanca, ContaSimples {
	private String numero;
	private Agencia agencia;
	private Pessoa cliente;
	private BigDecimal saldo;

	private void aplicarTaxaOperacao(){
		saldo = saldo.subtract(BigDecimal.valueOf(getTipoConta().getValorTarifa()));
		System.out.println(saldo);
	}

	@Override
	public void sacar(BigDecimal valor) {
		System.out.println("Sacar da classe conta");
		aplicarTaxaOperacao();
	}

	@Override
	public void sacar(double valor) {
		sacar(BigDecimal.valueOf(valor));
	}
	@Override
	public void sacar(int valor){
		sacar(BigDecimal.valueOf(valor));
	}

	@Override
	public void depositar(BigDecimal valor) {
		// TODO fazer algo
		aplicarTaxaOperacao();
	}

	@Override
	public void depositar(double valor) {
		depositar(BigDecimal.valueOf(valor));
	}

	@Override
	public void transferir(BigDecimal valor, Pessoa pessoa) {
		// TODO fazer algo
		aplicarTaxaOperacao();
	}

	@Override
	public void transferir(double valor, Conta conta) {
		transferir(BigDecimal.valueOf(valor), conta.getCliente());

	}

	protected abstract TipoConta getTipoConta();

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Pessoa getCliente() {
		return cliente;
	}
}
