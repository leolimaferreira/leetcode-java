/**
 * Problema: Calcular Média de um Array
 * 
 * Dado um array de números inteiros, retorne a média aritmética dos elementos.
 * A média é a soma de todos os elementos dividida pela quantidade de elementos.
 * 
 * Exemplo 1:
 * Input: [1, 2, 3, 4, 5]
 * Output: 3.0 (soma = 15, elementos = 5, média = 15/5 = 3.0)
 * 
 * Exemplo 2:
 * Input: [10, 20]
 * Output: 15.0 (soma = 30, elementos = 2, média = 30/2 = 15.0)
 * 
 * Exemplo 3:
 * Input: [7]
 * Output: 7.0 (soma = 7, elementos = 1, média = 7/1 = 7.0)
 * 
 * Este exercício pratica:
 * - Cálculo de soma (que você já fez!)
 * - Divisão com números decimais
 * - Tipo de retorno double
 * - Conceitos matemáticos básicos
 */

class Solution {
    public double calculateAverage(int[] nums) {
        // TODO: Implementar sua solução
        // 
        
        double avg = 0.0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        avg = sum / nums.length;
        
        return avg; // Substitua pela sua implementação
    }
}

public class ArrayAverage {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Array simples
        int[] test1 = {1, 2, 3, 4, 5};
        double result1 = sol.calculateAverage(test1);
        System.out.println("Teste 1: [1, 2, 3, 4, 5]");
        System.out.println("Resultado: " + result1 + " | Esperado: 3.0");
        System.out.println("Passou: " + (Math.abs(result1 - 3.0) < 0.001));
        System.out.println();
        
        // Teste 2: Array com 2 elementos
        int[] test2 = {10, 20};
        double result2 = sol.calculateAverage(test2);
        System.out.println("Teste 2: [10, 20]");
        System.out.println("Resultado: " + result2 + " | Esperado: 15.0");
        System.out.println("Passou: " + (Math.abs(result2 - 15.0) < 0.001));
        System.out.println();
        
        // Teste 3: Array com 1 elemento
        int[] test3 = {7};
        double result3 = sol.calculateAverage(test3);
        System.out.println("Teste 3: [7]");
        System.out.println("Resultado: " + result3 + " | Esperado: 7.0");
        System.out.println("Passou: " + (Math.abs(result3 - 7.0) < 0.001));
        System.out.println();
        
        // Teste 4: Array com números maiores
        int[] test4 = {100, 200, 300};
        double result4 = sol.calculateAverage(test4);
        System.out.println("Teste 4: [100, 200, 300]");
        System.out.println("Resultado: " + result4 + " | Esperado: 200.0");
        System.out.println("Passou: " + (Math.abs(result4 - 200.0) < 0.001));
        System.out.println();
        
        // Teste 5: Array com números que não dividem exato
        int[] test5 = {1, 2, 4};
        double result5 = sol.calculateAverage(test5);
        System.out.println("Teste 5: [1, 2, 4]");
        System.out.println("Resultado: " + result5 + " | Esperado: 2.333...");
        System.out.println("Passou: " + (Math.abs(result5 - 2.333333333333333) < 0.001));
    }
}