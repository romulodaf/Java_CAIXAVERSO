package samples.ada.supermarket;

public abstract class Pessoa implements ValidadorIdentificacao{
	private String nome;
	protected String identificador;
	private Endereco endereco;

	public Pessoa(String nome, String identificador){

		this.nome = nome;
		this.identificador = identificador;
		validateIdentificador();
	}

	public Endereco getEndereco() {
		return endereco;
	}

	@Override
	public void validarIdentificador() {

	}

	protected abstract void validateIdentificador();
}
