import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Nodes.collect;

public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com uma classe anônima para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, Seja Bem-vindo(a)!";

        // Usar o Supplier para obter uma lista com 5 saudações
        int maxSize;
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, Seja Bem-vindo(a)!")
                .limit(maxSize:5)
                .toList();

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}

