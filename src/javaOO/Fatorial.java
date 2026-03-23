package javaOO;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();
		int resultado = 1;
		/*for (int i = numero; i > 1; i--) {
			resultado = resultado * i;
		}*/
		/*while(numero > 1){
			resultado = resultado * numero;
			numero --;
		}*/

		System.out.println(fatorial(numero));
	}

	//recursividade
	public static int fatorial(int numero){
		if(numero <= 1){
			return 1;
		}
		return numero * fatorial(numero-1);
	}
}
