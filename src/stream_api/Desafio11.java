package stream_api;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collector;

public class Desafio11 {

    public static void main(String[] args) {
        
        /*
         * - Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

         */
    
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer quadrados = numeros.stream()
                                        .mapToInt(n -> n * n).sum();
                                        
        System.out.println("A soma dos quadrados é: " + quadrados);

        // OUTRA MANEIRA
        /*List<Integer> quadrados = numeros.stream()
                                        .map(n -> n * n)
                                        .toList();
        
        Integer soma = quadrados.stream()
                        .reduce(0, (a, b) -> a + b);

        System.out.println("A soma dos quadrados é: " + soma);*/
    
    
        }


}
