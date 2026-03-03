package samples.ada.oo;

public class Conta {
	private int numero;
	private double saldo;
	private Pessoa pessoa;
	Pessoa[] dependentes;

	public Conta(int numero, double saldoParam, Pessoa pessoa){
		this.numero = numero;
		this.saldo = saldoParam;
		this.pessoa = pessoa;
	}

	public Conta(int numero, Pessoa pessoa){
		this.numero = numero;
		this.saldo = 0.0;
		this.pessoa = pessoa;
	}

	public double sacar(double valor){
			validaSaldo(valor);
			saldo -= valor;
			return saldo;
	}

	private void validaSaldo(double valor){
		if(saldo<=valor){
			throw new RuntimeException("Saldo insuficiente");
		}
	}

	public double depositar(double valor){
		this.numero = 345;
		saldo +=valor;
		return saldo;
	}
	public double realizarEmprestimo(double valor){return 0;}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}
}
