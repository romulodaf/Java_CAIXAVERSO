package javaOO.contabancaria;

public class Pessoa {
	private String nome;
	private String identificador;
	private Endereco endereco;

	public Pessoa(String nome, String identificador){
		this.nome = nome;
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	protected String getIdentificador() {
		return identificador;
	}
}
