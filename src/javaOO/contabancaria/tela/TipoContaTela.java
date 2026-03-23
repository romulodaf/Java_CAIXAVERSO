package javaOO.contabancaria.tela;

import javaOO.contabancaria.Conta;
import javaOO.contabancaria.ContaPoupanca;
import javaOO.contabancaria.ContaSimples;

public enum TipoContaTela {
	POUPANCA(1, "Conta Poupança", new ContaPoupanca()),
	SIMPLES(2, "Conta Simples", new ContaSimples());

	private int identificador;
	private String descricao;
	private Conta contaSelecionada;

	 TipoContaTela (int identificador, String descricao, Conta contaSelecionada){
		this.contaSelecionada = contaSelecionada;
		this.descricao = descricao;
		this.identificador = identificador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getDescricao() {
		return descricao;
	}

	public Conta getContaSelecionada() {
		return contaSelecionada;
	}

	public static TipoContaTela getByIdentificador(int identificador){
		 for(TipoContaTela tct : values()){
			 if(tct.getIdentificador() == identificador){
				 return tct;
			 }
		 }
		 return TipoContaTela.SIMPLES;
	}
}
