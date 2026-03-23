package javaOO.supermarket;

public class FormatoIdentificadorInvalidoExcecao extends RuntimeException{
	private String tipoPessoa;
	public FormatoIdentificadorInvalidoExcecao(String tipoPessoa){
		super(String.format("Formato inválido para %s", tipoPessoa));
	}
}
