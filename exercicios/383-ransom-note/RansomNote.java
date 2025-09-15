/**
 * LeetCode 383 - Ransom Note
 * Difficulty: Easy
 * 
 * Problema:
 * Dado duas strings ransomNote e magazine, retorne true se ransomNote pode
 * ser construído usando as letras de magazine e false caso contrário.
 * 
 * Cada letra em magazine só pode ser usada uma vez em ransomNote.
 * 
 * Exemplo 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Explicação: Não tem a letra 'a' na magazine.
 * 
 * Exemplo 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Explicação: Precisa de 2 'a's, mas magazine só tem 1.
 * 
 * Exemplo 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 * Explicação: Tem 2 'a's na magazine, suficiente para ransomNote.
 * 
 * Exemplo 4:
 * Input: ransomNote = "aab", magazine = "baa"
 * Output: true
 * Explicação: Tem todas as letras necessárias.
 * 
 * Restrições:
 * - 1 <= ransomNote.length, magazine.length <= 10^5
 * - ransomNote e magazine consistem apenas de letras minúsculas inglesas
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // TODO: Implementar sua solucao
        // Estratégia simples: Contar letras
        // Dica 1: Crie um array de contagem para as 26 letras (a-z)
        // Dica 2: Percorra magazine e conte quantas vezes cada letra aparece
        // Dica 3: Percorra ransomNote e "gaste" as letras do array
        // Dica 4: Se alguma letra ficar negativa, retorne false
        // Dica 5: Se conseguir gastar todas, retorne true
        
        // Lembrete: 'a' - 'a' = 0, 'b' - 'a' = 1, 'c' - 'a' = 2, etc.

        int [] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return false;
        }
        
        return true; // Substitua pela sua implementacao
    }
}

public class RansomNote {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Teste 1: ransomNote = "a", magazine = "b"
        boolean result1 = sol.canConstruct("a", "b");
        System.out.println("Teste 1: ransomNote = \"a\", magazine = \"b\"");
        System.out.println("Resultado: " + result1);
        System.out.println("Esperado: false (não tem 'a' na magazine)");
        System.out.println("Passou: " + (result1 == false));
        System.out.println();
        
        // Teste 2: ransomNote = "aa", magazine = "ab"
        boolean result2 = sol.canConstruct("aa", "ab");
        System.out.println("Teste 2: ransomNote = \"aa\", magazine = \"ab\"");
        System.out.println("Resultado: " + result2);
        System.out.println("Esperado: false (precisa de 2 'a's, tem só 1)");
        System.out.println("Passou: " + (result2 == false));
        System.out.println();
        
        // Teste 3: ransomNote = "aa", magazine = "aab"
        boolean result3 = sol.canConstruct("aa", "aab");
        System.out.println("Teste 3: ransomNote = \"aa\", magazine = \"aab\"");
        System.out.println("Resultado: " + result3);
        System.out.println("Esperado: true (tem 2 'a's na magazine)");
        System.out.println("Passou: " + (result3 == true));
        System.out.println();
        
        // Teste 4: ransomNote = "aab", magazine = "baa"
        boolean result4 = sol.canConstruct("aab", "baa");
        System.out.println("Teste 4: ransomNote = \"aab\", magazine = \"baa\"");
        System.out.println("Resultado: " + result4);
        System.out.println("Esperado: true (tem todas as letras)");
        System.out.println("Passou: " + (result4 == true));
        System.out.println();
        
        // Teste 5: ransomNote = "abc", magazine = "def"
        boolean result5 = sol.canConstruct("abc", "def");
        System.out.println("Teste 5: ransomNote = \"abc\", magazine = \"def\"");
        System.out.println("Resultado: " + result5);
        System.out.println("Esperado: false (nenhuma letra em comum)");
        System.out.println("Passou: " + (result5 == false));
        System.out.println();
        
        // Teste 6: ransomNote = "aabbc", magazine = "aaabbbc"
        boolean result6 = sol.canConstruct("aabbc", "aaabbbc");
        System.out.println("Teste 6: ransomNote = \"aabbc\", magazine = \"aaabbbc\"");
        System.out.println("Resultado: " + result6);
        System.out.println("Esperado: true (tem letras suficientes)");
        System.out.println("Passou: " + (result6 == true));
    }
}