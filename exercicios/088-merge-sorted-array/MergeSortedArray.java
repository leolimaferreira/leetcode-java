/**
 * LeetCode 88 - Merge Sorted Array
 * Difficulty: Easy
 * 
 * Problema:
 * Você tem dois arrays de inteiros nums1 e nums2, ordenados em ordem crescente,
 * e dois inteiros m e n, representando o número de elementos em nums1 e nums2.
 * 
 * Mescle nums2 em nums1 como um array final ordenado.
 * O array final ordenado não deve ser retornado pela função, mas sim armazenado
 * dentro do array nums1. Para acomodar isso, nums1 tem comprimento m + n, onde
 * os primeiros m elementos denotam os elementos que devem ser mesclados, e os
 * últimos n elementos são definidos como 0 e devem ser ignorados.
 * 
 * Exemplo 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explicação: Os arrays que estamos mesclando são [1,2,3] e [2,5,6].
 * O resultado da mesclagem é [1,2,2,3,5,6].
 * 
 * Exemplo 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explicação: Os arrays que estamos mesclando são [1] e [].
 * 
 * Exemplo 3:
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explicação: Os arrays que estamos mesclando são [] e [1].
 * 
 * Restrições:
 * - nums1.length == m + n
 * - nums2.length == n
 * - 0 <= m, n <= 200
 * - 1 <= m + n <= 200
 * - -10^9 <= nums1[i], nums2[j] <= 10^9
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // TODO: Implementar sua solucao
        // Dica 1: Comece do final dos arrays (posicoes m-1 e n-1)
        // Dica 2: Compare nums1[i] com nums2[j]
        // Dica 3: Coloque o maior elemento na posicao m+n-1 de nums1
        // Dica 4: Continue ate processar todos os elementos
        // Dica 5: Se sobrar elementos em nums2, copie-os para nums1

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        // Sua implementacao aqui
    }
}

public class MergeSortedArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: nums1=[1,2,3,0,0,0], m=3, nums2=[2,5,6], n=3
        int[] test1 = {1, 2, 3, 0, 0, 0};
        int[] nums2_1 = {2, 5, 6};
        int[] expected1 = {1, 2, 2, 3, 5, 6};
        sol.merge(test1, 3, nums2_1, 3);
        System.out.println("Teste 1:");
        System.out.println("Resultado: " + java.util.Arrays.toString(test1));
        System.out.println("Esperado:  " + java.util.Arrays.toString(expected1));
        System.out.println("Passou: " + java.util.Arrays.equals(test1, expected1));
        System.out.println();
        
        // Teste 2: nums1=[1], m=1, nums2=[], n=0
        int[] test2 = {1};
        int[] nums2_2 = {};
        int[] expected2 = {1};
        sol.merge(test2, 1, nums2_2, 0);
        System.out.println("Teste 2:");
        System.out.println("Resultado: " + java.util.Arrays.toString(test2));
        System.out.println("Esperado:  " + java.util.Arrays.toString(expected2));
        System.out.println("Passou: " + java.util.Arrays.equals(test2, expected2));
        System.out.println();
        
        // Teste 3: nums1=[0], m=0, nums2=[1], n=1
        int[] test3 = {0};
        int[] nums2_3 = {1};
        int[] expected3 = {1};
        sol.merge(test3, 0, nums2_3, 1);
        System.out.println("Teste 3:");
        System.out.println("Resultado: " + java.util.Arrays.toString(test3));
        System.out.println("Esperado:  " + java.util.Arrays.toString(expected3));
        System.out.println("Passou: " + java.util.Arrays.equals(test3, expected3));
        System.out.println();
        
        // Teste 4: nums1=[4,5,6,0,0,0], m=3, nums2=[1,2,3], n=3
        int[] test4 = {4, 5, 6, 0, 0, 0};
        int[] nums2_4 = {1, 2, 3};
        int[] expected4 = {1, 2, 3, 4, 5, 6};
        sol.merge(test4, 3, nums2_4, 3);
        System.out.println("Teste 4:");
        System.out.println("Resultado: " + java.util.Arrays.toString(test4));
        System.out.println("Esperado:  " + java.util.Arrays.toString(expected4));
        System.out.println("Passou: " + java.util.Arrays.equals(test4, expected4));
    }
}