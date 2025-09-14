/**
 * Problema: Encontrar Índice de um Elemento
 * 
 * Dado um array de números inteiros e um número target,
 * retorne o índice (posição) onde o target aparece pela primeira vez.
 * Se o target não existir no array, retorne -1.
 * 
 * Exemplo 1:
 * Input: nums = [10, 20, 30, 40], target = 30
 * Output: 2 (30 está na posição 2)
 * 
 * Exemplo 2:
 * Input: nums = [5, 8, 3], target = 8
 * Output: 1 (8 está na posição 1)
 * 
 * Exemplo 3:
 * Input: nums = [1, 2, 3], target = 5
 * Output: -1 (5 não existe no array)
 * 
 * Este exercício pratica:
 * - Conceito de índices em arrays (começam em 0)
 * - Busca com retorno de posição
 * - Retorno de valor especial (-1) quando não encontra
 */

class Solution {
    public int findIndex(int[] nums, int target) {
        // TODO: Implementar sua solução
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }

        return -1; // Substitua pela sua implementação
    }
}

public class FindIndex {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Elemento no meio
        int[] test1 = {10, 20, 30, 40};
        int result1 = sol.findIndex(test1, 30);
        System.out.println("Teste 1: [10, 20, 30, 40], target = 30");
        System.out.println("Resultado: " + result1 + " | Esperado: 2");
        System.out.println("Passou: " + (result1 == 2));
        System.out.println();
        
        // Teste 2: Primeiro elemento
        int[] test2 = {5, 8, 3};
        int result2 = sol.findIndex(test2, 5);
        System.out.println("Teste 2: [5, 8, 3], target = 5");
        System.out.println("Resultado: " + result2 + " | Esperado: 0");
        System.out.println("Passou: " + (result2 == 0));
        System.out.println();
        
        // Teste 3: Último elemento
        int[] test3 = {5, 8, 3};
        int result3 = sol.findIndex(test3, 3);
        System.out.println("Teste 3: [5, 8, 3], target = 3");
        System.out.println("Resultado: " + result3 + " | Esperado: 2");
        System.out.println("Passou: " + (result3 == 2));
        System.out.println();
        
        // Teste 4: Elemento não existe
        int[] test4 = {1, 2, 3};
        int result4 = sol.findIndex(test4, 5);
        System.out.println("Teste 4: [1, 2, 3], target = 5");
        System.out.println("Resultado: " + result4 + " | Esperado: -1");
        System.out.println("Passou: " + (result4 == -1));
        System.out.println();
        
        // Teste 5: Array com um elemento que existe
        int[] test5 = {42};
        int result5 = sol.findIndex(test5, 42);
        System.out.println("Teste 5: [42], target = 42");
        System.out.println("Resultado: " + result5 + " | Esperado: 0");
        System.out.println("Passou: " + (result5 == 0));
    }
}