package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Desafio14 {

    public static void main(String[] args) {
        
        /*- Desafio 14 - Encontre o maior número primo da lista:
        Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console. */


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(numero -> ehPrimo(numero)) // filtra apenas os números primos                                      
                .max(Comparator.naturalOrder());     // pega o maior deles
        
        
        if (maiorPrimo.isPresent()) {
            System.out.println("Maior número primo: " + maiorPrimo.get());
        } else {
            System.out.println("Nenhum número primo encontrado na lista.");
        }
    }
    


    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false; // verifica se é maior que 1

            // Gera os números de 2 até a raiz quadrada do numero
            // e verifica se algum divide o numero
        return IntStream.rangeClosed(2, (int) Math.sqrt(numero))
            .noneMatch(i -> numero % i == 0); // se nenhum dividir, é primo


    }
}

/*IntStream.rangeClosed(inicio, fim) -gera uma sequência de números inteiros
 .noneMatch: É um método de terminal da Stream API que retorna:
                true se nenhum elemento da stream atender a condição.
                false se algum elemento atender.
*/ 

/*-------------------------------------------- */
/*"Se nenhum número de 2 até √numero for divisor de numero, então o numero é primo."
 * Math.sqrt(2) ≈ 1.41 ≈ 1
 * Math.sqrt(3) ≈ 1.73 ≈ 1
 * 
 * Como o range começa em 2, 1 < 2, vai retornar vazio -> true
 * 
 * Math.sqrt(4) = 2 -> IntStream.rangeClosed(2, 2) -> 4 % 2 == 0, então não é primo -> false
 * Math.sqrt(5) ≈ 2.24 -> IntStream.rangeClosed(2, 2) -> 4 % 2 != 0, então é primo -> true
 * ...
 */


/*-------------------------------------------- */


/*
 * public static boolean isPrimo(int n) {
    // Obtém o valor absoluto do número para garantir que seja positivo
    n = Math.abs(n);

    // Verifica se o número é menor ou igual a 1, caso contrário, não é primo
    if (n <= 1) {
        return false;
    }

    // Faz um loop de 2 até a raiz quadrada do número
    for (int i = 2; i * i <= n; i++) {
        // Se o número for divisível por algum valor no intervalo, não é primo
        if (n % i == 0) {
            return false;
        }
    }

    // Se não foi encontrado divisor no loop, o número é primo
    return true;
}
}
 * 
 * 
 * 
 * 
 */