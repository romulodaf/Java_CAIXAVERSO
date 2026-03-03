package samples.ada.contabancaria;


import java.util.Collection;
import java.util.LinkedList;

public class Agencia {
	private String numero;
	private String nome;
	private Collection<Conta> contas;

	public Agencia(String numero, String nome){
		this.nome = nome;
		this.numero = numero;
		contas =  new LinkedList<>();
	}
}
