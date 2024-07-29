package javaconceptoftheday;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5,5,6,7,7,9,8,9,10};
        findDuplicatesUsingHashMap(arr);
    }

    private static void findDuplicatesUsingHashMap(int[] inputArray){

        Map<Integer,Integer> integerMap = new HashMap<>();

        for(int key :  inputArray){
            if(!integerMap.containsKey(key)){
                integerMap.put(key,1);
            }else {
                integerMap.put(key,integerMap.get(key) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = integerMap.entrySet();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : entrySet) {
            if(integerIntegerEntry.getValue() > 1){
                System.out.println("Duplicate :" + integerIntegerEntry.getKey() + " times: " +integerIntegerEntry.getValue());
             }
        }
    }
}
