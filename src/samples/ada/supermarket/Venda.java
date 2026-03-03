package samples.ada.supermarket;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;

public class Venda {
	private String idVenda;
	private HashSet<Item> itens;
	private LocalDate dataVenda;
	private Pessoa comprador;
	private Funcionario funcionario;

	public BigDecimal getPrecoFinal(){

		BigDecimal resultado = BigDecimal.ZERO;
		for (Item item : this.itens){
			itens.add(new Item());
			resultado = resultado.add(item.getValor());
		}
		return resultado;
	}

}
