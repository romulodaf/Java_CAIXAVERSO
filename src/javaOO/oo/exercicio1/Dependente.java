package javaOO.oo.exercicio1;

public class Dependente {
	private String nome;
	private String cpf;
	private Empregado empregado;

	public Dependente(String nome, String cpf, Empregado empregado) {
		this.nome = nome;
		this.cpf = cpf;
		this.empregado = empregado;
	}

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
