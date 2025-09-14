/**
 * Problema: Encontrar o Menor Elemento
 * 
 * Dado um array de números inteiros, retorne o menor elemento.
 * 
 * Exemplo 1:
 * Input: [3, 5, 1, 8, 2]
 * Output: 1
 * 
 * Exemplo 2:
 * Input: [10]
 * Output: 10
 * 
 * Exemplo 3:
 * Input: [5, 4, 3, 2, 1]
 * Output: 1
 * 
 * Este é um exercício super básico para praticar:
 * - Percorrer um array
 * - Fazer comparações
 * - Manter uma variável atualizada
 */

class Solution {
    public int findMin(int[] nums) {
        // TODO: Implementar sua solução
        // 
        // Dica 1: Comece assumindo que o primeiro elemento é o menor
        // Dica 2: Compare cada elemento do array com seu menor atual
        // Dica 3: Se encontrar um menor, atualize sua variável

        int min = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
        }
        return min; // Substitua pela sua implementação
    }
}

public class MinimumElement {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Array com números misturados
        int[] test1 = {3, 5, 1, 8, 2};
        int result1 = sol.findMin(test1);
        System.out.println("Teste 1: [3, 5, 1, 8, 2]");
        System.out.println("Resultado: " + result1 + " | Esperado: 1");
        System.out.println("Passou: " + (result1 == 1));
        System.out.println();
        
        // Teste 2: Array com um elemento
        int[] test2 = {10};
        int result2 = sol.findMin(test2);
        System.out.println("Teste 2: [10]");
        System.out.println("Resultado: " + result2 + " | Esperado: 10");
        System.out.println("Passou: " + (result2 == 10));
        System.out.println();
        
        // Teste 3: Array decrescente
        int[] test3 = {5, 4, 3, 2, 1};
        int result3 = sol.findMin(test3);
        System.out.println("Teste 3: [5, 4, 3, 2, 1]");
        System.out.println("Resultado: " + result3 + " | Esperado: 1");
        System.out.println("Passou: " + (result3 == 1));
        System.out.println();
        
        // Teste 4: Array com números negativos
        int[] test4 = {-1, -5, -2, -8, -3};
        int result4 = sol.findMin(test4);
        System.out.println("Teste 4: [-1, -5, -2, -8, -3]");
        System.out.println("Resultado: " + result4 + " | Esperado: -8");
        System.out.println("Passou: " + (result4 == -8));
        System.out.println();
        
        // Teste 5: Todos iguais
        int[] test5 = {7, 7, 7, 7};
        int result5 = sol.findMin(test5);
        System.out.println("Teste 5: [7, 7, 7, 7]");
        System.out.println("Resultado: " + result5 + " | Esperado: 7");
        System.out.println("Passou: " + (result5 == 7));
    }
}