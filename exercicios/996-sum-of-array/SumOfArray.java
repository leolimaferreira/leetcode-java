/**
 * Problema: Soma de Todos os Elementos
 * 
 * Dado um array de números inteiros, retorne a soma de todos os elementos.
 * 
 * Exemplo 1:
 * Input: [1, 2, 3, 4, 5]
 * Output: 15
 * 
 * Exemplo 2:
 * Input: [10]
 * Output: 10
 * 
 * Exemplo 3:
 * Input: [2, 4, 6]
 * Output: 12
 * 
 * Este é um exercício básico para praticar:
 * - Percorrer um array com loop
 * - Acumular valores em uma variável
 * - Operações matemáticas simples
 */

class Solution {
    public int sumArray(int[] nums) {
        // TODO: Implementar sua solução
        // 
        // Dica 1: Crie uma variável para guardar a soma total
        // Dica 2: Percorra todos os elementos do array
        // Dica 3: Adicione cada elemento na sua variável de soma

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        
        return sum; // Substitua pela sua implementação
    }
}

public class SumOfArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Array simples
        int[] test1 = {1, 2, 3, 4, 5};
        int result1 = sol.sumArray(test1);
        System.out.println("Teste 1: [1, 2, 3, 4, 5]");
        System.out.println("Resultado: " + result1 + " | Esperado: 15");
        System.out.println("Passou: " + (result1 == 15));
        System.out.println();
        
        // Teste 2: Array com um elemento
        int[] test2 = {10};
        int result2 = sol.sumArray(test2);
        System.out.println("Teste 2: [10]");
        System.out.println("Resultado: " + result2 + " | Esperado: 10");
        System.out.println("Passou: " + (result2 == 10));
        System.out.println();
        
        // Teste 3: Array com números pares
        int[] test3 = {2, 4, 6};
        int result3 = sol.sumArray(test3);
        System.out.println("Teste 3: [2, 4, 6]");
        System.out.println("Resultado: " + result3 + " | Esperado: 12");
        System.out.println("Passou: " + (result3 == 12));
        System.out.println();
        
        // Teste 4: Array com números negativos
        int[] test4 = {-1, -2, -3};
        int result4 = sol.sumArray(test4);
        System.out.println("Teste 4: [-1, -2, -3]");
        System.out.println("Resultado: " + result4 + " | Esperado: -6");
        System.out.println("Passou: " + (result4 == -6));
        System.out.println();
        
        // Teste 5: Array misto (positivos e negativos)
        int[] test5 = {5, -2, 3, -1};
        int result5 = sol.sumArray(test5);
        System.out.println("Teste 5: [5, -2, 3, -1]");
        System.out.println("Resultado: " + result5 + " | Esperado: 5");
        System.out.println("Passou: " + (result5 == 5));
    }
}