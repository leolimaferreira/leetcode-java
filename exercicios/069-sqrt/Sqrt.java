/**
 * LeetCode 69 - Sqrt(x)
 * Difficulty: Easy
 * 
 * Problema:
 * Dado um inteiro não-negativo x, retorne a raiz quadrada de x arredondada
 * para baixo para o inteiro mais próximo. O inteiro retornado também deve
 * ser não-negativo.
 * 
 * Você não deve usar a função de raiz quadrada embutida como pow(x, 0.5) ou x**0.5.
 * 
 * Exemplo 1:
 * Input: x = 4
 * Output: 2
 * Explicação: A raiz quadrada de 4 é 2.
 * 
 * Exemplo 2:
 * Input: x = 8
 * Output: 2
 * Explicação: A raiz quadrada de 8 é 2.828..., arredondando para baixo fica 2.
 * 
 * Exemplo 3:
 * Input: x = 0
 * Output: 0
 * Explicação: A raiz quadrada de 0 é 0.
 * 
 * Exemplo 4:
 * Input: x = 1
 * Output: 1
 * Explicação: A raiz quadrada de 1 é 1.
 * 
 * Restrições:
 * - 0 <= x <= 2^31 - 1
 */

class Solution {
    public int mySqrt(int x) {
        // TODO: Implementar sua solucao
        // VERSÃO SIMPLES: Teste todos os números de 0 até x
        // Dica 1: Se i * i == x, retorne i
        // Dica 2: Se i * i > x, retorne i - 1
        // Dica 3: Cuidado com overflow! Use long ou i <= x/i
        
        // VERSÃO OTIMIZADA: Busca binária
        // Dica 4: left = 0, right = x
        // Dica 5: mid * mid == x → resposta
        // Dica 6: mid * mid < x → busque na metade direita
        // Dica 7: mid * mid > x → busque na metade esquerda

        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (mid * mid == x) return mid;

            else if (mid * mid < x) left = mid + 1;

            else if (mid * mid > x) right = mid - 1;
        }
        
        return right; // Substitua pela sua implementacao
    }
}

public class Sqrt {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: x = 4
        int result1 = sol.mySqrt(4);
        System.out.println("Teste 1: x = 4");
        System.out.println("Resultado: " + result1);
        System.out.println("Esperado: 2 (2 * 2 = 4)");
        System.out.println("Passou: " + (result1 == 2));
        System.out.println();
        
        // Teste 2: x = 8
        int result2 = sol.mySqrt(8);
        System.out.println("Teste 2: x = 8");
        System.out.println("Resultado: " + result2);
        System.out.println("Esperado: 2 (2 * 2 = 4 < 8, mas 3 * 3 = 9 > 8)");
        System.out.println("Passou: " + (result2 == 2));
        System.out.println();
        
        // Teste 3: x = 0
        int result3 = sol.mySqrt(0);
        System.out.println("Teste 3: x = 0");
        System.out.println("Resultado: " + result3);
        System.out.println("Esperado: 0 (0 * 0 = 0)");
        System.out.println("Passou: " + (result3 == 0));
        System.out.println();
        
        // Teste 4: x = 1
        int result4 = sol.mySqrt(1);
        System.out.println("Teste 4: x = 1");
        System.out.println("Resultado: " + result4);
        System.out.println("Esperado: 1 (1 * 1 = 1)");
        System.out.println("Passou: " + (result4 == 1));
        System.out.println();
        
        // Teste 5: x = 9
        int result5 = sol.mySqrt(9);
        System.out.println("Teste 5: x = 9");
        System.out.println("Resultado: " + result5);
        System.out.println("Esperado: 3 (3 * 3 = 9)");
        System.out.println("Passou: " + (result5 == 3));
        System.out.println();
        
        // Teste 6: x = 15
        int result6 = sol.mySqrt(15);
        System.out.println("Teste 6: x = 15");
        System.out.println("Resultado: " + result6);
        System.out.println("Esperado: 3 (3 * 3 = 9 < 15, mas 4 * 4 = 16 > 15)");
        System.out.println("Passou: " + (result6 == 3));
        System.out.println();
        
        // Teste 7: x = 100
        int result7 = sol.mySqrt(100);
        System.out.println("Teste 7: x = 100");
        System.out.println("Resultado: " + result7);
        System.out.println("Esperado: 10 (10 * 10 = 100)");
        System.out.println("Passou: " + (result7 == 10));
    }
}