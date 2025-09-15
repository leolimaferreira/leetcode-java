/**
 * Problema: Verificar se Array está Ordenado
 * 
 * Dado um array de números, determine se ele está ordenado
 * em ordem crescente (ou igual).
 * 
 * Exemplo 1:
 * Input: [1, 2, 3, 4, 5]
 * Output: true
 * 
 * Exemplo 2:
 * Input: [1, 3, 2, 4]
 * Output: false
 * 
 * Exemplo 3:
 * Input: [5, 5, 5]
 * Output: true (elementos iguais são considerados ordenados)
 * 
 * Exemplo 4:
 * Input: [1, 2, 2, 3]
 * Output: true
 * 
 * Exemplo 5:
 * Input: []
 * Output: true (array vazio é considerado ordenado)
 * 
 * Exemplo 6:
 * Input: [10]
 * Output: true (um elemento só sempre está ordenado)
 * 
 * Este exercício pratica:
 * - Loop simples através do array
 * - Comparação entre elementos adjacentes
 * - Lógica de verificação com return antecipado
 * - Casos especiais (array vazio/um elemento)
 */

class Solution {
    public boolean isSorted(int[] nums) {
        // TODO: Implementar sua solução
        // 
        // Dica 1: Se o array tem 0 ou 1 elemento, sempre está ordenado
        // Dica 2: Compare cada elemento com o próximo
        // Dica 3: Se encontrar nums[i] > nums[i+1], retorne false imediatamente
        // Dica 4: Se chegou até o final sem problemas, retorne true

        if (nums.length == 0 || nums.length == 1) return true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) return false;
        }
        
        return true; // Substitua pela sua implementação
    }
}

public class CheckIfSorted {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Array ordenado crescente
        int[] test1 = {1, 2, 3, 4, 5};
        boolean result1 = sol.isSorted(test1);
        System.out.println("Teste 1: " + java.util.Arrays.toString(test1));
        System.out.println("Resultado: " + result1 + " | Esperado: true");
        System.out.println("Passou: " + (result1 == true));
        System.out.println();
        
        // Teste 2: Array não ordenado
        int[] test2 = {1, 3, 2, 4};
        boolean result2 = sol.isSorted(test2);
        System.out.println("Teste 2: " + java.util.Arrays.toString(test2));
        System.out.println("Resultado: " + result2 + " | Esperado: false");
        System.out.println("Passou: " + (result2 == false));
        System.out.println();
        
        // Teste 3: Todos os elementos iguais
        int[] test3 = {5, 5, 5};
        boolean result3 = sol.isSorted(test3);
        System.out.println("Teste 3: " + java.util.Arrays.toString(test3));
        System.out.println("Resultado: " + result3 + " | Esperado: true");
        System.out.println("Passou: " + (result3 == true));
        System.out.println();
        
        // Teste 4: Array com elementos repetidos ordenados
        int[] test4 = {1, 2, 2, 3};
        boolean result4 = sol.isSorted(test4);
        System.out.println("Teste 4: " + java.util.Arrays.toString(test4));
        System.out.println("Resultado: " + result4 + " | Esperado: true");
        System.out.println("Passou: " + (result4 == true));
        System.out.println();
        
        // Teste 5: Array vazio
        int[] test5 = {};
        boolean result5 = sol.isSorted(test5);
        System.out.println("Teste 5: " + java.util.Arrays.toString(test5));
        System.out.println("Resultado: " + result5 + " | Esperado: true");
        System.out.println("Passou: " + (result5 == true));
        System.out.println();
        
        // Teste 6: Um elemento só
        int[] test6 = {10};
        boolean result6 = sol.isSorted(test6);
        System.out.println("Teste 6: " + java.util.Arrays.toString(test6));
        System.out.println("Resultado: " + result6 + " | Esperado: true");
        System.out.println("Passou: " + (result6 == true));
        System.out.println();
        
        // Teste 7: Decrescente
        int[] test7 = {5, 4, 3, 2, 1};
        boolean result7 = sol.isSorted(test7);
        System.out.println("Teste 7: " + java.util.Arrays.toString(test7));
        System.out.println("Resultado: " + result7 + " | Esperado: false");
        System.out.println("Passou: " + (result7 == false));
    }
}