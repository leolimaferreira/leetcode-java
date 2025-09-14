import java.util.Arrays;

/**
 * Problema: Verificar se Duas Strings são Anagramas
 * 
 * Duas strings são anagramas se uma pode ser formada reorganizando
 * as letras da outra. Retorne true se são anagramas, false caso contrário.
 * Ignore espaços e diferenças entre maiúsculas e minúsculas.
 * 
 * Exemplo 1:
 * Input: s1 = "listen", s2 = "silent"
 * Output: true
 * 
 * Exemplo 2:
 * Input: s1 = "evil", s2 = "vile"
 * Output: true
 * 
 * Exemplo 3:
 * Input: s1 = "hello", s2 = "bello"
 * Output: false
 * 
 * Exemplo 4:
 * Input: s1 = "A gentleman", s2 = "Elegant man"
 * Output: true (ignorando espaços: "agentleman" e "elegantman")
 * 
 * Este exercício pratica:
 * - Contagem de caracteres
 * - Comparação de frequências
 * - Manipulação de strings
 * - Uso de HashMap ou arrays para contagem
 */

class Solution {
    public boolean areAnagrams(String s1, String s2) {
        // TODO: Implementar sua solução
        // 
        // Abordagem 1 (Contagem de caracteres):
        // Dica 1: Remova espaços e converta para minúsculas
        // Dica 2: Se os tamanhos forem diferentes, não são anagramas
        // Dica 3: Conte a frequência de cada caractere em ambas strings
        // Dica 4: Compare se as frequências são iguais
        //
        // Abordagem 2 (Ordenação):
        // Dica 1: Limpe ambas strings
        // Dica 2: Converta para array de caracteres e ordene
        // Dica 3: Compare se os arrays ordenados são iguais

        String formatted1 = s1.replace(" ", "").toLowerCase();
        String formatted2 = s2.replace(" ", "").toLowerCase();

        char[] chars1 = formatted1.toCharArray();
        char[] chars2 = formatted2.toCharArray();

        if (chars1.length != chars2.length) return false;

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);// Substitua pela sua implementação
    }
}

public class GroupAnagrams {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: Anagramas clássicos
        String s1_1 = "listen", s2_1 = "silent";
        boolean result1 = sol.areAnagrams(s1_1, s2_1);
        System.out.println("Teste 1: \"" + s1_1 + "\" e \"" + s2_1 + "\"");
        System.out.println("Resultado: " + result1 + " | Esperado: true");
        System.out.println("Passou: " + (result1 == true));
        System.out.println();
        
        // Teste 2: Outro anagrama
        String s1_2 = "evil", s2_2 = "vile";
        boolean result2 = sol.areAnagrams(s1_2, s2_2);
        System.out.println("Teste 2: \"" + s1_2 + "\" e \"" + s2_2 + "\"");
        System.out.println("Resultado: " + result2 + " | Esperado: true");
        System.out.println("Passou: " + (result2 == true));
        System.out.println();
        
        // Teste 3: Não são anagramas
        String s1_3 = "hello", s2_3 = "bello";
        boolean result3 = sol.areAnagrams(s1_3, s2_3);
        System.out.println("Teste 3: \"" + s1_3 + "\" e \"" + s2_3 + "\"");
        System.out.println("Resultado: " + result3 + " | Esperado: false");
        System.out.println("Passou: " + (result3 == false));
        System.out.println();
        
        // Teste 4: Com espaços e maiúsculas
        String s1_4 = "A gentleman", s2_4 = "Elegant man";
        boolean result4 = sol.areAnagrams(s1_4, s2_4);
        System.out.println("Teste 4: \"" + s1_4 + "\" e \"" + s2_4 + "\"");
        System.out.println("Resultado: " + result4 + " | Esperado: true");
        System.out.println("Passou: " + (result4 == true));
        System.out.println();
        
        // Teste 5: Tamanhos diferentes
        String s1_5 = "abc", s2_5 = "abcd";
        boolean result5 = sol.areAnagrams(s1_5, s2_5);
        System.out.println("Teste 5: \"" + s1_5 + "\" e \"" + s2_5 + "\"");
        System.out.println("Resultado: " + result5 + " | Esperado: false");
        System.out.println("Passou: " + (result5 == false));
        System.out.println();
        
        // Teste 6: Strings iguais
        String s1_6 = "race", s2_6 = "race";
        boolean result6 = sol.areAnagrams(s1_6, s2_6);
        System.out.println("Teste 6: \"" + s1_6 + "\" e \"" + s2_6 + "\"");
        System.out.println("Resultado: " + result6 + " | Esperado: true");
        System.out.println("Passou: " + (result6 == true));
    }
}