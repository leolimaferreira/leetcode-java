/**
 * Problema: Verificar se Array Contém Número
 * 
 * Dado um array de números inteiros e um número target, 
 * retorne true se o array contém o target, false caso contrário.
 * 
 * Exemplo 1:
 * Input: nums = [1, 2, 3, 4, 5], target = 3
 * Output: true
 * 
 * Exemplo 2:
 * Input: nums = [1, 2, 3, 4, 5], target = 6
 * Output: false
 * 
 * Exemplo 3:
 * Input: nums = [10], target = 10
 * Output: true
 * 
 * Este exercício pratica:
 * - Percorrer arrays
 * - Fazer comparações
 * - Retornar valores boolean (true/false)
 * - Conceito de busca linear
 */

class Solution {
    public boolean contains(int[] nums, int target) {
        // TODO: Implementar sua solução
        // 
        // Dica 1: Percorra todos os elementos do array
        // Dica 2: Compare cada elemento com o target
        // Dica 3: Se encontrar, retorne true imediatamente
        // Dica 4: Se terminar o loop sem encontrar, retorne false

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return true;
        }
        
        return false; // Substitua pela sua implementação
    }
}

public class ArrayContains {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Elemento existe no meio
        int[] test1 = {1, 2, 3, 4, 5};
        boolean result1 = sol.contains(test1, 3);
        System.out.println("Teste 1: [1, 2, 3, 4, 5], target = 3");
        System.out.println("Resultado: " + result1 + " | Esperado: true");
        System.out.println("Passou: " + (result1 == true));
        System.out.println();
        
        // Teste 2: Elemento não existe
        int[] test2 = {1, 2, 3, 4, 5};
        boolean result2 = sol.contains(test2, 6);
        System.out.println("Teste 2: [1, 2, 3, 4, 5], target = 6");
        System.out.println("Resultado: " + result2 + " | Esperado: false");
        System.out.println("Passou: " + (result2 == false));
        System.out.println();
        
        // Teste 3: Array com um elemento que existe
        int[] test3 = {10};
        boolean result3 = sol.contains(test3, 10);
        System.out.println("Teste 3: [10], target = 10");
        System.out.println("Resultado: " + result3 + " | Esperado: true");
        System.out.println("Passou: " + (result3 == true));
        System.out.println();
        
        // Teste 4: Primeiro elemento
        int[] test4 = {7, 2, 9, 1};
        boolean result4 = sol.contains(test4, 7);
        System.out.println("Teste 4: [7, 2, 9, 1], target = 7");
        System.out.println("Resultado: " + result4 + " | Esperado: true");
        System.out.println("Passou: " + (result4 == true));
        System.out.println();
        
        // Teste 5: Último elemento
        int[] test5 = {7, 2, 9, 1};
        boolean result5 = sol.contains(test5, 1);
        System.out.println("Teste 5: [7, 2, 9, 1], target = 1");
        System.out.println("Resultado: " + result5 + " | Esperado: true");
        System.out.println("Passou: " + (result5 == true));
    }
}