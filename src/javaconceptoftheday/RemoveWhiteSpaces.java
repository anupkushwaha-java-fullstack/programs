package javaconceptoftheday;

import java.util.Scanner;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string to remove white spaces");
        String inputString = scanner.nextLine();

        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
        System.out.println("Input String : " + inputString);
        System.out.println("Input String Without Spaces : "+ stringWithoutSpaces);

        char[] charArray = inputString.toCharArray();
        String stringWithoutSpaces2 = "";

        System.out.println("---- Using Foor Loop  Method :---- ");
        for(int i= 0; i < charArray.length ; i++){
           if( (charArray[i] != ' ') && (charArray[i] != '\t') ){
               stringWithoutSpaces2 = stringWithoutSpaces2 + charArray[i];
           }
       }

        System.out.println("Input String Without Spaces : "+ stringWithoutSpaces2);
        scanner.close();
    }
}
