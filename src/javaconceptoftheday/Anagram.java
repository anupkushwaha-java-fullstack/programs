package javaconceptoftheday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://javaconceptoftheday.com/anagram-program-in-java/#google_vignette

public class Anagram {
    public static void main(String[] args) {
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagramUsingMap("Mother In Law", "Hitler Woman");
    }


    // 1) Anagram Program In Java Using sort() and equals() Methods
    private static boolean isAnagram(String string1, String string2) {

        String copyString1 = string1.replaceAll("\\s","");
        String copyString2 = string2.replaceAll("\\s","");

        char[] stringArray1 = copyString1.toLowerCase().toCharArray();
        char[] stringArray2 = copyString2.toLowerCase().toCharArray();

        boolean isAnagram = false;
        if(stringArray1.length != stringArray2.length){
            isAnagram =  false;
        } else {

            Arrays.sort(stringArray1);
            Arrays.sort(stringArray2);

            isAnagram = Arrays.equals(stringArray1,stringArray2);
        }

        if(isAnagram)
        {
            System.out.println(string1+" and "+string2+" are anagrams");
        }
        else
        {
            System.out.println(string1+" and "+string2+" are not anagrams");
        }
        return isAnagram;
    }


    private static boolean isAnagramUsingMap(String string1, String string2) {

        String copyString1 = string1.replaceAll("\\s","").toLowerCase();
        String copyString2 = string2.replaceAll("\\s","").toLowerCase();

        char[] stringArray1 = copyString1.toCharArray();
        char[] stringArray2 = copyString2.toCharArray();

        boolean isAnagram = false;
        if(stringArray1.length != stringArray2.length){
            isAnagram =  false;
        } else {

            Map<Character,Integer> firstCharacter = new HashMap<>();
            for(char ch : stringArray1){
               if(firstCharacter.containsKey(ch)){
                   firstCharacter.put(ch, firstCharacter.get(ch) + 1);
               }else {
                   firstCharacter.put(ch, 1);
                }
            }

            Map<Character,Integer> secondCharacter = new HashMap<>();
            for(char ch : stringArray2){
                if(secondCharacter.containsKey(ch)){
                    secondCharacter.put(ch, secondCharacter.get(ch) + 1);
                }else {
                    secondCharacter.put(ch, 1);
                }
            }

            isAnagram =  firstCharacter.equals(secondCharacter);

        }

        if(isAnagram)
        {
            System.out.println(string1+" and "+string2+" are anagrams");
        }
        else
        {
            System.out.println(string1+" and "+string2+" are not anagrams");
        }
        return isAnagram;
    }
}
