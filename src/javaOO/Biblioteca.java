package javaOO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Biblioteca {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Informe o nome do usuario");
        String nomeUsuario = leitor.next();
		System.out.println("Informe o nome do livro");
		String nomeLivro = leitor.next();
		System.out.println("Qual o tipo do usuário?");
		TipoUsuario tipoUsuarioSelecionado = obterTipoUsuario(leitor);;
		String resultado = """
				Nome do livro: %s
				Nome do usuário: %s
				Tipo do usuário: %s
				Total de dias: %d
				Data da devolução: %s
				""";
		LocalDate dataDevolucao = dataAtual.plusDays(tipoUsuarioSelecionado.numeroDias);
		System.out.println(String.format(resultado, nomeLivro, nomeUsuario,
				tipoUsuarioSelecionado.nomeImpresso,tipoUsuarioSelecionado.numeroDias,
				dataDevolucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
	}

	private static TipoUsuario obterTipoUsuario(Scanner leitor) {


		try {
			for (TipoUsuario tipoUsuario : TipoUsuario.values()) {
				System.out.printf("%s - %s %n", tipoUsuario.identificador, tipoUsuario.nomeImpresso);
			}
			String tipoUsuarioStr = leitor.next();
			return TipoUsuario.valueOfIdentificador(tipoUsuarioStr);
		} catch (Exception e) {
			System.err.println("Valor informado não correspondente");
			return obterTipoUsuario(leitor);
		}
	}

	public enum TipoUsuario{
		ALUNO("A", "Aluno",3),
		PROFESSOR("P", "Professor",10);

		private String identificador;
		private String nomeImpresso;
		private int numeroDias;
		private TipoUsuario(String identificador, String nomeImpresso, int numeroDias){
			this.identificador = identificador;
			this.nomeImpresso = nomeImpresso;
			this.numeroDias = numeroDias;
		}

		public static TipoUsuario valueOfIdentificador(String identificador) throws Exception{
			for (TipoUsuario tipoUsuario : TipoUsuario.values()) {
				if (tipoUsuario.identificador.equalsIgnoreCase(identificador)) {
					return tipoUsuario;
				}
			}
			throw new Exception("Sem valor informado");
		}
	}

	/*
	A biblioteca de uma universidade deseja fazer um algoritmo que leia o nome do
livro que será emprestado, o tipo de usuário (aluno ou professor) e possa
imprimir um recibo conforme mostrado a seguir. Considerar que o professor tem
10 dias para devolver o li
vro e o aluno tem 3 dias.
	 */
	//Resultado esperado
	/*
	*
	 Nome do Livro:
	 Nome do Usuário:
	 Tipo do Usuário:
	 Total de Dias:
	 Data da devolução:
	*
	*  */

}
