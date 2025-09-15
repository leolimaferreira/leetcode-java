/**
 * LeetCode 58 - Length of Last Word
 * Difficulty: Easy
 * 
 * Problema:
 * Dado uma string s consistindo de palavras e espaços, retorne o comprimento
 * da última palavra na string.
 * 
 * Uma palavra é uma sequência máxima de caracteres que não contém espaços.
 * 
 * Exemplo 1:
 * Input: s = "Hello World"
 * Output: 5
 * Explicação: A última palavra é "World" com comprimento 5.
 * 
 * Exemplo 2:
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explicação: A última palavra é "moon" com comprimento 4.
 * 
 * Exemplo 3:
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explicação: A última palavra é "joyboy" com comprimento 6.
 * 
 * Restrições:
 * - 1 <= s.length <= 10^4
 * - s consiste apenas de letras inglesas e espaços ' '
 * - Existe pelo menos uma palavra em s
 */

class Solution {
    public int lengthOfLastWord(String s) {
        // TODO: Implementar sua solucao
        // VERSÃO SUPER SIMPLES: Use s.trim().split(" ")
        // Dica 1: s.trim() remove espaços do início e fim
        // Dica 2: split(" ") divide em array de palavras
        // Dica 3: Pegue a última palavra do array
        // Dica 4: Retorne o comprimento dela
        
        // VERSÃO MANUAL: Percorra de trás para frente
        // Dica 5: Comece do final da string
        // Dica 6: Pule espaços em branco do final
        // Dica 7: Conte caracteres até encontrar um espaço

        String[] words = s.trim().split(" ");
        return words[words.length - 1].length(); // Substitua pela sua implementacao
    }
}

public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: "Hello World"
        String test1 = "Hello World";
        int result1 = sol.lengthOfLastWord(test1);
        System.out.println("Teste 1: \"" + test1 + "\"");
        System.out.println("Resultado: " + result1);
        System.out.println("Esperado: 5 (\"World\" tem 5 caracteres)");
        System.out.println("Passou: " + (result1 == 5));
        System.out.println();
        
        // Teste 2: "   fly me   to   the moon  "
        String test2 = "   fly me   to   the moon  ";
        int result2 = sol.lengthOfLastWord(test2);
        System.out.println("Teste 2: \"" + test2 + "\"");
        System.out.println("Resultado: " + result2);
        System.out.println("Esperado: 4 (\"moon\" tem 4 caracteres)");
        System.out.println("Passou: " + (result2 == 4));
        System.out.println();
        
        // Teste 3: "luffy is still joyboy"
        String test3 = "luffy is still joyboy";
        int result3 = sol.lengthOfLastWord(test3);
        System.out.println("Teste 3: \"" + test3 + "\"");
        System.out.println("Resultado: " + result3);
        System.out.println("Esperado: 6 (\"joyboy\" tem 6 caracteres)");
        System.out.println("Passou: " + (result3 == 6));
        System.out.println();
        
        // Teste 4: "a"
        String test4 = "a";
        int result4 = sol.lengthOfLastWord(test4);
        System.out.println("Teste 4: \"" + test4 + "\"");
        System.out.println("Resultado: " + result4);
        System.out.println("Esperado: 1 (\"a\" tem 1 caractere)");
        System.out.println("Passou: " + (result4 == 1));
        System.out.println();
        
        // Teste 5: "Today is a nice day"
        String test5 = "Today is a nice day";
        int result5 = sol.lengthOfLastWord(test5);
        System.out.println("Teste 5: \"" + test5 + "\"");
        System.out.println("Resultado: " + result5);
        System.out.println("Esperado: 3 (\"day\" tem 3 caracteres)");
        System.out.println("Passou: " + (result5 == 3));
    }
}