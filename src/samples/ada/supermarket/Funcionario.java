package samples.ada.supermarket;

public class Funcionario extends PessoaFisica {
	private String matricula;
	private String nome;
	private Cargo cargo;

	public Funcionario(String matricula, String nome, Cargo cargo){
		super(nome, matricula);
		this.cargo = cargo;
	}

}
