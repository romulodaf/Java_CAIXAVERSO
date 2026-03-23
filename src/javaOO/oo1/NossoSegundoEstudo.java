package javaOO.oo1;

import javaOO.oo.Conta;
import javaOO.oo.Pessoa;

public class NossoSegundoEstudo {
	public static void main(String[] args) {
		Conta minhaConta = new Conta(123, new Pessoa("Matheus"));
		minhaConta.depositar(600);
		minhaConta.sacar(500);
		System.out.println(minhaConta.getSaldo());
	}

}
