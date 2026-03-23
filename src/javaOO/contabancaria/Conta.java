package javaOO.contabancaria;

import java.math.BigDecimal;
import java.util.UUID;

public abstract sealed class Conta implements OperacoesBancarias permits ContaPoupanca, ContaSimples {
	private String numero;
	private Agencia agencia;
	private Pessoa cliente;
	private BigDecimal saldo;

	private void aplicarTaxaOperacao(){
		saldo = saldo.subtract(BigDecimal.valueOf(getTipoConta().getValorTarifa()));
		//System.out.println(saldo);
	}

	@Override
	public boolean sacar(BigDecimal valor) {
		if(!verificaValor(valor)){
			System.err.println("Valor Inválido");
			return false;
		}
		if(verificaSaldo(valor)) {
			aplicarTaxaOperacao();
			saldo = saldo.subtract(valor);
			return true;
		}else{
			System.err.println("saldo insufiente");
			return false;
		}
	}

	private boolean verificaSaldo(BigDecimal valor) {
		return saldo
				.compareTo(valor.add(BigDecimal.valueOf(getTipoConta().getValorTarifa()))) >= 0;
	}

	private boolean verificaValor(BigDecimal valor) {
		return valor.compareTo(BigDecimal.ZERO) > 0;
	}

	@Override
	public boolean sacar(double valor) {
		return sacar(BigDecimal.valueOf(valor));
	}
	@Override
	public boolean sacar(int valor){
		return sacar(BigDecimal.valueOf(valor));
	}

	@Override
	public boolean depositar(BigDecimal valor) {
		if(verificaValor(valor)) {
			saldo = saldo.add(valor);
		}else{
			System.err.println("Valor inválido.");
			return false;
		}
		//aplicarTaxaOperacao();
		return true;
	}

	@Override
	public boolean depositar(double valor) {
		return depositar(BigDecimal.valueOf(valor));
	}

	@Override
	public boolean depositar(int valor) {
		return depositar(BigDecimal.valueOf(valor));
	}

	@Override
	public boolean transferir(BigDecimal valor, Conta conta) {
		if(sacar(valor)) {
			conta.depositar(valor);
			return true;
		}
		// aplicarTaxaOperacao();
		return false;
	}

	@Override
	public boolean transferir(double valor, Conta conta) {
		return transferir(BigDecimal.valueOf(valor), conta);
	}

	protected abstract TipoConta getTipoConta();

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
