package javaOO.contabancaria.tela;

import javaOO.contabancaria.Banco;
import javaOO.contabancaria.Conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class TelaOperacaoFazerDeposito implements TelaOperacao {
    @Override
    public void execute(Scanner scanner, Banco banco) {
        System.out.println("Numero da conta");
        String numeroConta = scanner.next();
        Conta conta = banco.agencias().getFirst().getConta(numeroConta);
        System.out.println("Informe o valor do depósito");
        double valor = scanner.nextDouble();
        if(conta.depositar(BigDecimal.valueOf(valor))) {
            System.out.println("Deposito realizado com sucesso");
        }
    }
}
