package samples.ada.supermarket;

public class PessoaJuridica extends Pessoa {

	public PessoaJuridica(String nomeFantasia, String cnpj){
		super(nomeFantasia, cnpj);
	}

	@Override
	protected void validateIdentificador() {
		if(this.identificador.length()!=14){
			throw new FormatoIdentificadorInvalidoExcecao("Pessoa Juridica");
		}
	}

	public String getCNPJ(){
		return this.identificador;
	}
}
