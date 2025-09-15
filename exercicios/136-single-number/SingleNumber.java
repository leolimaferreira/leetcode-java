import java.util.HashMap;
import java.util.HashSet;

/**
 * LeetCode 136 - Single Number
 * Difficulty: Easy
 * 
 * Problema:
 * Dado um array de inteiros não-vazio, todos os elementos aparecem
 * duas vezes, exceto um. Encontre este único elemento.
 * 
 * Exemplo 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * 
 * Exemplo 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * 
 * Exemplo 3:
 * Input: nums = [1]
 * Output: 1
 * 
 * Nota: Sua solução deve ter complexidade linear O(n) e usar
 * apenas espaço constante O(1).
 */

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }
}

public class SingleNumber {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1
        int[] nums1 = {2, 2, 1};
        int result1 = sol.singleNumber(nums1);
        System.out.println("Teste 1: [2,2,1]");
        System.out.println("Resultado: " + result1);
        System.out.println("Esperado: 1");
        System.out.println("Passou: " + (result1 == 1));
        System.out.println();
        
        // Teste 2
        int[] nums2 = {4, 1, 2, 1, 2};
        int result2 = sol.singleNumber(nums2);
        System.out.println("Teste 2: [4,1,2,1,2]");
        System.out.println("Resultado: " + result2);
        System.out.println("Esperado: 4");
        System.out.println("Passou: " + (result2 == 4));
        System.out.println();
        
        // Teste 3
        int[] nums3 = {1};
        int result3 = sol.singleNumber(nums3);
        System.out.println("Teste 3: [1]");
        System.out.println("Resultado: " + result3);
        System.out.println("Esperado: 1");
        System.out.println("Passou: " + (result3 == 1));
        System.out.println();
        
        // Teste 4
        int[] nums4 = {7, 3, 7};
        int result4 = sol.singleNumber(nums4);
        System.out.println("Teste 4: [7,3,7]");
        System.out.println("Resultado: " + result4);
        System.out.println("Esperado: 3");
        System.out.println("Passou: " + (result4 == 3));
        System.out.println();
        
        // Teste 5
        int[] nums5 = {9, 6, 8, 6, 8};
        int result5 = sol.singleNumber(nums5);
        System.out.println("Teste 5: [9,6,8,6,8]");
        System.out.println("Resultado: " + result5);
        System.out.println("Esperado: 9");
        System.out.println("Passou: " + (result5 == 9));
    }
}