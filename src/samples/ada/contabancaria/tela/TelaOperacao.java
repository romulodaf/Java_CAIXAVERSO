package samples.ada.contabancaria.tela;

import samples.ada.contabancaria.Banco;

import java.util.Scanner;

public interface TelaOperacao {
	void execute(Scanner scanner, Banco banco);
}
