package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Desafio17 {

    public static void main(String[] args) {
        
        /*- Desafio 17 - Filtrar os números primos da lista:
Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console. */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primos = numeros.stream()
                        .filter(numero -> ehPrimo(numero))
                        .toList();

        System.out.println("Lista de números primos: " + primos);
  
    }
    // Método: explicação desafio 14
    public static boolean ehPrimo(int numero) {
         if (numero <= 1) return false; // verifica se é maior que 1


        return IntStream.rangeClosed(2, (int) Math.sqrt(numero))
            .noneMatch(i -> numero % i == 0); // se nenhum dividir, é primo
    }
}
