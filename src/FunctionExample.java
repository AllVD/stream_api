import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * é utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 * 
 */
public class FunctionExample {
    
    public static void main(String[] args) {
    //Criar uma lista de numeros inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 25);

    //Usar a Function com expressão lambda para dobrar todos os numeros
    Function<Integer, Integer> dobrar = numero -> numero * 2;

    //Usar a Função para dobrar todos os numeros no Stream e armazena-los em outra lista
    List<Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
        .collect(Collectors.toList());

        //Imprimir a lista de numeros dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
