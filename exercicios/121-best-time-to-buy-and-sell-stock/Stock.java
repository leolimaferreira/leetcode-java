/**
 * LeetCode 121 - Best Time to Buy and Sell Stock
 * 
 * Problema: Encontrar o maior lucro possivel comprando e vendendo uma acao.
 * Voce deve comprar antes de vender.
 * 
 * Estrategia: 
 * - Mantenha o menor preco visto ate agora
 * - Para cada preco, calcule o lucro se vender hoje
 * - Mantenha o maior lucro encontrado
 */

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        
        // TODO: Implementar sua solucao
        // Dica 1: int minPrice = prices[0];
        // Dica 2: int maxProfit = 0;
        // Dica 3: Use um loop para percorrer os precos
        // Dica 4: Atualize minPrice se encontrar preco menor
        // Dica 5: Calcule lucro atual = preco atual - minPrice
        // Dica 6: Atualize maxProfit se lucro atual for maior

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) minPrice = prices[i];

            int possibleMaxProfit = prices[i] - minPrice;

            if (possibleMaxProfit > maxProfit) maxProfit = possibleMaxProfit;
        }
        
        return maxProfit;
    }
}

public class Stock {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: [7,1,5,3,6,4] -> Lucro: 5 (comprar em 1, vender em 6)
        int[] test1 = {7, 1, 5, 3, 6, 4};
        int result1 = sol.maxProfit(test1);
        System.out.println("Teste 1: " + java.util.Arrays.toString(test1));
        System.out.println("Resultado: " + result1 + " | Esperado: 5");
        System.out.println("Passou: " + (result1 == 5));
        System.out.println();
        
        // Teste 2: [7,6,4,3,1] -> Lucro: 0 (precos sempre caindo)
        int[] test2 = {7, 6, 4, 3, 1};
        int result2 = sol.maxProfit(test2);
        System.out.println("Teste 2: " + java.util.Arrays.toString(test2));
        System.out.println("Resultado: " + result2 + " | Esperado: 0");
        System.out.println("Passou: " + (result2 == 0));
        System.out.println();
        
        // Teste 3: [1,2,3,4,5] -> Lucro: 4 (comprar em 1, vender em 5)
        int[] test3 = {1, 2, 3, 4, 5};
        int result3 = sol.maxProfit(test3);
        System.out.println("Teste 3: " + java.util.Arrays.toString(test3));
        System.out.println("Resultado: " + result3 + " | Esperado: 4");
        System.out.println("Passou: " + (result3 == 4));
    }
}