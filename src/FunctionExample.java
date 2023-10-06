import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar a Function com uma classe anônima para dobrar todos os números
        Function<Integer, Integer> dobrar = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer numero) {
                return numero * 2;
            }
        };

        // Usar a função para dobrar todos os números e armazená-los em outra lista
        List<Integer> numerosDobrados = new ArrayList<>();
        for (Integer numero : numeros) {
            numerosDobrados.add(dobrar.apply(numero));
        }

        // Imprimir a lista de números dobrados
        for (Integer numeroDobrado : numerosDobrados) {
            System.out.println(numeroDobrado);
        }
    }
}