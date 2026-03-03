package samples.ada.contabancaria;

import java.math.BigDecimal;

public sealed interface OperacoesBancarias permits Conta {

	void sacar(BigDecimal valor);
	void sacar(double valor);
	void sacar (int valor);
	void depositar(BigDecimal valor);
	void depositar(double valor);
	void transferir(BigDecimal valor, Pessoa pessoa);
	void transferir(double valor, Conta conta);
}
