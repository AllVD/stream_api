import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T
 * É usada para realixar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */

 public class BinaryOperatorExample {

    public static void main(String[] args) {

        //Criar uma Lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //USar o BinaryOperator com expressão lambda para somar dois búemros inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        //Usar o BinaryOperator para  somar todos os núemros no Stream
        int resultado = numeros.stream()
            .reduce(0, somar);

        //Imprimir o resultado da soma
        System.out.println("A soma dos numeros e: " + resultado);    
    }
 }

