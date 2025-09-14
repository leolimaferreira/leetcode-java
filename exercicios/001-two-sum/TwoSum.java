import java.util.*;

/**
 * LeetCode Problem 1: Two Sum
 * Difficulty: Easy
 * 
 * Problema:
 * Dado um array de inteiros nums e um inteiro target, retorne os índices dos 
 * dois números que somados resultam no target.
 * 
 * Você pode assumir que cada entrada terá exatamente uma solução, e você não 
 * pode usar o mesmo elemento duas vezes.
 * 
 * Exemplo 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explicação: nums[0] + nums[1] = 2 + 7 = 9, então retornamos [0, 1].
 * 
 * Exemplo 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Exemplo 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * Restrições:
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 * - Apenas uma resposta válida existe.
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) return new int[] {map.get(complement), i};

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Teste 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Teste 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + Arrays.toString(result1));
        System.out.println("Esperado: [0, 1]");
        System.out.println("Passou: " + Arrays.equals(result1, new int[]{0, 1}));
        System.out.println();
        
        // Teste 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Teste 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("Output: " + Arrays.toString(result2));
        System.out.println("Esperado: [1, 2]");
        System.out.println("Passou: " + Arrays.equals(result2, new int[]{1, 2}));
        System.out.println();
        
        // Teste 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Teste 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", target = " + target3);
        System.out.println("Output: " + Arrays.toString(result3));
        System.out.println("Esperado: [0, 1]");
        System.out.println("Passou: " + Arrays.equals(result3, new int[]{0, 1}));
        System.out.println();
        
        // Teste adicional
        int[] nums4 = {-1, -2, -3, -4, -5};
        int target4 = -8;
        int[] result4 = solution.twoSum(nums4, target4);
        System.out.println("Teste 4 (números negativos):");
        System.out.println("Input: nums = " + Arrays.toString(nums4) + ", target = " + target4);
        System.out.println("Output: " + Arrays.toString(result4));
        System.out.println("Esperado: [2, 4] (pois -3 + -5 = -8)");
        System.out.println("Passou: " + Arrays.equals(result4, new int[]{2, 4}));
    }
}