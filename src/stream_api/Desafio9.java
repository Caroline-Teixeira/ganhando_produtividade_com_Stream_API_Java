package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {

    public static void main(String[] args) {
        
        /*- Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console. */
    
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.stream()
                .collect(Collectors.toSet()) // pega todos os numeros da lista e coloca num Set, sem repetições
                .size() == numeros.size(); // compara os tamanhos com a lista original. True se for igual

        System.out.println("Todos os números são distintos? " + todosDistintos);



}
}
