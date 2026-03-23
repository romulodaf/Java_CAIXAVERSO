package javaOO.contabancaria.tela;

import javaOO.contabancaria.Banco;
import javaOO.contabancaria.Conta;

import java.util.Scanner;

public class TelaOperacaoFazerTransferencia implements TelaOperacao {
    @Override
    public void execute(Scanner scanner, Banco banco) {
        System.out.println("Numero da conta de onde vai transferir");
        String numeroConta1 = scanner.next();
        Conta conta1 = banco.agencias().getFirst().getConta(numeroConta1);
        System.out.println("Numero da conta para onde vai transferir");
        String numeroConta2 = scanner.next();
        Conta conta2 = banco.agencias().getFirst().getConta(numeroConta2);
        System.out.println("Informe o valor da transferência");
        double valor = scanner.nextDouble();
        conta1.transferir(valor, conta2);
        //conta2.depositar(BigDecimal.valueOf(valor));
        System.out.println("Transferência realizada com sucesso");
    }
}
