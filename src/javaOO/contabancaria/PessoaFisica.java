package javaOO.contabancaria;

public class PessoaFisica extends Pessoa{
	public PessoaFisica(String nome, String identificador) {
		super(nome, identificador);
	}

	public String getCpf(){
		return getIdentificador();
	}
}
