package javaOO.oo1;

import javaOO.oo.exercicio1.Dependente;
import javaOO.oo.exercicio1.Empregado;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o nome do empregado");
		String nome = leitor.next();
		System.out.println("Informe a matricula do empregado");
		String matricula = leitor.next();
		Empregado meuEmpregado = new Empregado(nome, matricula);
		int sair = 0;
		do{
			System.out.println("Deseja adicionar um dependente?");
			System.out.println("1 - Sim; 0 - Não");
			sair = leitor.nextInt();
			if(sair == 0){
				break;
			}
			System.out.println("Informe o nome do dependente");
			String nomeDependente = leitor.next();
			System.out.println("Informe o cpf do dependente");
			String cpfDependente = leitor.next();
			Dependente dependenteEmpregado = new Dependente(nomeDependente, cpfDependente, meuEmpregado);
			meuEmpregado.addDependente(dependenteEmpregado);

		}while(sair!=0);
		System.out.println("Lista de dependentes");
		for (int i =0;i<meuEmpregado.getDependentes().length;i++){
			if(null!=meuEmpregado.getDependentes()[i]) {
				Dependente dependente = meuEmpregado.getDependentes()[i];
				System.out.println(String.format("Nome: %s CPF: %s", dependente.getNome(), dependente.getCpf()));
			}
		}
	}
}
