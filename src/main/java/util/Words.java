package util;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Words {

    public static Map<String, Integer> countVowels(String text) {
        HashMap<String, Integer> vowels = new HashMap<>();
        vowels.put("A", 0);
        vowels.put("E", 0);
        vowels.put("I", 0);
        vowels.put("O", 0);
        vowels.put("U", 0);
        for (int i = 0; i < text.length(); i++) {
            if (String.valueOf(text.charAt(i)).equals("a")){
                vowels.replace("A", vowels.get("A")+1);
            }
            if (String.valueOf(text.charAt(i)).equals("e")){
                vowels.replace("E", vowels.get("E")+1);
            }
            if (String.valueOf(text.charAt(i)).equals("i")){
                vowels.replace("I", vowels.get("I")+1);
            }
            if (String.valueOf(text.charAt(i)).equals("o")){
                vowels.replace("O", vowels.get("O")+1);
            }
            if (String.valueOf(text.charAt(i)).equals("u")){
                vowels.replace("U", vowels.get("U")+1);
            }
        }
        return vowels;
    }

    public static boolean isVowel(char character) {
        return Character.toString(character).matches("(?i)[aeiou]");
    }

    public static void compare(String word1, String word2) {
        if (word1.equals(word2)) {
            System.out.println("Las palabras son iguales");
            return;
        }
        if (word1.length() < word2.length() || word1.length() == word2.length()) {
            System.out.println(StringUtils.difference(word1, word2));
        }
        if (word2.length() < word1.length()) {
            System.out.println(StringUtils.difference(word2, word1));
        }

    }

    public static String calculateLetter(Integer dni) {
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        String letter = String.valueOf(letters.charAt(dni % letters.length()));
        return letter;
    }
}
