/**
 * Problema: Encontrar o Segundo Maior Elemento
 * 
 * Dado um array de números inteiros distintos (sem repetições),
 * retorne o segundo maior elemento do array.
 * 
 * Exemplo 1:
 * Input: [1, 3, 5, 2, 4]
 * Output: 4 (o maior é 5, o segundo maior é 4)
 * 
 * Exemplo 2:
 * Input: [10, 20]
 * Output: 10 (o maior é 20, o segundo maior é 10)
 * 
 * Exemplo 3:
 * Input: [7, 1, 9, 3]
 * Output: 7 (o maior é 9, o segundo maior é 7)
 * 
 * Este exercício pratica:
 * - Manter controle de duas variáveis simultaneamente
 * - Comparações múltiplas
 * - Lógica de ordenação parcial
 * - Raciocínio algorítmico
 */

class Solution {
    public int findSecondLargest(int[] nums) {
        // TODO: Implementar sua solução
        // 
        // Dica 1: Você precisa manter duas variáveis: maior e segundoMaior
        // Dica 2: Inicialize ambas com valores apropriados
        // Dica 3: Para cada elemento, compare e atualize as variáveis conforme necessário
        // Dica 4: Se um elemento é maior que o maior atual, atualize ambas variáveis
        // Dica 5: Se um elemento está entre o maior e o segundo maior, atualize só o segundo maior

        int max = nums[0];
        int secondMax = nums[1];

        if (max < secondMax) {
            int aux = max;
            max = secondMax;
            secondMax = aux;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                int aux = max;
                max = nums[i];
                secondMax = aux;
            }

            if (nums[i] < max && nums[i] > secondMax) secondMax = nums[i];
        }
        
        return secondMax; // Substitua pela sua implementação
    }
}

public class SecondLargest {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Array desordenado
        int[] test1 = {1, 3, 5, 2, 4};
        int result1 = sol.findSecondLargest(test1);
        System.out.println("Teste 1: [1, 3, 5, 2, 4]");
        System.out.println("Resultado: " + result1 + " | Esperado: 4");
        System.out.println("Passou: " + (result1 == 4));
        System.out.println();
        
        // Teste 2: Array com 2 elementos
        int[] test2 = {10, 20};
        int result2 = sol.findSecondLargest(test2);
        System.out.println("Teste 2: [10, 20]");
        System.out.println("Resultado: " + result2 + " | Esperado: 10");
        System.out.println("Passou: " + (result2 == 10));
        System.out.println();
        
        // Teste 3: Maior elemento no meio
        int[] test3 = {7, 1, 9, 3};
        int result3 = sol.findSecondLargest(test3);
        System.out.println("Teste 3: [7, 1, 9, 3]");
        System.out.println("Resultado: " + result3 + " | Esperado: 7");
        System.out.println("Passou: " + (result3 == 7));
        System.out.println();
        
        // Teste 4: Array crescente
        int[] test4 = {1, 2, 3, 4, 5};
        int result4 = sol.findSecondLargest(test4);
        System.out.println("Teste 4: [1, 2, 3, 4, 5]");
        System.out.println("Resultado: " + result4 + " | Esperado: 4");
        System.out.println("Passou: " + (result4 == 4));
        System.out.println();
        
        // Teste 5: Array decrescente
        int[] test5 = {50, 40, 30, 20, 10};
        int result5 = sol.findSecondLargest(test5);
        System.out.println("Teste 5: [50, 40, 30, 20, 10]");
        System.out.println("Resultado: " + result5 + " | Esperado: 40");
        System.out.println("Passou: " + (result5 == 40));
    }
}