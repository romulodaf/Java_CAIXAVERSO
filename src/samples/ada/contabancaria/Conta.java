package samples.ada.contabancaria;

import java.math.BigDecimal;
import java.util.UUID;

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

	public String getNumero() {
		return numero;
	}

	public void adicionarInformacoes(Pessoa cliente, Agencia agencia ){
		this.cliente = cliente;
		this.agencia = agencia;
		this.saldo = BigDecimal.ZERO;
		this.numero = UUID.randomUUID().toString().substring(0, 4);
	}

	public BigDecimal getSaldo() {
		return saldo;
	}
}
