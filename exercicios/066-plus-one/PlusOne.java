/**
 * LeetCode 66 - Plus One
 * Difficulty: Easy
 * 
 * Problema:
 * Você recebe um array de inteiros digits representando um número inteiro grande,
 * onde cada digits[i] é o i-ésimo dígito do inteiro. Os dígitos são ordenados
 * do mais significativo para o menos significativo na ordem da esquerda para a direita.
 * O número inteiro grande não contém nenhum zero inicial.
 * 
 * Incremente o número inteiro grande em um e retorne o array de dígitos resultante.
 * 
 * Exemplo 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explicação: O array representa o inteiro 123. Incrementar em um dá 123 + 1 = 124.
 * Assim, o resultado deve ser [1,2,4].
 * 
 * Exemplo 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explicação: O array representa o inteiro 4321. Incrementar em um dá 4321 + 1 = 4322.
 * Assim, o resultado deve ser [4,3,2,2].
 * 
 * Exemplo 3:
 * Input: digits = [9]
 * Output: [1,0]
 * Explicação: O array representa o inteiro 9. Incrementar em um dá 9 + 1 = 10.
 * Assim, o resultado deve ser [1,0].
 * 
 * Exemplo 4:
 * Input: digits = [9,9,9]
 * Output: [1,0,0,0]
 * Explicação: 999 + 1 = 1000
 * 
 * Restrições:
 * - 1 <= digits.length <= 100
 * - 0 <= digits[i] <= 9
 * - digits não contém zeros iniciais exceto o próprio número 0.
 */

class Solution {
    public int[] plusOne(int[] digits) {
        // TODO: Implementar sua solucao
        // Dica 1: Comece do último dígito (da direita para esquerda)
        // Dica 2: Se o dígito é menor que 9, só incremente e retorne
        // Dica 3: Se o dígito é 9, vire 0 e continue para o próximo (carry)
        // Dica 4: Se todos os dígitos eram 9, você precisa criar um array maior
        // Dica 5: O novo array será [1,0,0,0...] quando todos eram 9

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; 
        }
        
        int [] newArray = new int [digits.length + 1];
        newArray[0] = 1;
        return newArray; // Substitua pela sua implementacao
    }
}

public class PlusOne {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: [1,2,3] -> [1,2,4]
        int[] test1 = {1, 2, 3};
        int[] result1 = sol.plusOne(test1);
        int[] expected1 = {1, 2, 4};
        System.out.println("Teste 1: " + java.util.Arrays.toString(test1));
        System.out.println("Resultado: " + java.util.Arrays.toString(result1));
        System.out.println("Esperado:  " + java.util.Arrays.toString(expected1));
        System.out.println("Passou: " + java.util.Arrays.equals(result1, expected1));
        System.out.println();
        
        // Teste 2: [4,3,2,1] -> [4,3,2,2]
        int[] test2 = {4, 3, 2, 1};
        int[] result2 = sol.plusOne(test2);
        int[] expected2 = {4, 3, 2, 2};
        System.out.println("Teste 2: " + java.util.Arrays.toString(test2));
        System.out.println("Resultado: " + java.util.Arrays.toString(result2));
        System.out.println("Esperado:  " + java.util.Arrays.toString(expected2));
        System.out.println("Passou: " + java.util.Arrays.equals(result2, expected2));
        System.out.println();
        
        // Teste 3: [9] -> [1,0]
        int[] test3 = {9};
        int[] result3 = sol.plusOne(test3);
        int[] expected3 = {1, 0};
        System.out.println("Teste 3: " + java.util.Arrays.toString(test3));
        System.out.println("Resultado: " + java.util.Arrays.toString(result3));
        System.out.println("Esperado:  " + java.util.Arrays.toString(expected3));
        System.out.println("Passou: " + java.util.Arrays.equals(result3, expected3));
        System.out.println();
        
        // Teste 4: [9,9,9] -> [1,0,0,0]
        int[] test4 = {9, 9, 9};
        int[] result4 = sol.plusOne(test4);
        int[] expected4 = {1, 0, 0, 0};
        System.out.println("Teste 4: " + java.util.Arrays.toString(test4));
        System.out.println("Resultado: " + java.util.Arrays.toString(result4));
        System.out.println("Esperado:  " + java.util.Arrays.toString(expected4));
        System.out.println("Passou: " + java.util.Arrays.equals(result4, expected4));
        System.out.println();
        
        // Teste 5: [1,9,9] -> [2,0,0]
        int[] test5 = {1, 9, 9};
        int[] result5 = sol.plusOne(test5);
        int[] expected5 = {2, 0, 0};
        System.out.println("Teste 5: " + java.util.Arrays.toString(test5));
        System.out.println("Resultado: " + java.util.Arrays.toString(result5));
        System.out.println("Esperado:  " + java.util.Arrays.toString(expected5));
        System.out.println("Passou: " + java.util.Arrays.equals(result5, expected5));
    }
}