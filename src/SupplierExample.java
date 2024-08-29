import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
 * Representa uma operação  que não aceita nenhum argumento e retorna um rsultado do tipo T.
 *  é comumente usada para criar ou fornecer bnovos
 * 
 */

public class SupplierExample {
    public static void main(String[] args) throws Exception {
        //Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Ola seja bem-vindo(a)!";

        //USar o Supllier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Ola seja bem-vindo";)
            .limit(5)
            .toList();

        //Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
