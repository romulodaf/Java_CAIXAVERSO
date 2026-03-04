package samples.ada.contabancaria;

import java.math.BigDecimal;

public sealed interface OperacoesBancarias permits Conta {

	boolean sacar(BigDecimal valor);
	boolean sacar(double valor);
	boolean sacar (int valor);
	boolean depositar(BigDecimal valor);
	boolean depositar(double valor);
	boolean depositar(int valor);
	boolean transferir(BigDecimal valor, Conta conta);
	boolean transferir(double valor, Conta conta);
}
