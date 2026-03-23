package javaOO.oo.exercicio1;

public class Empregado {
	private static final int LIMITE_DEPENDENTE = 5;
	private final String nome;
	private final String matricula;
	private Departamento departamento;
	private Dependente[] dependentes;
	private int quantidadeDependentes;

	public Empregado(String nome, String matricula){
		this.dependentes = new Dependente[LIMITE_DEPENDENTE];
		quantidadeDependentes = 0;
		this.nome = nome;
		this.matricula = matricula;
	}

	public void addDependente(Dependente dependente){
		validarDependente();
		dependentes[quantidadeDependentes]=dependente;
		quantidadeDependentes++;
	}
	private void validarDependente() {
		if(quantidadeDependentes >=LIMITE_DEPENDENTE){
			throw new RuntimeException("Limite excedido");
		}
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public Dependente[] getDependentes() {
		return dependentes;
	}
}
