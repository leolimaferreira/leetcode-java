/**
 * LeetCode 14 - Longest Common Prefix
 * Difficulty: Easy
 * 
 * Problema:
 * Escreva uma função para encontrar a string de prefixo comum mais longa
 * entre um array de strings.
 * 
 * Se não há prefixo comum, retorne uma string vazia "".
 * 
 * Exemplo 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Explicação: O prefixo comum mais longo é "fl".
 * 
 * Exemplo 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explicação: Não há prefixo comum entre as strings de entrada.
 * 
 * Exemplo 3:
 * Input: strs = ["interspecies","interstellar","interstate"]
 * Output: "inters"
 * Explicação: O prefixo comum é "inters".
 * 
 * Exemplo 4:
 * Input: strs = ["abc"]
 * Output: "abc"
 * Explicação: Com apenas uma string, ela mesma é o prefixo.
 * 
 * Restrições:
 * - 1 <= strs.length <= 200
 * - 0 <= strs[i].length <= 200
 * - strs[i] consiste apenas de letras minúsculas inglesas
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // TODO: Implementar sua solucao
        // Dica 1: Se o array está vazio, retorne ""
        // Dica 2: Use a primeira string como referência
        // Dica 3: Compare caractere por caractere com todas as outras strings
        // Dica 4: Pare quando encontrar um caractere diferente
        // Dica 5: Retorne a substring de 0 até onde parou
        
        // Estratégia simples:
        // - Pegue a primeira string
        // - Para cada posição i, verifique se todas as strings têm o mesmo caractere
        // - Pare quando encontrar diferença ou chegar ao fim de alguma string

        if (strs.length == 0) return "";
        String primeira = strs[0];

        for (int i = 0; i < primeira.length(); i++) {
            char c = primeira.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) return primeira.substring(0, i);
            }
        }
        
        return primeira; // Substitua pela sua implementacao
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: ["flower","flow","flight"] -> "fl"
        String[] test1 = {"flower", "flow", "flight"};
        String result1 = sol.longestCommonPrefix(test1);
        System.out.println("Teste 1: " + java.util.Arrays.toString(test1));
        System.out.println("Resultado: \"" + result1 + "\"");
        System.out.println("Esperado: \"fl\"");
        System.out.println("Passou: " + result1.equals("fl"));
        System.out.println();
        
        // Teste 2: ["dog","racecar","car"] -> ""
        String[] test2 = {"dog", "racecar", "car"};
        String result2 = sol.longestCommonPrefix(test2);
        System.out.println("Teste 2: " + java.util.Arrays.toString(test2));
        System.out.println("Resultado: \"" + result2 + "\"");
        System.out.println("Esperado: \"\"");
        System.out.println("Passou: " + result2.equals(""));
        System.out.println();
        
        // Teste 3: ["interspecies","interstellar","interstate"] -> "inters"
        String[] test3 = {"interspecies", "interstellar", "interstate"};
        String result3 = sol.longestCommonPrefix(test3);
        System.out.println("Teste 3: " + java.util.Arrays.toString(test3));
        System.out.println("Resultado: \"" + result3 + "\"");
        System.out.println("Esperado: \"inters\"");
        System.out.println("Passou: " + result3.equals("inters"));
        System.out.println();
        
        // Teste 4: ["abc"] -> "abc"
        String[] test4 = {"abc"};
        String result4 = sol.longestCommonPrefix(test4);
        System.out.println("Teste 4: " + java.util.Arrays.toString(test4));
        System.out.println("Resultado: \"" + result4 + "\"");
        System.out.println("Esperado: \"abc\"");
        System.out.println("Passou: " + result4.equals("abc"));
        System.out.println();
        
        // Teste 5: ["ab", "a"] -> "a"
        String[] test5 = {"ab", "a"};
        String result5 = sol.longestCommonPrefix(test5);
        System.out.println("Teste 5: " + java.util.Arrays.toString(test5));
        System.out.println("Resultado: \"" + result5 + "\"");
        System.out.println("Esperado: \"a\"");
        System.out.println("Passou: " + result5.equals("a"));
        System.out.println();
        
        // Teste 6: ["", "abc"] -> ""
        String[] test6 = {"", "abc"};
        String result6 = sol.longestCommonPrefix(test6);
        System.out.println("Teste 6: " + java.util.Arrays.toString(test6));
        System.out.println("Resultado: \"" + result6 + "\"");
        System.out.println("Esperado: \"\"");
        System.out.println("Passou: " + result6.equals(""));
    }
}