package samples.ada.contabancaria;

public final class ContaSimples extends Conta{


	@Override
	protected TipoConta getTipoConta() {
		System.out.printf("aplicando taxa de %.2f %n", TipoConta.SIMPLES.getValorTarifa());
		return TipoConta.SIMPLES;
	}
}
