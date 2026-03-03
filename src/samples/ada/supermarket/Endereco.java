package samples.ada.supermarket;

public final class Endereco {
	private String rua;
	private String bairro;
	private String cep;
	private String numero;
	private String complemento;
	public Endereco(String rua, String bairro, String cep, String numero, String complemento) {
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getNumero() {
		return numero;
	}

	public String getCep() {
		return cep;
	}

	public String getBairro() {
		return bairro;
	}

	public String getRua() {
		return rua;
	}


}
