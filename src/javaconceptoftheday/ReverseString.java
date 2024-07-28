package javaconceptoftheday;

// https://javaconceptoftheday.com/java-program-to-reverse-a-string/#google_vignette

import java.sql.SQLOutput;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

        // Method 1 Using String Builder Method
        usingStringBuffer();
        usingToCharArray();
        System.out.println(usingToRecursiveMethod("AnupKushwaha"));
        System.out.println(usingStack());
    }

    private static void usingStringBuffer() {
        StringBuffer sbf = new StringBuffer("AnupKushwaha");
        System.out.println(sbf.reverse());
    }

    private static void usingToCharArray() {

        /*
        *
        * Scanner scanner = new Scanner(System.in);
          String Str = scanner.nextLine();
          char[] arr = Str.toCharArray();
        * */

        String name = "AnupKushwaha";
        char[] charArray = name.toCharArray();
        //String rev = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
            // rev = rev + charArray[i]
        }
        System.out.println();
    }

    private static String usingToRecursiveMethod(String string) {
        if (string.length() <= 1) {
            return string;
        }
        return usingToRecursiveMethod(string.substring(1)) + string.charAt(0);
    }

    public static String usingStack() {

        String string = "AnupKushwaha";

        //initializing a stack of type char
        Stack<Character> stack = new Stack<>();

        for (char c : string.toCharArray()) {
            //pushing all the characters
            stack.push(c);
        }

        String temp = "";

        while (!stack.isEmpty()) {
            //popping all the chars and appending to temp
            temp = temp + stack.pop();
        }

        return temp;
    }
}
