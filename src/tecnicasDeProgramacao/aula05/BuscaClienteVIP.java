package tecnicasDeProgramacao.aula05;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class BuscaClienteVIP {

    public static void main(String[] args) {
        Optional<BigDecimal> primeiroValorMaiorQue10mil =
                Stream.of(1500.00, 4500.00, 120000.00, 8000.00, 50_000.00)
                        .map(BigDecimal::valueOf)
                        .filter(valor -> valor.compareTo(BigDecimal.valueOf(10_000)) > 0)
                        .sorted()
                        .findFirst();
//                .toList();

        System.out.println(primeiroValorMaiorQue10mil);
    }
}