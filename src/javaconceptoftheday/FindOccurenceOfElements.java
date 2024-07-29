package javaconceptoftheday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindOccurenceOfElements {
    public static void main(String[] args) {
        String string = "Java J2EE Java JSP J2EE";
        // step to remove spaces in the string otherwise space character will also be considered
        String newString = string.replaceAll("\\s+","");
        findOccurrenceUsingHashMap(newString);
    }

    private static void findOccurrenceUsingHashMap(String inputArray){

        Map<Character,Integer> integerMap = new HashMap<>();

        for(char key :  inputArray.toCharArray()){
            if(!integerMap.containsKey(key)){
                integerMap.put(key,1);
            }else {
                integerMap.put(key,integerMap.get(key) + 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = integerMap.entrySet();
        for (Map.Entry<Character, Integer> integerIntegerEntry : entrySet) {
            System.out.println("Character " + integerIntegerEntry.getKey() + " times: " +integerIntegerEntry.getValue());
        }
    }
}
