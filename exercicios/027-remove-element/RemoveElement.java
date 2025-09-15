/**
 * LeetCode 27 - Remove Element
 * Difficulty: Easy
 * 
 * Problema:
 * Dado um array de inteiros nums e um valor val, remova todas as ocorrências
 * de val in-place e retorne o novo comprimento.
 * 
 * Não aloque espaço extra para outro array. Você deve fazer isso modificando
 * o array de entrada in-place com O(1) memória extra.
 * 
 * A ordem dos elementos pode ser alterada. Não importa o que você deixa além
 * do novo comprimento retornado.
 * 
 * Exemplo 1:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explicação: Sua função deve retornar k = 2, com os primeiros dois elementos
 * de nums sendo 2. Não importa o que você deixa além do k retornado.
 * 
 * Exemplo 2:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explicação: Sua função deve retornar k = 5, com os primeiros cinco elementos
 * de nums contendo 0, 0, 1, 3, e 4. A ordem pode ser diferente.
 * 
 * Restrições:
 * - 0 <= nums.length <= 100
 * - 0 <= nums[i] <= 50
 * - 0 <= val <= 100
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        // TODO: Implementar sua solucao
        // Dica 1: Use um ponteiro para a posição onde colocar o próximo elemento válido
        // Dica 2: Percorra o array com outro ponteiro
        // Dica 3: Se nums[i] != val, copie para a posição do primeiro ponteiro
        // Dica 4: Incremente o primeiro ponteiro apenas quando copiar um elemento
        // Dica 5: Retorne a posição final do primeiro ponteiro
        
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                    nums[i] = nums[k];
                    k++;
            }
        }

        return k; // Substitua pela sua implementacao
    }
}

public class RemoveElement {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: nums = [3,2,2,3], val = 3
        int[] test1 = {3, 2, 2, 3};
        int[] original1 = test1.clone();
        int result1 = sol.removeElement(test1, 3);
        System.out.println("Teste 1: " + java.util.Arrays.toString(original1) + ", val = 3");
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
        System.out.println("Esperado: k=2, elementos válidos: [2,2]");
        System.out.println("Passou: " + (result1 == 2));
        System.out.println();
        
        // Teste 2: nums = [0,1,2,2,3,0,4,2], val = 2
        int[] test2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] original2 = test2.clone();
        int result2 = sol.removeElement(test2, 2);
        System.out.println("Teste 2: " + java.util.Arrays.toString(original2) + ", val = 2");
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
        System.out.println("Esperado: k=5, elementos válidos sem o 2");
        System.out.println("Passou: " + (result2 == 5));
        System.out.println();
        
        // Teste 3: nums = [1], val = 1
        int[] test3 = {1};
        int[] original3 = test3.clone();
        int result3 = sol.removeElement(test3, 1);
        System.out.println("Teste 3: " + java.util.Arrays.toString(original3) + ", val = 1");
        System.out.println("Resultado: k=" + result3);
        System.out.println("Array modificado: " + java.util.Arrays.toString(test3));
        System.out.println("Esperado: k=0 (remove o único elemento)");
        System.out.println("Passou: " + (result3 == 0));
        System.out.println();
        
        // Teste 4: nums = [4,5], val = 4
        int[] test4 = {4, 5};
        int[] original4 = test4.clone();
        int result4 = sol.removeElement(test4, 4);
        System.out.println("Teste 4: " + java.util.Arrays.toString(original4) + ", val = 4");
        System.out.println("Resultado: k=" + result4);
        System.out.print("Array modificado: [");
        for (int i = 0; i < test4.length; i++) {
            if (i < result4) {
                System.out.print(test4[i]);
            } else {
                System.out.print("_");
            }
            if (i < test4.length - 1) System.out.print(",");
        }
        System.out.println("]");
        System.out.println("Esperado: k=1, elemento válido: [5]");
        System.out.println("Passou: " + (result4 == 1));
    }
}