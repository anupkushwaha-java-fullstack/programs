package javaconceptoftheday;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

    public static void main(String[] args) {

        System.out.println(" Anup Kushwaha");
        countDuplicateCharacter("Anup Kushwaha");
        System.out.println("---------------------------------");
        System.out.println(" Mahesh Kushwaha");
        countDuplicateCharacter("Mahesh Kushwaha");
    }

    public static void countDuplicateCharacter(String string) {
        Map<Character, Integer> characterCount = new HashMap<>();

        char[] charArray = string.toCharArray();

        for (char ch : charArray) {
            if (characterCount.containsKey(ch)) {
                characterCount.put(ch, characterCount.get(ch) + 1);
            } else {
                characterCount.put(ch, 1);
            }
        }

        Set<Character> charsInString = characterCount.keySet();
        for (char ch : charsInString) {
            if (characterCount.get(ch) > 1) {
                System.out.println(" Character " + ch + " count: " + characterCount.get(ch));
            }
        }
    }
}
