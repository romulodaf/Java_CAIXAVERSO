package samples.ada.oo;

public class NossoEstudoOO {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Claudia");
		Conta exemploConta = new Conta(123, pessoa);
		Conta exemplo2 = new Conta(123, 30, pessoa);
	}
}
