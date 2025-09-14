/**
 * Problema: Inverter Array
 * 
 * Dado um array de números inteiros, retorne um novo array com os elementos
 * na ordem inversa (o primeiro vira último, o segundo vira penúltimo, etc).
 * 
 * Exemplo 1:
 * Input: [1, 2, 3, 4, 5]
 * Output: [5, 4, 3, 2, 1]
 * 
 * Exemplo 2:
 * Input: [10, 20]
 * Output: [20, 10]
 * 
 * Exemplo 3:
 * Input: [7]
 * Output: [7]
 * 
 * Este exercício pratica:
 * - Criação de novos arrays
 * - Acesso a elementos por índice
 * - Lógica de inversão de posições
 * - Trabalhar com tamanhos de arrays
 */

class Solution {
    public int[] reverseArray(int[] nums) {
        // TODO: Implementar sua solução
        // 
        // Dica 1: Crie um novo array do mesmo tamanho que nums
        // Dica 2: O primeiro elemento do novo array deve ser o último de nums
        // Dica 3: O segundo elemento do novo array deve ser o penúltimo de nums
        // Dica 4: E assim por diante...
        // Dica 5: Use um loop para preencher o novo array

        int [] reverseArray = new int[nums.length];
        int reverseIndex = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            reverseArray[reverseIndex] = nums[i];
            reverseIndex++;
        }
        
        return reverseArray; // Substitua pela sua implementação
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Array com 5 elementos
        int[] test1 = {1, 2, 3, 4, 5};
        int[] result1 = sol.reverseArray(test1);
        System.out.println("Teste 1: [1, 2, 3, 4, 5]");
        System.out.print("Resultado: ");
        printArray(result1);
        System.out.println("Esperado: [5, 4, 3, 2, 1]");
        System.out.println("Passou: " + arrayEquals(result1, new int[]{5, 4, 3, 2, 1}));
        System.out.println();
        
        // Teste 2: Array com 2 elementos
        int[] test2 = {10, 20};
        int[] result2 = sol.reverseArray(test2);
        System.out.println("Teste 2: [10, 20]");
        System.out.print("Resultado: ");
        printArray(result2);
        System.out.println("Esperado: [20, 10]");
        System.out.println("Passou: " + arrayEquals(result2, new int[]{20, 10}));
        System.out.println();
        
        // Teste 3: Array com 1 elemento
        int[] test3 = {7};
        int[] result3 = sol.reverseArray(test3);
        System.out.println("Teste 3: [7]");
        System.out.print("Resultado: ");
        printArray(result3);
        System.out.println("Esperado: [7]");
        System.out.println("Passou: " + arrayEquals(result3, new int[]{7}));
        System.out.println();
        
        // Teste 4: Array com números negativos
        int[] test4 = {-1, -2, -3};
        int[] result4 = sol.reverseArray(test4);
        System.out.println("Teste 4: [-1, -2, -3]");
        System.out.print("Resultado: ");
        printArray(result4);
        System.out.println("Esperado: [-3, -2, -1]");
        System.out.println("Passou: " + arrayEquals(result4, new int[]{-3, -2, -1}));
    }
    
    // Método auxiliar para imprimir array
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Método auxiliar para comparar arrays
    private static boolean arrayEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}