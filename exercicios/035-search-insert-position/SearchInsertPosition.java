/**
 * LeetCode 35 - Search Insert Position
 * Difficulty: Easy
 * 
 * Problema:
 * Dado um array ordenado de inteiros distintos e um valor target, retorne o 
 * índice se o target for encontrado. Se não for encontrado, retorne o índice 
 * onde ele seria inserido em ordem.
 * 
 * Você deve escrever um algoritmo com complexidade de tempo O(log n).
 * 
 * Exemplo 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Explicação: 5 está no índice 2
 * 
 * Exemplo 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Explicação: 2 deveria ser inserido no índice 1
 * 
 * Exemplo 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * Explicação: 7 deveria ser inserido no índice 4 (final do array)
 * 
 * Exemplo 4:
 * Input: nums = [1,3,5,6], target = 0
 * Output: 0
 * Explicação: 0 deveria ser inserido no índice 0 (início do array)
 * 
 * Restrições:
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 * - nums contém valores distintos ordenados em ordem crescente
 * - -10^4 <= target <= 10^4
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        // TODO: Implementar sua solucao
        // VERSÃO SIMPLES (O(n)): Percorra o array e encontre a posição
        // Dica 1: Se nums[i] >= target, retorne i
        // Dica 2: Se chegou ao final, retorne nums.length
        
        // VERSÃO AVANÇADA (O(log n)): Use busca binária
        // Dica 3: Use dois ponteiros: left = 0, right = nums.length - 1
        // Dica 4: Calcule mid = (left + right) / 2
        // Dica 5: Se nums[mid] == target, retorne mid
        // Dica 6: Se nums[mid] < target, busque na metade direita
        // Dica 7: Se nums[mid] > target, busque na metade esquerda
        
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) return mid;

            else if (nums[mid] < target) {
                left = mid + 1;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return left; // Substitua pela sua implementacao
    }
}

public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: nums = [1,3,5,6], target = 5
        int[] test1 = {1, 3, 5, 6};
        int result1 = sol.searchInsert(test1, 5);
        System.out.println("Teste 1: " + java.util.Arrays.toString(test1) + ", target = 5");
        System.out.println("Resultado: " + result1);
        System.out.println("Esperado: 2 (5 está no índice 2)");
        System.out.println("Passou: " + (result1 == 2));
        System.out.println();
        
        // Teste 2: nums = [1,3,5,6], target = 2
        int[] test2 = {1, 3, 5, 6};
        int result2 = sol.searchInsert(test2, 2);
        System.out.println("Teste 2: " + java.util.Arrays.toString(test2) + ", target = 2");
        System.out.println("Resultado: " + result2);
        System.out.println("Esperado: 1 (2 seria inserido antes do 3)");
        System.out.println("Passou: " + (result2 == 1));
        System.out.println();
        
        // Teste 3: nums = [1,3,5,6], target = 7
        int[] test3 = {1, 3, 5, 6};
        int result3 = sol.searchInsert(test3, 7);
        System.out.println("Teste 3: " + java.util.Arrays.toString(test3) + ", target = 7");
        System.out.println("Resultado: " + result3);
        System.out.println("Esperado: 4 (7 seria inserido no final)");
        System.out.println("Passou: " + (result3 == 4));
        System.out.println();
        
        // Teste 4: nums = [1,3,5,6], target = 0
        int[] test4 = {1, 3, 5, 6};
        int result4 = sol.searchInsert(test4, 0);
        System.out.println("Teste 4: " + java.util.Arrays.toString(test4) + ", target = 0");
        System.out.println("Resultado: " + result4);
        System.out.println("Esperado: 0 (0 seria inserido no início)");
        System.out.println("Passou: " + (result4 == 0));
        System.out.println();
        
        // Teste 5: nums = [1], target = 1
        int[] test5 = {1};
        int result5 = sol.searchInsert(test5, 1);
        System.out.println("Teste 5: " + java.util.Arrays.toString(test5) + ", target = 1");
        System.out.println("Resultado: " + result5);
        System.out.println("Esperado: 0 (1 está no índice 0)");
        System.out.println("Passou: " + (result5 == 0));
        System.out.println();
        
        // Teste 6: nums = [1,3], target = 2
        int[] test6 = {1, 3};
        int result6 = sol.searchInsert(test6, 2);
        System.out.println("Teste 6: " + java.util.Arrays.toString(test6) + ", target = 2");
        System.out.println("Resultado: " + result6);
        System.out.println("Esperado: 1 (2 seria inserido entre 1 e 3)");
        System.out.println("Passou: " + (result6 == 1));
    }
}