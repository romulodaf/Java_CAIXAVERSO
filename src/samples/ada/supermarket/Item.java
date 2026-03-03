package samples.ada.supermarket;

import java.math.BigDecimal;

public class Item {
	private Produto produto;
	private int quantidade;


	public BigDecimal getValor(){
		//produto.getValor() * quantidade
		return produto.getValor().multiply(BigDecimal.valueOf(quantidade));
	}
}
