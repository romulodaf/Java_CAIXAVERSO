package samples.ada.contabancaria;

public final class ContaPoupanca extends Conta{


	@Override
	protected TipoConta getTipoConta() {
		System.out.printf("aplicando taxa de %.2f %n", TipoConta.POUPANCA.getValorTarifa());
		return TipoConta.POUPANCA;
	}

	@Override
	public void sacar(double valor) {
		System.out.println("Sacar realizado na classe ContaPoupanca");
	}
}
