package stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Desafio18 {

    public static void main(String[] args) {
        
        /* - Desafio 18 - Verifique se todos os números da lista são iguais:
        Utilizando a Stream API, verifique se todos os números da lista são iguais 
        e exiba o resultado no console. */
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
    Set<Integer> setNumeros = new HashSet<>();  // set: eliminar repetições
    List<Integer> numerosRepetidos = numeros.stream()  // percorre toda a lista
                .filter(n -> !setNumeros.add(n))  // compara o set com a lista original
                .toList();   // adiciona à nova lista os números repetidos
    System.out.println("Números repetidos: " + numerosRepetidos);

/* 
     if (setNumeros.size() == 1) { // é 1 porque set só permite um único valor
            System.out.println("Todos os números da lista são iguais.");
        } else {
            System.out.println("Nem todos os números da lista são iguais.");
        }*/

    }

}
