/**
 * LeetCode 26 - Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * 
 * Problema: 
 * Dado um array de inteiros ordenado, remova os elementos duplicados in-place
 * de forma que cada elemento apareça apenas uma vez e retorne o novo comprimento.
 * 
 * Você deve fazer isso com O(1) espaço extra. Não aloque espaço extra para
 * outro array - você deve modificar o array de entrada in-place.
 * 
 * Exemplo 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explicação: Sua função deve retornar k = 2, com os primeiros dois elementos
 * de nums sendo 1 e 2 respectivamente. Não importa o que você deixa além do k retornado.
 * 
 * Exemplo 2:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * 
 * Restrições:
 * - 1 <= nums.length <= 3 * 10^4
 * - -100 <= nums[i] <= 100
 * - nums está ordenado em ordem crescente.
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // TODO: Implementar sua solucao
        // Dica 1: Use dois ponteiros - um lento (slow) e um rapido (fast)
        // Dica 2: slow aponta para a posicao onde colocar o proximo elemento unico
        // Dica 3: fast percorre todo o array procurando elementos diferentes
        // Dica 4: Se nums[fast] != nums[slow], copie nums[fast] para nums[slow+1]
        // Dica 5: Incremente slow e continue
        // Dica 6: Retorne slow + 1 (que eh o tamanho do array sem duplicatas)

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        
        return slow + 1; // Substitua pela sua implementacao
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: [1,1,2] -> k=2, array=[1,2,_]
        int[] test1 = {1, 1, 2};
        int[] original1 = test1.clone();
        int result1 = sol.removeDuplicates(test1);
        System.out.println("Teste 1: " + java.util.Arrays.toString(original1));
        System.out.println("Resultado: k=" + result1);
        System.out.print("Array modificado: [");
        for (int i = 0; i < test1.length; i++) {
            if (i < result1) {
                System.out.print(test1[i]);
            } else {
                System.out.print("_");
            }
            if (i < test1.length - 1) System.out.print(",");
        }
        System.out.println("]");
        System.out.println("Esperado: k=2, array=[1,2,_]");
        System.out.println("Passou: " + (result1 == 2));
        System.out.println();
        
        // Teste 2: [0,0,1,1,1,2,2,3,3,4] -> k=5, array=[0,1,2,3,4,_,_,_,_,_]
        int[] test2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] original2 = test2.clone();
        int result2 = sol.removeDuplicates(test2);
        System.out.println("Teste 2: " + java.util.Arrays.toString(original2));
        System.out.println("Resultado: k=" + result2);
        System.out.print("Array modificado: [");
        for (int i = 0; i < test2.length; i++) {
            if (i < result2) {
                System.out.print(test2[i]);
            } else {
                System.out.print("_");
            }
            if (i < test2.length - 1) System.out.print(",");
        }
        System.out.println("]");
        System.out.println("Esperado: k=5, array=[0,1,2,3,4,_,_,_,_,_]");
        System.out.println("Passou: " + (result2 == 5));
        System.out.println();
        
        // Teste 3: [1] -> k=1, array=[1]
        int[] test3 = {1};
        int[] original3 = test3.clone();
        int result3 = sol.removeDuplicates(test3);
        System.out.println("Teste 3: " + java.util.Arrays.toString(original3));
        System.out.println("Resultado: k=" + result3);
        System.out.println("Array modificado: " + java.util.Arrays.toString(test3));
        System.out.println("Esperado: k=1, array=[1]");
        System.out.println("Passou: " + (result3 == 1));
    }
}