/**
 * Problema: Encontrar o Maior Elemento
 * 
 * Dado um array de números inteiros, retorne o maior elemento.
 * 
 * Exemplo 1:
 * Input: [3, 5, 1, 8, 2]
 * Output: 8
 * 
 * Exemplo 2:
 * Input: [10]
 * Output: 10
 * 
 * Exemplo 3:
 * Input: [1, 2, 3, 4, 5]
 * Output: 5
 * 
 * Este é um exercício MUITO básico para praticar:
 * - Como percorrer um array
 * - Como comparar números
 * - Como manter controle de uma variável
 */

class Solution {
    public int findMax(int[] nums) {
        // TODO: Implementar sua solução
        // 
        // Dica 1: Comece assumindo que o primeiro elemento é o maior
        // Dica 2: Percorra o resto do array
        // Dica 3: Se encontrar um número maior, atualize sua resposta
        //
        // Exemplo de estrutura:
        // int max = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] > max) {
        //         max = nums[i];
        //     }
        // }
        // return max;

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        
        return max; // Substitua pela sua implementação
    }
}

public class MaximumElement {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Array com números misturados
        int[] test1 = {3, 5, 1, 8, 2};
        int result1 = sol.findMax(test1);
        System.out.println("Teste 1: [3, 5, 1, 8, 2]");
        System.out.println("Resultado: " + result1 + " | Esperado: 8");
        System.out.println("Passou: " + (result1 == 8));
        System.out.println();
        
        // Teste 2: Array com um elemento
        int[] test2 = {10};
        int result2 = sol.findMax(test2);
        System.out.println("Teste 2: [10]");
        System.out.println("Resultado: " + result2 + " | Esperado: 10");
        System.out.println("Passou: " + (result2 == 10));
        System.out.println();
        
        // Teste 3: Array crescente
        int[] test3 = {1, 2, 3, 4, 5};
        int result3 = sol.findMax(test3);
        System.out.println("Teste 3: [1, 2, 3, 4, 5]");
        System.out.println("Resultado: " + result3 + " | Esperado: 5");
        System.out.println("Passou: " + (result3 == 5));
        System.out.println();
        
        // Teste 4: Array com números negativos
        int[] test4 = {-1, -5, -2, -8};
        int result4 = sol.findMax(test4);
        System.out.println("Teste 4: [-1, -5, -2, -8]");
        System.out.println("Resultado: " + result4 + " | Esperado: -1");
        System.out.println("Passou: " + (result4 == -1));
    }
}