package samples.ada.contabancaria;

import samples.ada.contabancaria.tela.EscolhaTelaOperacao;
import samples.ada.contabancaria.tela.TelaOperacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainContas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Agencia agencia = new Agencia("0001", "Agencia unica");
		List<Agencia> agenciaList = new ArrayList<>();
		agenciaList.add(agencia);
		Banco banco = new Banco("Banco", agenciaList);
		int sair = 0;
		do{
			System.out.println("O que gostaria de fazer?");
			for (Operacao operacao: Operacao.values()){
				System.out.printf("%d - %s %n", operacao.getNumeroOperacao(), operacao.getDescricao());
			}
			sair = scanner.nextInt();
			Operacao operacaoEscolhida = Operacao.obterDoNumeroDeOperacao(sair);
			TelaOperacao telaOperacao = EscolhaTelaOperacao.obterTelaOperacao(operacaoEscolhida);
			telaOperacao.execute(scanner, banco);
		}while(sair !=0);


	}
}
