package samples.ada.supermarket;

import java.math.BigDecimal;

public class Produto {
	private String sku;
	private BigDecimal valor;
	private String nome;
	private int quantidadeEstoque;
	private Unidade unidade;

	public BigDecimal getValor() {
		return valor;
	}
}
