/**
 * Problema: Contar Números Pares
 * 
 * Dado um array de números inteiros, conte quantos números pares existem.
 * Um número é par quando é divisível por 2 (resto da divisão por 2 é zero).
 * 
 * Exemplo 1:
 * Input: [1, 2, 3, 4, 5, 6]
 * Output: 3 (os números 2, 4, 6 são pares)
 * 
 * Exemplo 2:
 * Input: [1, 3, 5]
 * Output: 0 (nenhum número par)
 * 
 * Exemplo 3:
 * Input: [2, 4, 6, 8]
 * Output: 4 (todos são pares)
 * 
 * Este exercício pratica:
 * - Operador módulo (%) para verificar resto da divisão
 * - Contador de elementos que atendem uma condição
 * - Estruturas condicionais (if)
 */

class Solution {
    public int countEvenNumbers(int[] nums) {
        // TODO: Implementar sua solução
        // 
       
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) evenCount++;
        }

        return evenCount; // Substitua pela sua implementação
    }
}

public class EvenNumbersCount {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Array misto
        int[] test1 = {1, 2, 3, 4, 5, 6};
        int result1 = sol.countEvenNumbers(test1);
        System.out.println("Teste 1: [1, 2, 3, 4, 5, 6]");
        System.out.println("Resultado: " + result1 + " | Esperado: 3");
        System.out.println("Passou: " + (result1 == 3));
        System.out.println();
        
        // Teste 2: Só números ímpares
        int[] test2 = {1, 3, 5};
        int result2 = sol.countEvenNumbers(test2);
        System.out.println("Teste 2: [1, 3, 5]");
        System.out.println("Resultado: " + result2 + " | Esperado: 0");
        System.out.println("Passou: " + (result2 == 0));
        System.out.println();
        
        // Teste 3: Só números pares
        int[] test3 = {2, 4, 6, 8};
        int result3 = sol.countEvenNumbers(test3);
        System.out.println("Teste 3: [2, 4, 6, 8]");
        System.out.println("Resultado: " + result3 + " | Esperado: 4");
        System.out.println("Passou: " + (result3 == 4));
        System.out.println();
        
        // Teste 4: Array com zero (zero é par!)
        int[] test4 = {0, 1, 2};
        int result4 = sol.countEvenNumbers(test4);
        System.out.println("Teste 4: [0, 1, 2]");
        System.out.println("Resultado: " + result4 + " | Esperado: 2");
        System.out.println("Passou: " + (result4 == 2));
        System.out.println();
        
        // Teste 5: Números negativos
        int[] test5 = {-2, -1, 0, 1, 2};
        int result5 = sol.countEvenNumbers(test5);
        System.out.println("Teste 5: [-2, -1, 0, 1, 2]");
        System.out.println("Resultado: " + result5 + " | Esperado: 3");
        System.out.println("Passou: " + (result5 == 3));
    }
}