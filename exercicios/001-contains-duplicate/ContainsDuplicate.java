/**
 * LeetCode 217 - Contains Duplicate  
 * Difficulty: Easy (SUPER BÁSICO)
 * 
 * Problema:
 * Dado um array de números inteiros, retorne true se algum valor
 * aparecer pelo menos duas vezes no array, e retorne false se 
 * todos os elementos forem distintos.
 * 
 * Exemplo 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Explicação: O número 1 aparece duas vezes
 * 
 * Exemplo 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Explicação: Todos os números são diferentes
 * 
 * Exemplo 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * Explicação: Vários números se repetem
 * 
 * SUPER DICA PARA RESOLVER:
 * - Use dois loops (um dentro do outro)
 * - Compare cada elemento com todos os outros
 * - Se encontrar dois iguais, retorne true
 * - Se terminar sem encontrar, retorne false
 * 
 * EXEMPLO DE LÓGICA:
 * nums = [1,2,3,1]
 * i=0: nums[0]=1, compara com nums[1]=2 (diferentes), nums[2]=3 (diferentes), nums[3]=1 (IGUAIS!) → return true
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // TODO: Sua implementação aqui
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        
        return false; // Substitua pela sua implementação
    }
}

public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Tem duplicata
        int[] nums1 = {1, 2, 3, 1};
        boolean result1 = sol.containsDuplicate(nums1);
        System.out.println("Teste 1: [1,2,3,1]");
        System.out.println("Resultado: " + result1);
        System.out.println("Esperado: true (o 1 se repete)");
        System.out.println("Passou: " + (result1 == true));
        System.out.println();
        
        // Teste 2: Não tem duplicata
        int[] nums2 = {1, 2, 3, 4};
        boolean result2 = sol.containsDuplicate(nums2);
        System.out.println("Teste 2: [1,2,3,4]");
        System.out.println("Resultado: " + result2);
        System.out.println("Esperado: false (todos diferentes)");
        System.out.println("Passou: " + (result2 == false));
        System.out.println();
        
        // Teste 3: Array com muitas duplicatas
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result3 = sol.containsDuplicate(nums3);
        System.out.println("Teste 3: [1,1,1,3,3,4,3,2,4,2]");
        System.out.println("Resultado: " + result3);
        System.out.println("Esperado: true (vários números se repetem)");
        System.out.println("Passou: " + (result3 == true));
        System.out.println();
        
        // Teste 4: Array vazio
        int[] nums4 = {};
        boolean result4 = sol.containsDuplicate(nums4);
        System.out.println("Teste 4: [] (array vazio)");
        System.out.println("Resultado: " + result4);
        System.out.println("Esperado: false (não há elementos para duplicar)");
        System.out.println("Passou: " + (result4 == false));
        System.out.println();
        
        // Teste 5: Array com um elemento
        int[] nums5 = {1};
        boolean result5 = sol.containsDuplicate(nums5);
        System.out.println("Teste 5: [1] (um elemento)");
        System.out.println("Resultado: " + result5);
        System.out.println("Esperado: false (só um elemento não pode se duplicar)");
        System.out.println("Passou: " + (result5 == false));
        System.out.println();
        
        // Teste 6: Dois elementos iguais
        int[] nums6 = {5, 5};
        boolean result6 = sol.containsDuplicate(nums6);
        System.out.println("Teste 6: [5,5]");
        System.out.println("Resultado: " + result6);
        System.out.println("Esperado: true (dois 5s)");
        System.out.println("Passou: " + (result6 == true));
    }
}