package samples.ada.supermarket;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(String nome, String identificador){
		super(nome, identificador);
	}
	public String getCPF(){
		return this.identificador;
	}

	@Override
	protected void validateIdentificador(){
		if(this.identificador.length()!=11){
			throw new FormatoIdentificadorInvalidoExcecao("Pessoa Fisica");
		}
	}

}
