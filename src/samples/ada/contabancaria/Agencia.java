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

	public void addNovaConta(Conta conta){
		contas.add(conta);
	}

	public Conta getConta(String numeroConta){
		for(Conta conta : contas){
			if(conta.getNumero().equals(numeroConta.substring(0,4))){
				return conta;
			}
		}
	 throw new ContaNaoEncontradaException(numeroConta);
	}
}
