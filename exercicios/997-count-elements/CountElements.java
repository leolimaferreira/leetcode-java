/**
 * Problema: Contar Elementos
 * 
 * Dado um array de números inteiros, conte quantos elementos existem no array.
 * 
 * Exemplo 1:
 * Input: [1, 2, 3, 4, 5]
 * Output: 5
 * 
 * Exemplo 2:
 * Input: [10]
 * Output: 1
 * 
 * Exemplo 3:
 * Input: [7, 7, 7]
 * Output: 3
 * 
 * Este é um exercício super básico para praticar:
 * - Entender o conceito de array.length
 * - Trabalhar com retorno de valores
 * - Conceitos fundamentais de arrays
 */

class Solution {
    public int countElements(int[] nums) {
        // TODO: Implementar sua solução
        // 
        // Dica: Arrays em Java têm uma propriedade especial que você pode usar
        
        return nums.length; // Substitua pela sua implementação
    }
}

public class CountElements {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Array com 5 elementos
        int[] test1 = {1, 2, 3, 4, 5};
        int result1 = sol.countElements(test1);
        System.out.println("Teste 1: [1, 2, 3, 4, 5]");
        System.out.println("Resultado: " + result1 + " | Esperado: 5");
        System.out.println("Passou: " + (result1 == 5));
        System.out.println();
        
        // Teste 2: Array com 1 elemento
        int[] test2 = {10};
        int result2 = sol.countElements(test2);
        System.out.println("Teste 2: [10]");
        System.out.println("Resultado: " + result2 + " | Esperado: 1");
        System.out.println("Passou: " + (result2 == 1));
        System.out.println();
        
        // Teste 3: Array com elementos repetidos
        int[] test3 = {7, 7, 7};
        int result3 = sol.countElements(test3);
        System.out.println("Teste 3: [7, 7, 7]");
        System.out.println("Resultado: " + result3 + " | Esperado: 3");
        System.out.println("Passou: " + (result3 == 3));
        System.out.println();
        
        // Teste 4: Array maior
        int[] test4 = {1, 5, 3, 8, 2, 9, 4, 7, 6};
        int result4 = sol.countElements(test4);
        System.out.println("Teste 4: [1, 5, 3, 8, 2, 9, 4, 7, 6]");
        System.out.println("Resultado: " + result4 + " | Esperado: 9");
        System.out.println("Passou: " + (result4 == 9));
    }
}