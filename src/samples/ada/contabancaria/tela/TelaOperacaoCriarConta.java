package samples.ada.contabancaria.tela;

import samples.ada.contabancaria.Banco;
import samples.ada.contabancaria.Conta;
import samples.ada.contabancaria.PessoaFisica;

import java.util.Scanner;

public class TelaOperacaoCriarConta implements TelaOperacao {

	@Override
	public void execute(Scanner scanner, Banco banco) {
		System.out.println("Informe a identificação da usuário");
		String cpf = scanner.next();
		System.out.println("Informe o nome do usuário");
		String nome = scanner.next();
		var pessoa = new PessoaFisica(nome, cpf);
		System.out.println("Informe o tipo de conta");
		for (TipoContaTela tct : TipoContaTela.values()){
			System.out.printf("%d - %s %n", tct.getIdentificador(), tct.getDescricao());
		}
		var tipoContaTelaEscolhido = TipoContaTela.getByIdentificador(scanner.nextInt());
		Conta conta =  tipoContaTelaEscolhido.getContaSelecionada();
		conta.adicionarInformacoes(pessoa, banco.agencias().getFirst());
		banco.agencias().getFirst().addNovaConta(conta);
		System.out.println("Nova conta criada");
		System.out.printf("Cliente: %s %n Numero da conta: %s",
				conta.getCliente().getNome(),conta.getNumero());

	}
}
