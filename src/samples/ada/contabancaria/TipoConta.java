package samples.ada.contabancaria;

public enum TipoConta {
	POUPANCA(0.5),
	SIMPLES(1.2);

	private double valorTarifa;
	TipoConta(double tarifa){
		this.valorTarifa = tarifa;
	}

	public double getValorTarifa() {
		return valorTarifa;
	}
}
