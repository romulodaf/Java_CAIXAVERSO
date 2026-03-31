package tecnicasDeProgramacao.trabalhoFinal;

import java.io.BufferedReader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.stream.Stream;

public class MapeamentoDoCSV {

    public static void main(String[] args) {
        List<Transaction> transacoes = new ArrayList<>();
        try (BufferedReader leitor = Files.newBufferedReader(Path.of("bank_transactions_data_2.csv"))) {
            transacoes = leitor.lines()
                    .filter(valor -> valor.contains("TransactionID") == false)//Não processa a linha com os nomes dos campos
                    .map(Transaction::fromCSV)
                    .toList();

        } catch (Exception e) {
            System.out.println(e);
        }

        Analisador analisador = new Analisador(transacoes);
        //System.out.println("==================================================\n   RELATÓRIO DE TRANSAÇÕES BANCÁRIAS - SUMÁRIO\n==================================================");
        //System.out.println("Valor total de transaões processadas: " + analisador.getQuantidadeDeTransacoes());
        //System.out.printf("Valor total de movimentado: R$ %.2f\n", analisador.calcularValorTotalMovimentadoComFuture());
        //System.out.println("--------------------------------------------------\n" + "TOP 10 MAIORES TRANSAÇÕES:");
        //analisador.top10();
        System.out.println(analisador.saldoMedioPorProfissao());

    }
}

